package com.kalvinzhao.getorders.services;

import com.kalvinzhao.getorders.models.Order;

public interface OrderService {
    Order save(Order order);

    Order findAgentById(long id);
}
