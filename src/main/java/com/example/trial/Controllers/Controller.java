package com.example.trial.Controllers;


import com.example.trial.Service.MainService;
import com.example.trial.models.Customer;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

public class Controller <Data >{
    public MainService service;


    public ResponseEntity add(@Valid Data data, BindingResult bindingResult ){
        if(bindingResult.hasErrors()){
            return new ResponseEntity(bindingResult.getAllErrors().get(0).getDefaultMessage(), HttpStatus.BAD_REQUEST);
        }
        else return new ResponseEntity(service.add(data), HttpStatus.ACCEPTED);
    }

    public ResponseEntity edit(@Valid Data data, Integer id, BindingResult bindingResult ){
        if(bindingResult.hasErrors()){
            return new ResponseEntity(bindingResult.getAllErrors().get(0).getDefaultMessage(), HttpStatus.BAD_REQUEST);
        }
        else return new ResponseEntity(service.edit(id,data), HttpStatus.ACCEPTED);
    }

    public ResponseEntity get(@Valid @NotNull  Integer id ){
        return new ResponseEntity(service.get(id), HttpStatus.ACCEPTED);
    }

    public ResponseEntity delete(@Valid @NotNull Integer id){
        return new ResponseEntity(service.delete(id), HttpStatus.ACCEPTED);
    }




}
