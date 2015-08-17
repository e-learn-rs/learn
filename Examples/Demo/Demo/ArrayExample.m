//
//  ArrayExample.m
//  Demo
//
//  Created by Robin on 05/08/15.
//  Copyright (c) 2015 Robin. All rights reserved.
//

#import "ArrayExample.h"
#import "NSArray+Length.h"

@implementation ArrayExample

-(void)enumerateArrayObjects
{
    NSArray * array = [NSArray arrayWithObjects:@"A",@"B",@"C",@"D", nil];
    [array enumerateObjectsUsingBlock:^(id obj, NSUInteger idx, BOOL *stop) {
        NSLog(@"Value at index %lu is %@",++idx,obj);
        if([obj isEqualTo:@"C"])
        {
            *stop = YES;
        }
        
    }];
}

-(void)printLengthOfArray
{
     NSArray * array = [NSArray arrayWithObjects:@"A",@"B",@"C",@"D", nil];
     NSLog(@"Length of array is %d",[array getArrayCount]);
}

-(void)printLengthOfStringInArray
{
    NSArray * array = [NSArray arrayWithObjects:@"A",@"B",@"C",@"D","@E",[NSNumber numberWithDouble:12.4], [NSNumber numberWithInt:433] , nil];
    NSLog(@"Length of String in array is %d",[array getCountOfStringObjectsInArray]);
}
@end
