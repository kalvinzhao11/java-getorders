package com.kalvinzhao.getorders.controllers;

import com.kalvinzhao.getorders.models.Customer;
import com.kalvinzhao.getorders.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    CustomerService customerServices;  // customerServices has to match the name from line 10 of CustomerServiceImp @Service(value = "customerServices")


//    http://localhost:2019/customers/orders
//    http://localhost:2019/customers/customer/7
//    http://localhost:2019/customers/customer/77
//    http://localhost:2019/customers/namelike/mes
//    http://localhost:2019/customers/namelike/cin


    // STEP 1
    @GetMapping(value = "/orders", produces = {"application/json"})
    public ResponseEntity<?> listAllCustomerOrders() {
        List<Customer> returnList = customerServices.findAllCustomerOrders(); // STEP 2, IMPLEMENT THIS IN SERVICE
        return new ResponseEntity<>(returnList, HttpStatus.OK);
    }

    @GetMapping(value = "/customer/{id}", produces = {"application/json"})
    public ResponseEntity<?> findByCustomerById(@PathVariable long id) {
        Customer customer = customerServices.findCustomerById(id);
        return new ResponseEntity<>(customer, HttpStatus.OK);
    }

    @GetMapping(value = "/namelike/{likename}", produces = {"application/json"})
    public ResponseEntity<?> findCustumerSubName(@PathVariable String likename){
        List<Customer> returnList = customerServices.findCustomerLikeName(likename);
        return new ResponseEntity<>(returnList, HttpStatus.OK);
    }


}
