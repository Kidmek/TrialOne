package com.example.trial.Controllers;

import com.example.trial.Service.TransactionService;
import com.example.trial.models.Transaction;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/transactions")
public class TransactionController extends Controller<Transaction>{

    private final TransactionService transactionService;

    public TransactionController(TransactionService transactionService) {
        super.service = transactionService;
        this.transactionService = transactionService;
    }

    @PostMapping
    public ResponseEntity add(@RequestBody Transaction transaction , BindingResult bindingResult){
        return super.add(transaction, bindingResult);
    }
    @PutMapping(path = "/{id}")
    public ResponseEntity edit( @RequestBody Transaction transaction , @PathVariable("id") Integer id , BindingResult bindingResult){
        return super.edit(transaction, id,bindingResult);
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
