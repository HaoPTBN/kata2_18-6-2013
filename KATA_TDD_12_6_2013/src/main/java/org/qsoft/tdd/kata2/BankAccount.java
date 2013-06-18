package org.qsoft.tdd.kata2;

import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: haopt
 * Date: 6/12/13
 * Time: 2:42 PM
 * To change this template use File | Settings | File Templates.
 */
public class BankAccount {
    private String accountNumber;
    private long balance;
    private Date openTimestamp;

    public BankAccount() {
    }

    public BankAccount(String accountNumber, long balance, Date openTimestamp) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.openTimestamp = openTimestamp;

    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public Date getOpenTimestamp() {
        return openTimestamp;
    }

    public void setOpenTimestamp(Date openTimestamp) {
        this.openTimestamp = openTimestamp;
    }
}
