package com.example.trial.Service;

import com.example.trial.Respository.TransactionRepo;
import com.example.trial.models.Transaction;
import org.springframework.stereotype.Service;

@Service
public class TransactionService extends MainService<Transaction>{

    public TransactionService(TransactionRepo transactionRepo) {
        super.data = "Transaction";
        super.repo = transactionRepo;
    }

    public Transaction add(Transaction transaction){
        return super.add(transaction);
    }
    public Transaction delete(Integer id){
        return super.delete(id);
    }
    public Transaction edit(Integer id,Transaction transaction){
        transaction.setId(id);
        return super.edit(id,transaction);
    }
    public Transaction get(Integer id){
        return super.get(id);
    }
}

