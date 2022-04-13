package com.shuang.commons.lock.errorcode;

import com.shuang.commons.support.code.ErrorCode;
import com.shuang.commons.support.constant.CommonConstant;
import com.shuang.commons.support.il8n.LocaleUtils;

/**
 * 业务错误码
 * @author: shuang
 */
public enum LockErrorCode implements ErrorCode {

    /**
     * 加锁失败
     */
    LOCK_FAIL(15000),
    /**
     * 解锁失败
     */
    UNLOCK_FAIL(15001),

    ;

    private final int code;

    LockErrorCode(final int code) {
        this.code = code;
    }

    @Override
    public int getCode() {
        return this.code;
    }

    @Override
    public String getMessage() {
        return LocaleUtils.getMessage(CommonConstant.BIZCODEPREFIX+code);
    }

    public String getMessage(final Object... args) {
        return LocaleUtils.getMessage(CommonConstant.BIZCODEPREFIX+code, args);
    }

    @Override
    public String toString() {
        return "[" + this.getCode() + "]" + this.getMessage();
    }

}
