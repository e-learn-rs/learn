//
//  ViewController.m
//  DelegateExample
//
//  Created by Robin on 03/08/15.
//  Copyright (c) 2015 Robin. All rights reserved.
//

#import "ViewController.h"
#import "ClassA.h"

@interface ViewController ()
{
    ClassA *objA;
}

@end

@implementation ViewController

- (void)viewDidLoad {
    [super viewDidLoad];
    
    objA = [[ClassA alloc]init];
    [objA onDownloadPressed];
    // Do any additional setup after loading the view, typically from a nib.
}

- (void)didReceiveMemoryWarning {
    [super didReceiveMemoryWarning];
    // Dispose of any resources that can be recreated.
}

@end
