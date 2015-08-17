//
//  UserTableCell.h
//  Recommendation
//
//  Created by Robin on 17/08/15.
//  Copyright (c) 2015 Robin. All rights reserved.
//

#import <UIKit/UIKit.h>

@interface UserTableCell : UITableViewCell

@property(nonatomic,weak) IBOutlet UIImageView * profilePicField;
@property(nonatomic,weak) IBOutlet UILabel *nameField;
@property(nonatomic,weak) IBOutlet UILabel *locationField;
@property(nonatomic,weak) IBOutlet UILabel *mobileNumberField;


@end
