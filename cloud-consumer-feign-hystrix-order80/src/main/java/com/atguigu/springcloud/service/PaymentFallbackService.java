package com.atguigu.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author:lilun
 * @create: 2022-07-21 15:01
 */
@Component
public class PaymentFallbackService implements PaymentService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_OK , (┬＿┬)";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_TimeOut , (┬＿┬)";
    }
}
