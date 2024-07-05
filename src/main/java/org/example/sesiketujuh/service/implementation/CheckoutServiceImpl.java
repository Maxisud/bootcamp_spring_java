package org.example.sesiketujuh.service.implementation;

import org.example.sesiketujuh.model.Address;
import org.example.sesiketujuh.model.CheckoutRequest;
import org.example.sesiketujuh.service.CheckoutService;
import org.example.sesiketujuh.service.PaymentService;

public class CheckoutServiceImpl implements CheckoutService {

    private PaymentService paymentService;

    public CheckoutServiceImpl(PaymentService paymentService){
        this.paymentService = paymentService;
    }


    // Method Override -> Implementasi dari konsep polymorphism -> Runtime Polymorphism

    @Override
    public void process(CheckoutRequest request) {


        //LOGIC
        // 1. Validasi Alamat
        /*
        cek apakah alamatnya kosong atau tidak
        */

        Address address = request.getAddress();

        String destination = address.getDestination();

        boolean isValidateAddress = isValidateAddress(request.getAddress());

        // 2. Proses Pembayaran

        String response = paymentService.paymentProcess(request.getPaymentMethod());

        boolean isPaymentSuccess = isPaymentSuccess(response);

    }

    private boolean isValidateAddress(Address address){
        return !address.getDestination().isEmpty();
    }

    private boolean isPaymentSuccess(String response){
        return response.equals("Success");
    }
}
