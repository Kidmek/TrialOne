package com.example.trial.Controllers;

import com.example.trial.Service.CustomerService;
import com.example.trial.models.Customer;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(path = "/customers")
public class CustomerController extends Controller<Customer >{

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        super.service = customerService;
        this.customerService = customerService;
    }

    @PostMapping
    public ResponseEntity add(@RequestBody Customer customer , BindingResult bindingResult){
        return super.add(customer, bindingResult);
    }
    @PutMapping(path = "/{id}")
    public ResponseEntity edit( @RequestBody Customer customer , @PathVariable("id") Integer id , BindingResult bindingResult){
        return super.edit(customer, id,bindingResult);
    }
    @DeleteMapping(path = "/{id}")
    public ResponseEntity delete( @PathVariable("id") Integer id){
        return super.delete(id);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity get(@PathVariable("id") Integer id){
        return super.get(id);
    }
}
