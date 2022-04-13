package com.shuang.commons.lock.exception;

import com.shuang.commons.lock.errorcode.LockErrorCode;
import com.shuang.commons.support.exception.BizException;
import lombok.Getter;

/**
 * 业务层异常类
 * @author: shuang
 */
@Getter
public class LockException extends BizException {

    private int code;

    public LockException() {
        super();
    }

    public LockException(final LockErrorCode errorCodeEnum) {
        super(errorCodeEnum.getMessage());
        this.code = errorCodeEnum.getCode();
    }

    public LockException(final LockErrorCode errorCodeEnum, final Throwable cause) {
        super(errorCodeEnum.getMessage(), cause);
    }
}
