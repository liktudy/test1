package com.tedu.sp001.service;

import com.tedu.sp001.pojo.Order;

public interface OrderService {
    
    Order getOrder(String orderId);
    void addOrder(Order order);

}
