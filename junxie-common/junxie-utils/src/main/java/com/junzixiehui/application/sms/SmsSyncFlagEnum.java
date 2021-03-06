package com.junzixiehui.application.sms;


import lombok.Getter;

/**
 * 发送标志枚举
 *
 * @description:
 * @date created in 9:55 2017/10/26
 */
public enum SmsSyncFlagEnum {
    SYNC(1),
    ASYNC(0);

    SmsSyncFlagEnum(int flag) {
        this.flag = flag;
    }

    @Getter
    private int flag;
}
