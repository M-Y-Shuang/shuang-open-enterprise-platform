package com.shuang.api.gateway.client.fallback;

import com.shuang.api.gateway.client.AuthClient;
import com.shuang.auth.jwt.entity.JwtParam;
import com.shuang.auth.jwt.entity.JwtUserInfo;
import com.shuang.commons.support.response.ResponseResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import javax.servlet.http.HttpServletResponse;


/**
 * 失败后 降级处理
 */
@Slf4j
@Component
public class AuthClientFallback implements AuthClient {

    @Override
    public ResponseResult login(HttpServletResponse response, String userName, String password) {
        return null;
    }

    @Override
    public ResponseResult logout(String token) {
        return null;
    }

    @Override
    public ResponseResult generateToken(JwtUserInfo jwtUserInfo) {
        return null;
    }

    @Override
    public ResponseResult generateTokenByBO(JwtUserInfo jwtUserInfo, JwtParam jwtParam) {
        return null;
    }

    @Override
    public ResponseResult generateTokenByTime(JwtUserInfo jwtUserInfo, Long ttlMillis) {
        return null;
    }

    @Override
    public ResponseResult refreshToken(String token) {
        return null;
    }

    @Override
    public ResponseResult<Boolean> verifyToken(String token) {
        return null;
    }

    @Override
    public ResponseResult<JwtUserInfo> getUserInfo(String token) {
        return null;
    }
}