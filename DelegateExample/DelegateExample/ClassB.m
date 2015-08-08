//
//  ClassB.m
//  DelegateExample
//
//  Created by Robin on 03/08/15.
//  Copyright (c) 2015 Robin. All rights reserved.
//

#import "ClassB.h"

@implementation ClassB

-(void) startDownload
{
    NSLog(@"Downlaod started");
    [self performSelector:@selector(finishDownload) withObject:nil afterDelay:3];
}

-(void) finishDownload
{
    NSLog(@"Finishing download");
    if([self.downloadDelegate respondsToSelector:@selector(downloadCompleted)])
    {
        NSLog(@"Downlaod finished");
        [self.downloadDelegate downloadCompleted];
    }
}


@end
