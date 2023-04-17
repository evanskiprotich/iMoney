package com.evanskiprotich.imoney.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Transaction {
    private long id;
    private long transactionId;
    private String senderName;
    private int accountNumber;
    private int amount;
    private String merchant;
    private Date createdAt;

    public Transaction(long id, long transactionId, String senderName, int accountNumber, int amount, String merchant) {
    }
}
