//
//  ViewController.m
//  Recommendation
//
//  Created by Robin on 17/08/15.
//  Copyright (c) 2015 Robin. All rights reserved.
//

#import "ViewController.h"
#import "User.h"
#import "UserTableCell.h"
#import "UserProfileViewController.h"
#import "Helper.h"

@interface ViewController ()
{
    NSArray * users;
}

@end

@implementation ViewController
@synthesize tableView;

- (void)viewDidLoad {
    [super viewDidLoad];
    // Do any additional setup after loading the view, typically from a nib.
    User *user1 = [User new];
    user1 = [user1 getUserWithName:@"Robin Singh" location:@"Kalka Ji" contact:@"9899181770" imageName:@"Robin.jpg"];
    
    User *user2 = [User new];
    user2 = [user2 getUserWithName:@"Rajesh Singla" location:@"Dwarika" contact:@"8802533042" imageName:@"Rajesh.jpg"];
    
    User *user3 = [User new];
    user3 = [user3 getUserWithName:@"Krishna Mohan" location:@"Saket" contact:@"9891387158" imageName:@"Krishna.jpg"];
    
    users = [NSArray arrayWithObjects:user1,user2,user3, nil];
    
}

- (void)didReceiveMemoryWarning {
    [super didReceiveMemoryWarning];
    // Dispose of any resources that can be recreated.
}

- (NSInteger)tableView:(UITableView *)tableView numberOfRowsInSection:(NSInteger)section
{
    return users.count;
}

- (UITableViewCell *)tableView:(UITableView *)tableView cellForRowAtIndexPath:(NSIndexPath *)indexPath
{
    static NSString *CellIdentifier = @"CustomTableCell";
    UserTableCell *cell = (UserTableCell *)[self.tableView dequeueReusableCellWithIdentifier:CellIdentifier];
    
    // Configure the cell...
    if (cell == nil) {
        cell = [[UserTableCell alloc] initWithStyle:UITableViewCellStyleDefault reuseIdentifier:CellIdentifier];
    }
    
    // Display recipe in the table cell
    User *user = [users objectAtIndex:indexPath.row];
    cell.imageView.image = [UIImage imageNamed:user.imageFile];
    cell.nameField.text = user.username;
    cell.locationField.text = user.location;
    cell.mobileNumberField.text = user.mobileNumber;
    
    return cell;
}

- (void)prepareForSegue:(UIStoryboardSegue *)segue sender:(id)sender {
    if ([segue.identifier isEqualToString:@"showUserProfile"]) {
        NSIndexPath *indexPath = [self.tableView indexPathForSelectedRow];
        UserProfileViewController *destViewController = segue.destinationViewController;
        User *user =[users objectAtIndex:indexPath.row];
        destViewController.username = user.username;
        destViewController.title = [NSString stringWithFormat:@"%@'s profile",[Helper getStringBeforeFirstSpaceInAString:user.username]];
    }
}

@end
