package jawad.test.springmvcrest.services;

import jawad.test.springmvcrest.domain.Customer;

import java.util.List;

public interface CustomerService {

    Customer findCustomerById(Long id);

    List<Customer> findAllCustomers();

    Customer saveCustomerById(Customer customer);
}
