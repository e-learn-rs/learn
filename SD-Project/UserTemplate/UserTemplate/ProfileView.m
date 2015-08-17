//
//  ProfileView.m
//  UserTemplate
//
//  Created by Robin on 16/08/15.
//  Copyright (c) 2015 Robin. All rights reserved.
//

#import "ProfileView.h"
#import "NSObject+UserProfile.h"

@interface ProfileView ()
{
    IBOutlet UIImageView * profilePicField;
    IBOutlet UILabel * userNameField;
    IBOutlet UILabel * locationField;
    IBOutlet UILabel * mobileNumber;
    NSString *gender;
}

@end

@implementation ProfileView


-(void)awakeFromNib
{
    gender = @"male";
    if ([gender isEqualToString:@"male"]) {
        profilePicField.image = [UIImage imageNamed:@"male.jpg"];
    }
    else{
         profilePicField.image = [UIImage imageNamed:@"female.jpg"];
    }
    
    NSString * username =[NSString stringWithFormat:@"robin singh"];
    userNameField.text = [username uppercaseString];
    locationField.text = [NSString stringWithFormat:@"Govindpuri Extension"];
    mobileNumber.text = [NSString stringWithFormat:@"9899181770"];
    
}

-(IBAction)makeACall:(id)sender
{
    UIAlertView *alert = [[UIAlertView alloc]initWithTitle:@"Message" message:[NSString stringWithFormat:@"Call number %@ ? ",mobileNumber.text] delegate:self cancelButtonTitle:@"OK" otherButtonTitles:@"Cancel",nil];
    [alert setTag:0];
    [alert show];
}

-(void)alertView:(UIAlertView *)alertView clickedButtonAtIndex:(NSInteger)buttonIndex
{
        if (buttonIndex == 0)
        {
            if (alertView.tag == 0) {
                
            UIAlertView *alert = [[UIAlertView alloc]initWithTitle:@"Message" message:[NSString stringWithFormat:@"Calling number %@  ",mobileNumber.text] delegate:self cancelButtonTitle:@"OK" otherButtonTitles:nil];
            [alert setTag:1];
            [alert show];
               
            return;
            }
        }
        else
        {
            
        }
    
}

@end
