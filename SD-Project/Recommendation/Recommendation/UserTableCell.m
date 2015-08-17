//
//  UserTableCell.m
//  Recommendation
//
//  Created by Robin on 17/08/15.
//  Copyright (c) 2015 Robin. All rights reserved.
//

#import "UserTableCell.h"

@implementation UserTableCell

@synthesize mobileNumberField;

-(IBAction)callUser:(id)sender
{
    UIAlertView *alert = [[UIAlertView alloc]initWithTitle:@"Message" message:[NSString stringWithFormat:@"Call number %@ ? ",mobileNumberField.text] delegate:self cancelButtonTitle:@"OK" otherButtonTitles:@"Cancel",nil];
    [alert setTag:0];
    [alert show];
}


-(void)alertView:(UIAlertView *)alertView clickedButtonAtIndex:(NSInteger)buttonIndex
{
    if (buttonIndex == 0)
    {
        if (alertView.tag == 0) {
            
            UIAlertView *alert = [[UIAlertView alloc]initWithTitle:@"Message" message:[NSString stringWithFormat:@"Calling number %@  ",mobileNumberField.text] delegate:self cancelButtonTitle:@"OK" otherButtonTitles:nil];
            [alert setTag:1];
            [alert show];
            
            return;
        }
    }
}
    
    
@end
