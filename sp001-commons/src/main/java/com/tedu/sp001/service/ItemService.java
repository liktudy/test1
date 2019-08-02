package com.tedu.sp001.service;

import java.util.List;

import com.tedu.sp001.pojo.Item;

public interface ItemService {
    
    List<Item> getItems(String orderId);
    void decreaseNumbers(List<Item> list);

}
