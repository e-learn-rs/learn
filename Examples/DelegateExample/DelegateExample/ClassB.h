//
//  ClassB.h
//  DelegateExample
//
//  Created by Robin on 03/08/15.
//  Copyright (c) 2015 Robin. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "ClassA.h"
@interface ClassB : NSObject

@property(nonatomic,assign)id<DemoProtocol>downloadDelegate;
-(void) startDownload;
@end
