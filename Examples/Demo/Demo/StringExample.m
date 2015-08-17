//
//  StringExample.m
//  Demo
//
//  Created by Robin on 06/08/15.
//  Copyright (c) 2015 Robin. All rights reserved.
//

#import "StringExample.h"

@implementation StringExample

-(void)printStringLength:(NSString *)str
{
    NSLog(@"Length of string is %lu", [str length]);
}

-(NSString *)replaceString :(NSString *)str replace:(NSString *)replaceString withString:(NSString *)toBeReplacedString
{
    return [str stringByReplacingOccurrencesOfString:replaceString withString:toBeReplacedString];
}

-(NSString *)combineStrings:(NSString *)stringOne withString:(NSString *)stringTwo
{
    NSMutableString *resultString = [[NSMutableString alloc]initWithString:stringOne ];
    [resultString appendString:@" "];
    [resultString appendString:stringTwo]; 
    return resultString;
}

-(NSString *)combineStringsUsingFormat:(NSString *)stringOne withString:(NSString *)stringTwo
{
    return [NSString stringWithFormat:@"%@ %@",stringOne,stringTwo]; 
}

-(NSString *)getStringBeforeFirstSpaceInAString:(NSString *)input
{
    NSArray *array = [input componentsSeparatedByCharactersInSet:[NSCharacterSet whitespaceCharacterSet]];
    return [array objectAtIndex:0];
}

@end
