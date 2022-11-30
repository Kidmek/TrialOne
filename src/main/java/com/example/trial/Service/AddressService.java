package com.example.trial.Service;

import com.example.trial.Respository.AddressRepo;
import com.example.trial.models.Address;
import com.example.trial.models.Address;
import org.springframework.stereotype.Service;

@Service
public class AddressService extends MainService<Address> {


    public AddressService(AddressRepo addressRepo) {
        super.data = "Address";
        super.repo = addressRepo;
    }

    public Address add(Address address){
        return super.add(address);
    }
    public Address delete(Integer id){
        return super.delete(id);
    }
    public Address edit(Integer id,Address address){
        address.setHouseNum(id);
        return super.edit(id,address);
    }
    public Address get(Integer id){
        return super.get(id);
    }
    
}
