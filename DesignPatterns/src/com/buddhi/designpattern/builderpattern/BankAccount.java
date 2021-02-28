package com.buddhi.designpattern.builderpattern;

public class BankAccount {

    private final long accountNumber;
    private final String ownerName;
    private final String branch;
    private final double interestRate;
    private final double balance;

    public BankAccount(Builder builder){
        this.accountNumber = builder.accountNumber;
        this.ownerName = builder.ownerName;
        this.branch = builder.branch;
        this.interestRate = builder.interestRate;
        this.balance = builder.balance;
    }

    public static class Builder {
        private long accountNumber;
        private String ownerName;
        private String branch;
        private double balance;
        private double interestRate;

        public BankAccount build(){
            return new BankAccount(this);
        }

        public Builder(long accouuntNumber) {
            this.accountNumber = accouuntNumber;
        }

        public Builder ownerName(String ownerName){
            this.ownerName = ownerName;
            return this;
        }
        public Builder branch(String branch){
            this.branch = branch;
            return this;
        }
        public Builder interestRate(double interestRate){
            this.interestRate = interestRate;
            return this;
        }
        public Builder balance(double balance){
            this.balance = balance;
            return this;
        }

        @Override
        public String toString() {
            return "Builder{" +
                    "accountNumber=" + accountNumber +
                    ", ownerName='" + ownerName + '\'' +
                    ", branch='" + branch + '\'' +
                    ", balance=" + balance +
                    ", interestRate=" + interestRate +
                    '}';
        }
    }

}
