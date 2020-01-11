package com.ribuluo.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.ribuluo.order.service.OrderService;

/**
 * 
 * <p>Title: OrderController</p>  
 * Description:
 * @author saury  
 * @date 2020年1月10日
 */
@RestController
@RequestMapping("/order")
public class OrderController {
	
	@Autowired
	private  OrderService orderService;
	
    @GetMapping("/findByUserId/{userId}")
    public JSONObject findByUserId(@PathVariable String userId) {
        return orderService.findOrderByUserId(userId);
    }

}
