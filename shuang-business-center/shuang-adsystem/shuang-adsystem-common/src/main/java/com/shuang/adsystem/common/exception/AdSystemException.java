package com.shuang.adsystem.common.exception;

import com.shuang.adsystem.common.errorcode.AdSystemErrorCodeEnum;
import com.shuang.commons.support.exception.BizException;
import lombok.Getter;

/**
 * 业务层异常类
 */
@Getter
public class AdSystemException extends BizException {

    private int code;

    private String message;

    public AdSystemException() {
        super();
    }

    public AdSystemException(final AdSystemErrorCodeEnum errorCodeEnum) {
        super(errorCodeEnum.getMessage());
        this.code = errorCodeEnum.getCode();
        this.message = errorCodeEnum.getMessage();
    }

    public AdSystemException(final AdSystemErrorCodeEnum errorCodeEnum, final Throwable cause) {
        super(errorCodeEnum.getMessage(), cause);
    }
}
