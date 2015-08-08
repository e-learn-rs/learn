//
//  StringExample.h
//  Demo
//
//  Created by Robin on 06/08/15.
//  Copyright (c) 2015 Robin. All rights reserved.
//

#import <Foundation/Foundation.h>

@interface StringExample : NSObject

-(void) printStringLength :(NSString *)str;
-(NSString *)replaceString :(NSString *)str replace:(NSString *)replaceString withString:(NSString *)toBeReplacedString;
@end
