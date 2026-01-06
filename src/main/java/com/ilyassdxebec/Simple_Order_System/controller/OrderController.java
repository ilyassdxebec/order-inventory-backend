package com.ilyassdxebec.Simple_Order_System.controller;

import com.ilyassdxebec.Simple_Order_System.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
    @PostMapping ("/Orders")
    public String CreateOrder(@RequestBody Long ID,int quantity){

    }
}
