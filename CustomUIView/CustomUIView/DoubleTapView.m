//
//  DoubleTapView.m
//  CustomUIView
//
//  Created by Robin on 14/08/15.
//  Copyright (c) 2015 Robin. All rights reserved.
//

#import "DoubleTapView.h"

@implementation DoubleTapView
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
    
    UITapGestureRecognizer * tap = [[UITapGestureRecognizer alloc]initWithTarget:self action:@selector(changeColor)];
    tap.numberOfTapsRequired = 2;
    
    [self addGestureRecognizer:tap]; 
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

-(void)changeColor
{
    redColor = (rand()%255);
    greenColor = (rand()%255);
    blueColor = (rand()%255);
    
    self.backgroundColor = [UIColor colorWithRed:redColor/255.0 green:greenColor/255.0 blue:blueColor/255.0 alpha:1.0];
    
}

@end
