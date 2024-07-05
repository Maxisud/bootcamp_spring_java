package org.example.sesiketujuh.service.implementation;

import org.example.sesiketujuh.model.PaymentMethod;
import org.example.sesiketujuh.service.PaymentService;

public class PaymentServiceImpl implements PaymentService{
    @Override
    public String paymentProcess(PaymentMethod paymentMethod) {
        return "Success";
    }
}
