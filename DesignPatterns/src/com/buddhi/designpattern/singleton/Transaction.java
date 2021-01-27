package com.buddhi.designpattern.singleton;

public class Transaction {

    private final Integer amount;
    private final String from, to;

    public Transaction(Integer amount,String from, String to) {
        this.amount = amount;
        this.from = from;
        this.to = to;
    }

    public Integer getAmount() {
        return amount;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public String toString() {
        return "Transaction{" +
                "amount:" + amount +
                ", from:'" + from + '\'' +
                ", to:'" + to + '\'' +
                "}";
    }
}