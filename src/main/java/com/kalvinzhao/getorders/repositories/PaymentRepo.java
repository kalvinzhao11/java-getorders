package com.kalvinzhao.getorders.repositories;

import com.kalvinzhao.getorders.models.Payment;
import org.springframework.data.repository.CrudRepository;

public interface PaymentRepo extends CrudRepository<Payment, Long> {
}
