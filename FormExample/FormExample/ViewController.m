//
//  ViewController.m
//  FormExample
//
//  Created by Robin on 15/08/15.
//  Copyright (c) 2015 Robin. All rights reserved.
//

#import "ViewController.h"

@interface ViewController () <UITextFieldDelegate,UIPickerViewDelegate,UIPickerViewDataSource>
{
    IBOutlet UITextField * nameField;
    IBOutlet UITextField * mobileField;
    IBOutlet UITextField * emailField;
    IBOutlet UIPickerView * locationPickerView;
    IBOutlet UIImageView * imageField;
    NSArray *locationArray;
}

@end

@implementation ViewController

- (void)viewDidLoad {
    nameField.delegate = self;
    nameField.tag = 1;
    mobileField.delegate = self;
    mobileField.tag = 2;
    emailField.delegate = self;
    locationPickerView.delegate =self;
    locationPickerView.dataSource = self;
    imageField.image = [UIImage imageNamed:@"rbn.jpg"];
    [super viewDidLoad];
    [self.view addGestureRecognizer: [[UITapGestureRecognizer alloc]initWithTarget:self action:@selector(tapped)]];
    locationArray = [NSArray arrayWithObjects:@"Lajpat Nagar", @"Kalka Ji", @"New Delhi",nil]; 
    // Do any additional setup after loading the view, typically from a nib.
}

- (void)didReceiveMemoryWarning {
    [super didReceiveMemoryWarning];
    // Dispose of any resources that can be recreated.
}

- (BOOL)textFieldShouldClear:(UITextField *)textField
{
    return YES;
}

- (void)textFieldDidBeginEditing:(UITextField *)textField
{
    [ textField clearsOnBeginEditing];
}

- (BOOL)textFieldShouldReturn:(UITextField *)textField
{
    [textField resignFirstResponder];
    return YES;
}

- (BOOL)textField:(UITextField *)textField shouldChangeCharactersInRange:(NSRange)range replacementString:(NSString *)string
{
    if ([string isEqual:@""])
    {
        return YES;
    }
    
    switch (textField.tag) {
        case 0:
            return [self validateLength:textField.text :50];
            break;
        
        // tag 1 is for name field
        case 1:
            if (![self validateLength:textField.text :30])
            {
                return NO;
            }
            else if ([string isEqualToString:@"0"])
            {
                    return NO;
            }
            else if ([string intValue] != 0)
            {
                    return NO;
            }

            break;
        
          // tag 2 is for mobile field
          case 2:
            if (![self validateLength:textField.text :30])
            {
                return NO;
            }
            if ([string isEqualToString:@"0"]) {
                return YES;
            }
            else if ([string intValue] == 0) {
                return NO;
            }
            break;
            
        default:
            return YES;
    }
    return YES;
}



-(BOOL)validateLength:(NSString *)enteredString:(int)expectedlength
{
    if (enteredString.length < expectedlength) {
        return YES;
    }
    else
    {
        return NO;
    }
}
    
-(void)tapped
{
    [nameField resignFirstResponder];
    [mobileField resignFirstResponder];
    [emailField resignFirstResponder];
}

// returns the number of 'columns' to display.
- (NSInteger)numberOfComponentsInPickerView:(UIPickerView *)pickerView
{
    return 1;
}

// returns the # of rows in each component..
- (NSInteger)pickerView:(UIPickerView *)pickerView numberOfRowsInComponent:(NSInteger)component
{
    return locationArray.count;
}

- (NSString *)pickerView:(UIPickerView *)pickerView titleForRow:(NSInteger)row forComponent:(NSInteger)component
{
    return [locationArray objectAtIndex:row];
}

- (void)pickerView:(UIPickerView *)pickerView didSelectRow:(NSInteger)row inComponent:(NSInteger)component
{
    NSLog(@"Location selected is %@",[locationArray objectAtIndex:row]);
}

@end
