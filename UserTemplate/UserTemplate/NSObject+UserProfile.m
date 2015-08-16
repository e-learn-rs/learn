//
//  NSObject+UserProfile.m
//  UserTemplate
//
//  Created by Robin on 17/08/15.
//  Copyright (c) 2015 Robin. All rights reserved.
//

#import "NSObject+UserProfile.h"

@implementation NSObject (UserProfile)

-(void) UserProfile:(NSString *)username :(NSString *)mobileNumber :(NSString *)location
{
    self.userName = username;
    self.mobileNumber = mobileNumber;
    self.locality = location;
}
@end
