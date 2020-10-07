package com.kalvinzhao.getorders.repositories;

import com.kalvinzhao.getorders.models.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepo extends CrudRepository<Order, Long> {
}
