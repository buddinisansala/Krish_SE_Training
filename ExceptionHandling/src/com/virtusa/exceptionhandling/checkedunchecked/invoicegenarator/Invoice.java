package com.virtusa.exceptionhandling.checkedunchecked.invoicegenarator;

import com.virtusa.exceptionhandling.checkedunchecked.exceptions.DivideByZeroException;

public class Invoice {
    public static int invoiceAmount,amount,electricityRate;

    Invoice(int amount,int electricityRate){
        this.amount = amount;
        this.electricityRate = electricityRate;
    }

    public static void calculateInvoiceAmount() throws DivideByZeroException {
        if (electricityRate == 0) {
            throw new DivideByZeroException("Can Not Divided By Zero");
        } else {
            int electricityUsage = amount / electricityRate;
            invoiceAmount = amount + electricityUsage;
        }
    }
}
