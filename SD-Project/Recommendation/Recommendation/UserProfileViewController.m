//
//  UserProfileViewController.m
//  Recommendation
//
//  Created by Robin on 17/08/15.
//  Copyright (c) 2015 Robin. All rights reserved.
//

#import "UserProfileViewController.h"

@implementation UserProfileViewController
{
    IBOutlet UILabel * userNameLabel;
}

@synthesize username;

-(void)viewDidLoad
{
    userNameLabel.text = username;
}
@end
