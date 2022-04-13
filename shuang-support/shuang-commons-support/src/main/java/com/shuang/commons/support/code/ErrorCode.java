package com.shuang.commons.support.code;

/**
 * 错误code
 * @author: shuang
 **/
public interface ErrorCode{
    /**
     * 错误代号
     */
    int getCode();

    /**
     * 具体信息
     */
    String getMessage();
}
