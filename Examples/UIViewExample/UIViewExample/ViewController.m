//
//  ViewController.m
//  UIViewExample
//
//  Created by Robin on 09/08/15.
//  Copyright (c) 2015 Robin. All rights reserved.
//

#import "ViewController.h"

@interface ViewController ()
{
    IBOutlet UIView * outerview;
}

@end

@implementation ViewController

- (void)viewDidLoad {
    [super viewDidLoad];
    // Do any additional setup after loading the view, typically from a nib.
}

- (void)didReceiveMemoryWarning {
    [super didReceiveMemoryWarning];
    // Dispose of any resources that can be recreated.
}

-(IBAction)submit :(id)sender
{
    CGRect rect = CGRectMake(rand()%300, rand()%300, rand()%300, rand()%300);
    outerview.frame =rect;
} 

@end
