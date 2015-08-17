//
//  ViewController.m
//  SwitchExample
//
//  Created by Robin on 10/08/15.
//  Copyright (c) 2015 Robin. All rights reserved.
//

#import "ViewController.h"

@interface ViewController ()
{
    BOOL enabled ;
}

@end

@implementation ViewController

- (void)viewDidLoad {
    enabled = true;
    [super viewDidLoad];
    // Do any additional setup after loading the view, typically from a nib.
}

- (void)didReceiveMemoryWarning {
    [super didReceiveMemoryWarning];
    // Dispose of any resources that can be recreated.
}

-(IBAction)switchAction:(id)sender
{
    UISwitch * switchView = (UISwitch*)sender;
    BOOL val = switchView.isOn;
    if (!val) {
        enabled = false;
    }
}

-(IBAction)slideValueChanges:(id)sender
{
    if (enabled) {
    UISlider * sliderView = (UISlider*)sender;
    sliderView.minimumValue = 1234.2;
    sliderView.maximumValue = 41133.4;
    NSLog(@"%f",sliderView.value);
    }
    
}

@end
