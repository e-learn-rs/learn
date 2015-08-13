//
//  main.m
//  Demo
//
//  Created by Robin on 31/07/15.
//  Copyright (c) 2015 Robin. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "Calculator.h"
#import "ArrayExample.h"
#import "StringExample.h"




int main(int argc, const char * argv[]) {
    @autoreleasepool
    {
       /* Calculator * calculator = [[Calculator alloc]init];
        NSString *strObject = @"Robin Singh";
        NSLog(@"Sum of numbers %f, %f is %f",10.4,15.2,[calculator addNumbers:10.4 And:15.2]);
        NSLog(@"Multiplication of numbers %f %f is %f",313.2,2423.3,[calculator multiplyNumbers:313.2 And:2423]); */
       /* ArrayExample *example = [[ArrayExample alloc]init];
        //[example enumerateArrayObjects];
        [example printLengthOfArray];
        [example printLengthOfStringInArray];
        StringExample *strExample = [[StringExample alloc]init];
        [strExample printStringLength:@"Hi there!!!"];
        NSString * str = @"Sometimes it happens like sometimes";
        NSLog(@"%@",[strExample replaceString:str replace:@"sometimes" withString:@"Everytime"]); */
        
        StringExample *example = [[StringExample alloc]init];
        NSString *string1 = @"Robin";
        NSString *string2 = @"Singh";
        NSLog(@"Combined Stirng is %@",[example combineStrings:string1 withString:string2]);
        
        NSLog(@"Combined Stirng using format is %@",[example combineStringsUsingFormat:string1 withString:string2]);
        
    }
    return 0;
}
