#import "Uuid.h"
#import <React/RCTLog.h>
#import <Foundation/Foundation.h>


@implementation Uuid

RCT_EXPORT_MODULE()

RCT_EXPORT_METHOD(create:(RCTResponseSenderBlock)callback)
{
    NSString *uuid = [[NSUUID UUID] UUIDString];
    RCTLogInfo(@"Created a UUID");
    callback(@[[NSNull null], uuid]);
}

@end
