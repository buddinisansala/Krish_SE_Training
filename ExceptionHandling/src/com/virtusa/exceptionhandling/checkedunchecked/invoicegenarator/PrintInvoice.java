package com.virtusa.exceptionhandling.checkedunchecked.invoicegenarator;

import com.virtusa.exceptionhandling.checkedunchecked.exceptions.PrinterNotFoundException;
public class PrintInvoice {

    public  static void PrintInvoice() throws PrinterNotFoundException {
        throw new PrinterNotFoundException("Printer Can Not  Found");
    }

}
