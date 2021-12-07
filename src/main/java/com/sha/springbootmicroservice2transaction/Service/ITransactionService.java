package com.sha.springbootmicroservice2transaction.Service;

import com.sha.springbootmicroservice2transaction.Model.Transaction;

import java.util.List;

public interface ITransactionService {
    Transaction saveTransaction(Transaction transaction);

    void deleteTransaction(Long id);

    List<Transaction> findAllTransactions(Long userId);
}
