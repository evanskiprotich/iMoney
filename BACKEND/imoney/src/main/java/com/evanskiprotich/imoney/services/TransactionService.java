package com.evanskiprotich.imoney.services;

import com.evanskiprotich.imoney.entity.TransactionEntity;
import com.evanskiprotich.imoney.model.Transaction;

import java.util.List;


public interface TransactionService {

    Transaction createTransaction(Transaction transaction);

    List<TransactionEntity> fetchTransactionsByAccountNumber(String merchant, int accountNumber);

    TransactionEntity fetchTransactionByAccountNumber(int accountNumber);


    List<TransactionEntity> fetchTransactionList();

    TransactionEntity saveTransaction(TransactionEntity transactionEntity);
}
