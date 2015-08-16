//
//  CustomView.m
//  CustomUIView
//
//  Created by Robin on 13/08/15.
//  Copyright (c) 2015 Robin. All rights reserved.
//

#import "CustomView.h"

@implementation CustomView
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
    
    [self addGestureRecognizer:[[UILongPressGestureRecognizer alloc]initWithTarget:self action:@selector(changeColor)]];
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
