package com.example.trial.Controllers;


import com.example.trial.Service.AccountService;
import com.example.trial.Service.AccountService;
import com.example.trial.models.Account;
import com.example.trial.models.Account;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(path = "/accounts")
public class AccountController extends Controller<Account>{

    private final AccountService accountService;

    public AccountController(AccountService accountService) {
        super.service = accountService;
        this.accountService = accountService;
    }

    @PostMapping
    public ResponseEntity add(@RequestBody Account account , BindingResult bindingResult){
        return super.add(account, bindingResult);
    }
    @PutMapping(path = "/{id}")
    public ResponseEntity edit( @RequestBody Account account , @PathVariable("id") Integer id , BindingResult bindingResult){
        return super.edit(account, id,bindingResult);
    }
    @DeleteMapping(path = "/{id}")
    public ResponseEntity delete( @PathVariable("id") Integer id ){
        return super.delete(id);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity get(@PathVariable("id") Integer id ){
        return super.get(id);
    }
}

