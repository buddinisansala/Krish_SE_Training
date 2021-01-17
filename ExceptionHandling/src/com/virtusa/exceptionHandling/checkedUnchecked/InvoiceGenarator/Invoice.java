package com.virtusa.exceptionHandling.checkedUnchecked.InvoiceGenarator;

import com.virtusa.exceptionHandling.checkedUnchecked.exceptions.DivideByZeroException;

public class Invoice {
    public static int invoiceAmount,amount,taxRate;

    Invoice(int amount,int taxRate){
        this.amount=amount;
        this.taxRate=taxRate;
    }

    public static void calculateInvoiceAmount() throws DivideByZeroException {
        if (taxRate == 0) {
            throw new DivideByZeroException("Can Not Divided By Zero");
        } else {
            int tax = amount / taxRate;
            invoiceAmount = amount + tax;
        }
    }
}
