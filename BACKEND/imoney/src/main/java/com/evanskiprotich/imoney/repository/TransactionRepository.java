package com.evanskiprotich.imoney.repository;

import com.evanskiprotich.imoney.entity.TransactionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TransactionRepository extends JpaRepository<TransactionEntity, Long> {
    public TransactionEntity findByAccountNumber(@Param("accountNumber") int accountNumber);

    public List<TransactionEntity> findAllByMerchantAndAccountNumber(String merchant, int accountNumber);
}
