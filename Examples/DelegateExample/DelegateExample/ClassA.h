//
//  ClassA.h
//  DelegateExample
//
//  Created by Robin on 03/08/15.
//  Copyright (c) 2015 Robin. All rights reserved.
//

#import <Foundation/Foundation.h>

@protocol DemoProtocol <NSObject>

-(void)downloadCompleted;

@end

@interface ClassA : NSObject<DemoProtocol>

-(void)onDownloadPressed;
 
@end
