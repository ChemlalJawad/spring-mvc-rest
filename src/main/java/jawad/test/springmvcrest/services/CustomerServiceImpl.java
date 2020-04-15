package jawad.test.springmvcrest.services;

import jawad.test.springmvcrest.domain.Customer;
import jawad.test.springmvcrest.repositories.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public Customer findCustomerById(Long id) {

        return customerRepository.findById(id).get();
    }

    @Override
    public List<Customer> findAllCustomers() {

        return customerRepository.findAll();
    }

    @Override
    public Customer saveCustomerById(Customer customer) {
        return customerRepository.save(customer);
    }
}
