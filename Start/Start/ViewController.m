//
//  ViewController.m
//  Start
//
//  Created by Robin on 28/07/15.
//  Copyright (c) 2015 Robin. All rights reserved.
//

#import "ViewController.h"

@interface ViewController ()

@end

@implementation ViewController

- (void)viewDidLoad {
    [super viewDidLoad];
    
    myLabel.text = @"SNAPDEAL LIFT";
    myLabel.backgroundColor = [UIColor blueColor];
    myLabel.textColor = [UIColor whiteColor];
    
    UIAlertView *alertView = [[UIAlertView alloc]initWithTitle:@"Alert Title" message:@"Some Message" delegate:self cancelButtonTitle:@"OK" otherButtonTitles:@"Good",@"Bad", nil];
    [alertView show];
    // Do any additional setup after loading the view, typically from a nib.
}

-(void)alertView:(UIAlertView *)alertView clickedButtonAtIndex:(NSInteger)buttonIndex
{
    NSLog(@"Button pressed at index %d", buttonIndex);
}

- (void)didReceiveMemoryWarning {
    [super didReceiveMemoryWarning];
    // Dispose of any resources that can be recreated.
}

-(void)publicMethod
{
    
}

-(void)privateMethod
{
    
}
@end
