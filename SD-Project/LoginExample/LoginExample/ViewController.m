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
     [self.view addGestureRecognizer:[[UITapGestureRecognizer alloc]initWithTarget:self action:@selector(tapped)]];
    // Do any additional setup after loading the view, typically from a nib.
}

- (void)didReceiveMemoryWarning {
    [super didReceiveMemoryWarning];
    // Dispose of any resources that can be recreated.
}

-(IBAction)clickOnSubmit:(id)sender
{
      numberOfAttempts++;

    if (numberOfAttempts > maximumAttempts) {
        UIAlertView *alert = [[UIAlertView alloc]initWithTitle:@"SORRY" message:@"Your attempts have exceeded maximum limit of 3" delegate:self cancelButtonTitle:@"OK" otherButtonTitles:nil];
        [alert show];
    }
  
    else
    {
    NSString *userName = userNameField.text;
    NSString *password = passwordField.text;
    if ([self validateUser:userName andPassword:password])
    {
        successLabel.text = @"Login successful";
        successLabel.textColor = [UIColor whiteColor];
    }
    }
    
}

-(BOOL)validateUser:(NSString*) username andPassword :(NSString*)password
{
    if (Nil == username || username.length == 0) {
        UIAlertView *alert = [[UIAlertView alloc]initWithTitle:@"WARNING" message:[NSString stringWithFormat:@"Username field can't be empty. %@",[self getAttemptsRemaining]] delegate:self cancelButtonTitle:@"OK" otherButtonTitles:nil];
        [alert show];
        return false;
    }
    if(Nil == password || password.length == 0)
    {
        UIAlertView *alert = [[UIAlertView alloc]initWithTitle:@"WARNING" message:[NSString stringWithFormat:@"Password field can't be empty. %@",[self getAttemptsRemaining]] delegate:self cancelButtonTitle:@"OK" otherButtonTitles:nil];
        [alert show];
        return false;
    }
    if ([username isEqualToString:user] && [password isEqualToString:pwd]) {
        return true;
    }
    else{
        UIAlertView *alert = [[UIAlertView alloc]initWithTitle:@"WARNING" message:[NSString stringWithFormat:@"Invalid username or password. %@",[self getAttemptsRemaining]] delegate:self cancelButtonTitle:@"OK" otherButtonTitles:nil];
        [alert show];
        return false;

    }
        return false;
}

-(NSString *)getAttemptsRemaining
{
    int attemptsLeft = maximumAttempts - numberOfAttempts;
    return [NSString stringWithFormat:@"You have %d attempts left",attemptsLeft];
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
