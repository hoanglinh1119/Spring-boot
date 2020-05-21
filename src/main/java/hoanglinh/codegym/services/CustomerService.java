package hoanglinh.codegym.services;

import hoanglinh.codegym.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface CustomerService {
    Page<Customer> findAll(Pageable pageable);
    Optional<Customer> findById(Long id);
    void save(Customer customer);
    void delete (Long id);

}
