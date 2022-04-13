package com.shuang.api.gateway.common.exception;

import com.shuang.api.gateway.common.errorcode.ApiGateWayErrorCodeEnum;
import com.shuang.commons.support.exception.BizException;
import lombok.Getter;

/**
 * 业务层异常类
 */
@Getter
public class ApiGateWayException extends BizException {

    private int code;

    public ApiGateWayException() {
        super();
    }

    public ApiGateWayException(final ApiGateWayErrorCodeEnum errorCodeEnum) {
        super(errorCodeEnum.getMessage());
        this.code = errorCodeEnum.getCode();
    }

    public ApiGateWayException(final ApiGateWayErrorCodeEnum errorCodeEnum, final Throwable cause) {
        super(errorCodeEnum.getMessage(), cause);
    }
}
