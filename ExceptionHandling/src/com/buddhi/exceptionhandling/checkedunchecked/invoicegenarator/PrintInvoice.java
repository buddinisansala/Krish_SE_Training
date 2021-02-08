package com.buddhi.exceptionhandling.checkedunchecked.invoicegenarator;

import com.buddhi.exceptionhandling.checkedunchecked.exceptions.PrinterNotFoundException;
public class PrintInvoice {

    public  static void PrintInvoice() throws PrinterNotFoundException {
        throw new PrinterNotFoundException("Printer Can Not  Found");
    }

}
