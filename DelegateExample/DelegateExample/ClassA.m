//
//  ClassA.m
//  DelegateExample
//
//  Created by Robin on 03/08/15.
//  Copyright (c) 2015 Robin. All rights reserved.
//

#import "ClassA.h"
#import "ClassB.h" 

@interface ClassA()
{
    ClassB *objB;
}
@end

@implementation ClassA




-(void)onDownloadPressed
{
    objB = [[ClassB alloc]init];
    objB.downloadDelegate = self;
    [objB startDownload];
    NSLog(@"After downloading started");
}

-(void) showToUser
{
    NSLog(@"Show to user");
}

-(void) downloadCompleted
{
    [self showToUser];
}
@end
