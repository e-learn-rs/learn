//
//  User.h
//  Recommendation
//
//  Created by Robin on 17/08/15.
//  Copyright (c) 2015 Robin. All rights reserved.
//

#import <Foundation/Foundation.h>

@interface User : NSObject

@property(nonatomic,strong) NSString *username;
@property(nonatomic,strong) NSString *location;
@property(nonatomic,strong) NSString *mobileNumber;
@property(nonatomic,strong) NSString *imageFile;

-(User *)getUserWithName:(NSString *)userName location :(NSString *)location contact:(NSString *)contact imageName:(NSString *)image;

@end
