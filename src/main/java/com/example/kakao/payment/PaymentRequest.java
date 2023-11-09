package com.example.kakao.payment;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

public class PaymentRequest {
    

    @Getter
    @Setter
    @ToString
    public static class paymentReqDTO  {

        private int cookieAmount;
        private int userId;
    }
}
