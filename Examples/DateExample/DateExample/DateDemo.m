//
//  DateDemo.m
//  DateExample
//
//  Created by Robin on 11/08/15.
//  Copyright (c) 2015 Robin. All rights reserved.
//

#import "DateDemo.h"

@implementation DateDemo

-(void)printTodayDate
{
    NSDate *date = [NSDate date];
    NSLog(@"Today date is %@",date);
}

-(void)printLaterDate :(int)interval
{
    NSDate *date = [NSDate date];
    NSDate *date2 = [date laterDate:date];
     NSLog(@"Later date is %@",date2);
    
}

-(void)printFormattedDate:(NSString *)format
{
     NSDate *date = [NSDate date];
    NSDateFormatter *formatter = [[NSDateFormatter alloc]init];
    [formatter setDateFormat:format];
    NSString *dateString = [formatter stringFromDate:date];
    NSLog(@"Formatted date is %@",dateString);
    
}
@end
