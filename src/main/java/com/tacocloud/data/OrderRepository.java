package com.tacocloud.data;

import com.tacocloud.model.Order;

public interface OrderRepository {

    Order save(Order order);

}
