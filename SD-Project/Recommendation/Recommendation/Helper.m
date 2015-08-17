//
//  Helper.m
//  Recommendation
//
//  Created by Robin on 18/08/15.
//  Copyright (c) 2015 Robin. All rights reserved.
//

#import "Helper.h"

@implementation Helper


+(NSString *)getStringBeforeFirstSpaceInAString:(NSString *)input
{
    NSArray *array = [input componentsSeparatedByCharactersInSet:[NSCharacterSet whitespaceCharacterSet]];
    return [array objectAtIndex:0];
}
@end
