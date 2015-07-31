//
//  ExampleOne.m
//  Start
//
//  Created by Robin on 29/07/15.
//  Copyright (c) 2015 Robin. All rights reserved.
//

#import "ExampleOne.h"

@implementation ExampleOne

-(void)examplePublicMethod
{
    NSLog(@"In Example public");
}

-(void)exampleInstanceMethod
{
    NSLog(@"In example instance");
}

+(int)getSumOfNumber:(int)a andNumber:(int)b
{
    return a+b; 
}


@end 
