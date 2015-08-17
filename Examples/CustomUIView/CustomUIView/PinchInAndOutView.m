//
//  PinchInAndOutView.m
//  CustomUIView
//
//  Created by Robin on 14/08/15.
//  Copyright (c) 2015 Robin. All rights reserved.
//

#import "PinchInAndOutView.h"

@implementation PinchInAndOutView
{
    float redColor;
    float greenColor;
    float blueColor;
}

-(void)awakeFromNib
{
    redColor = 0.0;
    greenColor = 0.0;
    blueColor = 0.0;
    self.backgroundColor = [UIColor colorWithRed:100/255.0 green:100/255.0 blue:100/255.0 alpha:1.0];
    
    [self addGestureRecognizer:[[UIPinchGestureRecognizer alloc]initWithTarget:self action:@selector(changeColor:)]];
}

-(void)touchesBegan:(NSSet *)touches withEvent:(UIEvent *)event
{
    if (event.type == UIEventTypeTouches) {
        NSLog(@"Touches has begun");
    }
}

-(void)touchesMoved:(NSSet *)touches withEvent:(UIEvent *)event
{
    if (event.type == UIEventTypeTouches) {
        NSLog(@"Touches are moved");
    }
}

-(void)changeColor:(UIPinchGestureRecognizer *)gesture
{
    float value = gesture.scale;
    if (value > 1) {
        NSLog(@"Pinch out");
    }
    else
    {
        NSLog(@"Pinch in");
    }
}

@end
