package com.evanskiprotich.imoney.entity;


import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@Table(name = "transactions")
public class TransactionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long transactionId;
    private String senderName;
    private int accountNumber;
    private int amount;
    private String merchant;
    private Date createdAt;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(long transactionId) {
        this.transactionId = transactionId;
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getMerchant() {
        return merchant;
    }

    public void setMerchant(String merchant) {
        this.merchant = merchant;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public TransactionEntity() {
        this.transactionId = transactionId;
        this.senderName = senderName;
        this.accountNumber = accountNumber;
        this.amount = amount;
        this.merchant = merchant;
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "Transaction [transactionId=" + transactionId + ", senderName=" + senderName + ", accountNumber="
                + accountNumber + ", amount=" + amount + ", merchant=" + merchant + ", createdAt=" + createdAt + "]";
    }
}
