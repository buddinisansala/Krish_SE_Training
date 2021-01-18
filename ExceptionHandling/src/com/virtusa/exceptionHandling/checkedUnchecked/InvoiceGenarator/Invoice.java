package com.virtusa.exceptionHandling.checkedUnchecked.InvoiceGenarator;

import com.virtusa.exceptionHandling.checkedUnchecked.exceptions.DivideByZeroException;

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
