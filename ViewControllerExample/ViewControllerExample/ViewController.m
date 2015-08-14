//
//  ViewController.m
//  ViewControllerExample
//
//  Created by Robin on 09/08/15.
//  Copyright (c) 2015 Robin. All rights reserved.
//

#import "ViewController.h"
#import "SecondViewController.h"

@interface ViewController ()
{
    
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

-(IBAction)submit:(id)sender
{
    SecondViewController *svc = [self.storyboard instantiateViewControllerWithIdentifier:@"SecondViewController"];
    [self.view removeConstraints:self.view.constraints];
    [self addChildViewController:svc];
    [self.view addSubview:svc.view];
    
}



@end
