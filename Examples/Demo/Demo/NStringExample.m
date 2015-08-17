//
//  NStringExample.m
//  Demo
//
//  Created by Robin on 12/08/15.
//  Copyright (c) 2015 Robin. All rights reserved.
//

#import "NStringExample.h"

@implementation NStringExample

-(NSString *)combineStrings:(NSString *)stringOne withString:(NSString *)stringTwo
{
    NSMutableString *resultString = [[NSMutableString alloc]initWithString:stringOne];
    [resultString appendString:stringTwo]; 
    return resultString;
}
@end
