//
//  User.m
//  Recommendation
//
//  Created by Robin on 17/08/15.
//  Copyright (c) 2015 Robin. All rights reserved.
//

#import "User.h"

@implementation User

-(User *)getUserWithName:(NSString *)userName location :(NSString *)location contact:(NSString *)contact imageName:(NSString *)image
{
    self.username = userName;
    self.location = location;
    self.mobileNumber = contact;
    self.imageFile = image;
    return self;
}



@end
