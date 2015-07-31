//
//  main.m
//  Demo
//
//  Created by Robin on 31/07/15.
//  Copyright (c) 2015 Robin. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "Calculator.h"

int main(int argc, const char * argv[]) {
    @autoreleasepool
    {
        Calculator * calculator = [[Calculator alloc]init];
        NSLog(@"Sum of numbers %f, %f is %f",10.4,15.2,[calculator addNumbers:10.4 And:15.2]);
        NSLog(@"Multiplication of numbers %f %f is %f",313.2,2423.3,[calculator multiplyNumbers:313.2 And:2423]);
    }
    return 0;
}
