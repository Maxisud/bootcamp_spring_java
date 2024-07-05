package org.example.tugas.tugas3;

import java.util.Date;

public class Payment {

    public String bankName;
    public Integer virtualAccountNumber;
    public Integer creditCardNumber;
    public double amount;
    public Date dueDate;
    public boolean timeout;


    public static void main(String[] args) {
        Payment bayar = new Payment();
        bayar.virtualAccountNumber = null;
        bayar.creditCardNumber = 123123123;
        if (bayar.isValidateNumber(bayar.virtualAccountNumber, bayar.creditCardNumber)){
            System.out.println("Pembayaran Valid");
        } else {
            System.out.println("Pembayaran Invalid");
        }
    }

    private boolean isValidateNumber(Integer virtualAccountNumber, Integer creditCardNumber){
        if (null != virtualAccountNumber || null != creditCardNumber){
            return true;
        }
        return false;
    }
}
