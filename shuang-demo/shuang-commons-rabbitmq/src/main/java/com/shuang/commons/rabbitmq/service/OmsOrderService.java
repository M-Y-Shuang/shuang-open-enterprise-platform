package com.shuang.commons.rabbitmq.service;

import com.shuang.commons.rabbitmq.model.OrderParam;
import com.shuang.commons.support.response.ResponseResult;
import org.springframework.transaction.annotation.Transactional;

/**
 * 订单管理接口
 */
public interface OmsOrderService {
    /**
     * 下单生成订单
     * @param orderParam
     * @return
     */
    @Transactional
    ResponseResult generateOrder(OrderParam orderParam);
    /**
     * 取消单个超时订单
     * @param orderId
     */
    @Transactional
    void cancelOrder(Long orderId);
}