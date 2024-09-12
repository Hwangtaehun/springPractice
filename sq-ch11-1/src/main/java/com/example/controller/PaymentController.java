package com.example.controller;

import com.example.model.Payment;
import com.example.proxy.PaymentProxy;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.UUID;
import java.util.logging.Logger;

public class PaymentController {
    private final PaymentProxy paymentProxy;

    public PaymentController(PaymentProxy paymentProxy){
        this.paymentProxy = paymentProxy;
    }

    @PostMapping("/payment")
    public Payment createPayment(
            @RequestBody Payment payment
    ){
        String requestId = UUID.randomUUID().toString();
        return paymentProxy.createPayment(requestId, payment);
    }
}
