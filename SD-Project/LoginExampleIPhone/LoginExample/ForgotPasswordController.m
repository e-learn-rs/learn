//
//  ForgotPasswordController.m
//  LoginExample
//
//  Created by Robin on 16/08/15.
//  Copyright (c) 2015 Robin. All rights reserved.
//

#import "ForgotPasswordController.h"

@interface ForgotPasswordController()
{
    IBOutlet UITextField *emailIdField;
    NSString *emailId;
}
@end

@implementation ForgotPasswordController

-(void)viewDidLoad
{
   
}
-(IBAction)sendPassword:(id)sender
{
     emailId = emailIdField.text;
    if (Nil == emailId || emailId.length == 0) {
        UIAlertView *alert = [[UIAlertView alloc]initWithTitle:@"WARNING" message:@"Please enter email-id" delegate:self cancelButtonTitle:@"OK" otherButtonTitles:nil];
        [alert show];
    }
    else if (![self validateEmailId]) {
        UIAlertView *alert = [[UIAlertView alloc]initWithTitle:@"WARNING" message:@"INCORRECT EMAIL ID" delegate:self cancelButtonTitle:@"OK" otherButtonTitles:nil];
        [alert show];
    }
    else{
        UIAlertView *alert = [[UIAlertView alloc]initWithTitle:@"SUCCESS" message:@"Password has beed sent to your email-id" delegate:self cancelButtonTitle:@"OK" otherButtonTitles:nil];
        [alert show];
        emailIdField.text = @"";
    }
    
}

-(BOOL)validateEmailId
{
 
    return YES;
}

@end
