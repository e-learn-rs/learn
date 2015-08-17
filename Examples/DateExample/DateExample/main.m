//
//  main.m
//  DateExample
//
//  Created by Robin on 11/08/15.
//  Copyright (c) 2015 Robin. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "DateDemo.h"

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        
        DateDemo *demo = [[DateDemo alloc]init];
        [demo printLaterDate:12];
        
        NSString * dateFormat = @"dd-MMM-yyyy hh:mm";
        [demo printFormattedDate:dateFormat]; 
    }
    return 0;
}
