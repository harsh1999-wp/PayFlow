package com.example.PayFlow.controller;


import com.example.PayFlow.services.PaymentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment/v1")
public class PaymentController {

    PaymentService paymentService;

    public PaymentController(PaymentService paymentService){
        this.paymentService = paymentService;
    }

    @PostMapping()
    public ResponseEntity<String> createPayment(){

        paymentService.createPayment();

        return ResponseEntity.ok("Success");
    }

}