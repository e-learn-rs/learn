//
//  NSArray+Length.m
//  Demo
//
//  Created by Robin on 07/08/15.
//  Copyright (c) 2015 Robin. All rights reserved.
//

#import "NSArray+Length.h"

@implementation NSArray (Length)

-(int)getArrayCount
{
    int count = 0 ;
    for(id obj in self)
    {
        count++;
    }
    return count; 
}

-(int)getCountOfStringObjectsInArray
{
    int count = 0;
    for(id obj in self)
    {
        if ([obj isKindOfClass:[NSString class]]) {
            count++;
        }
    }
    return count;
}
@end
