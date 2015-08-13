//
//  ViewController.m
//  LoginExample
//
//  Created by Robin on 09/08/15.
//  Copyright (c) 2015 Robin. All rights reserved.
//

#import "ViewController.h"

@interface ViewController () <UITextFieldDelegate>
{
    IBOutlet UILabel * successLabel;
    IBOutlet UITextField *userNameField;
    IBOutlet UITextField *passwordField;
    
    NSString *  user ;
    NSString *  pwd;
    
    int numberOfAttempts;
    int maximumAttempts ;
    
}

@end

@implementation ViewController

- (void)viewDidLoad {
    [super viewDidLoad];
     user  = @"robin.singh@snapdeal.com";
     pwd = @"snap123";
     maximumAttempts = 3;
     numberOfAttempts = 0;
     userNameField.delegate = self;
     passwordField.delegate = self;
     [self.view addGestureRecognizer:[[UITapGestureRecognizer alloc]initWithTarget:self action:@selector(tapped)]];
    // Do any additional setup after loading the view, typically from a nib.
}

- (void)didReceiveMemoryWarning {
    [super didReceiveMemoryWarning];
    // Dispose of any resources that can be recreated.
}

-(IBAction)clickOnSubmit:(id)sender
{
    if (numberOfAttempts > 3) {
        UIAlertView *alert = [[UIAlertView alloc]initWithTitle:@"WARNING" message:@"Your attempts have exceeded maximum limit of 3" delegate:self cancelButtonTitle:@"OK" otherButtonTitles:nil];
        [alert show];
        
    }
    numberOfAttempts++;
    NSString *userName = userNameField.text;
    NSString *password = passwordField.text;
    if ([self validateUser:userName andPassword:password])
    {
        successLabel.text = @"Login successful";
        successLabel.textColor = [UIColor whiteColor];
    }
    else
    {
        successLabel.textColor = [UIColor redColor];
        int attemptsLeft = maximumAttempts - numberOfAttempts;
        successLabel.text = [NSString stringWithFormat:@"Invalid username or password.Please try again You have %d attempts left",attemptsLeft];
    }
    
}

-(BOOL)validateUser:(NSString*) username andPassword :(NSString*)password
{
    if ([username isEqualToString:user] && [password isEqualToString:pwd]) {
        return true;
    }
        return false;
}

-(BOOL)textFieldShouldEndEditing:(UITextField *)textField
{
    return YES;
}

-(BOOL)textFieldShouldReturn:(UITextField *)textField
{
    [textField resignFirstResponder];
    return YES;
}

-(BOOL)textField:(UITextField *)textField shouldChangeCharactersInRange:(NSRange)range replacementString:(NSString *)string
{
    return YES;
}

-(void)tapped
{
    [userNameField resignFirstResponder];
    [passwordField resignFirstResponder];
}


@end
