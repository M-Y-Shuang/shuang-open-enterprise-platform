package com.shuang.commons.mail.exception;

import com.shuang.commons.support.exception.BizException;
import com.shuang.commons.mail.errorcode.MailErrorCode;
import lombok.Getter;

/**
 * 业务层异常类
 */
@Getter
public class MailException extends BizException {

    private int code;

    public MailException() {
        super();
    }

    public MailException(final MailErrorCode errorCodeEnum) {
        super(errorCodeEnum.getMessage());
        this.code = errorCodeEnum.getCode();
    }

    public MailException(final MailErrorCode errorCodeEnum, final Throwable cause) {
        super(errorCodeEnum.getMessage(), cause);
    }
}
