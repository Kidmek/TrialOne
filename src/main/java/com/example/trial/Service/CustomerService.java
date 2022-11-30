package com.example.trial.Service;

import com.example.trial.Respository.CustomerRepo;
import com.example.trial.models.Customer;
import org.springframework.stereotype.Service;

@Service
public class  CustomerService extends MainService<Customer>{


    public CustomerService(CustomerRepo customerRepo) {
        super.data = "Customer";
        super.repo = customerRepo;
    }

    public Customer add(Customer customer){
        return super.add(customer);
    }
    public Customer delete(Integer id){
        return super.delete(id);
    }
    public Customer edit(Integer id,Customer customer){
        customer.setId(id);
        return super.edit(id,customer);
    }
    public Customer get(Integer id){
        return super.get(id);
    }
}
