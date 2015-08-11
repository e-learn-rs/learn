//
//  DateDemo.h
//  DateExample
//
//  Created by Robin on 11/08/15.
//  Copyright (c) 2015 Robin. All rights reserved.
//

#import <Foundation/Foundation.h>

@interface DateDemo : NSObject

-(void)printTodayDate;
-(void)printLaterDate :(int)interval;
-(void)printFormattedDate:(NSString *)format;
@end
