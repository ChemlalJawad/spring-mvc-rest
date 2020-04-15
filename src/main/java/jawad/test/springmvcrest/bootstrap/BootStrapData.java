package jawad.test.springmvcrest.bootstrap;

import jawad.test.springmvcrest.domain.Customer;
import jawad.test.springmvcrest.repositories.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData  implements CommandLineRunner {

    private final CustomerRepository customerRepository;

    public BootStrapData(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("Loading Customer Data");

        Customer c1 = new Customer();
        c1.setFirstname("Jaja");
        c1.setLastname("Chemlal");
        customerRepository.save(c1);

        Customer c2 = new Customer();
        c2.setFirstname("Tony");
        c2.setLastname("Montana");
        customerRepository.save(c2);

        System.out.println("Customers saved " + customerRepository.count());

    }
}
