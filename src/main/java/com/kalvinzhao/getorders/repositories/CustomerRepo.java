package com.kalvinzhao.getorders.repositories;

import com.kalvinzhao.getorders.models.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomerRepo extends CrudRepository<Customer, Long> {

    List<Customer> findByCustnameContainingIgnoringCase(String likename);
}
