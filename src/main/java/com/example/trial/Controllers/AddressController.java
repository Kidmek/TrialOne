package com.example.trial.Controllers;

import com.example.trial.Service.AddressService;
import com.example.trial.models.Address;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/address")
public class AddressController extends Controller<Address>{

    private final AddressService addressService;

    public AddressController(AddressService addressService) {
        super.service = addressService;
        this.addressService = addressService;
    }

    @PostMapping
    public ResponseEntity add(@RequestBody Address address , BindingResult bindingResult){
        return super.add(address, bindingResult);
    }
    @PutMapping(path = "/{id}")
    public ResponseEntity edit( @RequestBody Address address , @PathVariable("id") Integer id , BindingResult bindingResult){
        return super.edit(address, id,bindingResult);
    }
    @DeleteMapping(path = "/{id}")
    public ResponseEntity delete( @PathVariable("id") Integer id ){
        return super.delete(id );
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity get(@PathVariable("id") Integer id ){
        return super.get(id );
    }
}
