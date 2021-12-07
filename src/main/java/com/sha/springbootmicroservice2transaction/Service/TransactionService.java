package com.sha.springbootmicroservice2transaction.Service;

import com.sha.springbootmicroservice2transaction.Model.Transaction;
import com.sha.springbootmicroservice2transaction.Repository.ITransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class TransactionService implements ITransactionService{

    @Autowired
    private ITransactionRepository repository;

    @Override
    public Transaction saveTransaction(Transaction transaction) {
        transaction.setTransactionTime(LocalDateTime.now());
        return repository.save(transaction);
    }

    @Override
    public void deleteTransaction(Long id) {
        repository.deleteById(id);
    }

    @Override
    public List<Transaction> findAllTransactions(Long userId) {
        return repository.findAllByUserId(userId);
    }
}
