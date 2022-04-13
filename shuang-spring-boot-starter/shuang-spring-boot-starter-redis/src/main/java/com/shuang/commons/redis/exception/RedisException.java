package com.shuang.commons.redis.exception;

import com.shuang.commons.redis.errorcode.RedisErrorCode;
import com.shuang.commons.support.exception.BizException;
import lombok.Getter;

/**
 * 业务层异常类
 * @author: shuang
 */
@Getter
public class RedisException extends BizException {

    private int code;

    public RedisException() {
        super();
    }

    public RedisException(final RedisErrorCode errorCodeEnum) {
        super(errorCodeEnum.getMessage());
        this.code = errorCodeEnum.getCode();
    }

    public RedisException(final RedisErrorCode errorCodeEnum, final Throwable cause) {
        super(errorCodeEnum.getMessage(), cause);
    }
}
