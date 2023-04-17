package com.evanskiprotich.imoney.services;

import com.evanskiprotich.imoney.entity.TransactionEntity;
import com.evanskiprotich.imoney.model.Transaction;
import com.evanskiprotich.imoney.repository.TransactionRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@Service
public class TransactionServiceImpl implements TransactionService {

    private final TransactionRepository transactionRepository;

    public TransactionServiceImpl(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    @Override
    public Transaction createTransaction(Transaction transaction) {
        TransactionEntity transactionEntity = new TransactionEntity();
        BeanUtils.copyProperties(transaction, transactionEntity);
        transactionRepository.save(transactionEntity);
        return transaction;
    }


    @Override
    public List<TransactionEntity> fetchTransactionsByAccountNumber(String merchant, int accountNumber) {
        return transactionRepository.findAllByMerchantAndAccountNumber(merchant, accountNumber);
    }

    @Override
    public TransactionEntity fetchTransactionByAccountNumber(int accountNumber) {
        return transactionRepository.findByAccountNumber(accountNumber);
    }

    @Override
    public List<TransactionEntity> fetchTransactionList() {
        return transactionRepository.findAll();
    }

    @Override
    public TransactionEntity saveTransaction(@Validated TransactionEntity transactionEntity) {
        return transactionRepository.save(transactionEntity);
    }


}
