package com.kalvinzhao.getorders.services;

import com.kalvinzhao.getorders.models.Customer;
import com.kalvinzhao.getorders.models.Order;

import java.util.List;

public interface CustomerService {
    Customer save(Customer customer);

    List<Customer> findAllCustomerOrders(); // STEP 2, IMPLETMENT THIS. STEP 3, IMPLEMENT NEXT STEP IN CustomerServiceImp

    Customer findCustomerById(long id);

    List<Customer> findCustomerLikeName(String name);
}
