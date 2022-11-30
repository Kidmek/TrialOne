package com.example.trial.Service;

import com.example.trial.Exception.ResourceNotFoundException;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class MainService <Data >{
    JpaRepository repo;
    String data;


    public Data add(Data toBeAdded){
        repo.save(toBeAdded);
        return toBeAdded;
    }

    public Data delete(Integer toBeDeleted){
        Optional<Data> found = repo.findById(toBeDeleted);
        if(found.isPresent()){
            repo.deleteById(toBeDeleted);
        }else{
            throw new RuntimeException(data + " With ID " + toBeDeleted+ "Can't Be Found");
        }
        return found.get();
    }

    public Data edit(Integer toBeUpdated, Data toBeSaved){
        Optional<Data> found = repo.findById(toBeUpdated);
        if(found.isPresent()){
            repo.save(toBeSaved);
        }else{
            throw new RuntimeException(data + " With ID " + toBeSaved+ " Can't Be Found");
        }
        return toBeSaved;
    }

    public Data get(Integer toBeSeen){
        Optional<Data> found = repo.findById(toBeSeen);
        System.out.println(found);
        if(found.isEmpty()){
            throw new RuntimeException(data + " With ID " + toBeSeen+ " Can't Be Found");
        }
        return found.get();
    }
}
