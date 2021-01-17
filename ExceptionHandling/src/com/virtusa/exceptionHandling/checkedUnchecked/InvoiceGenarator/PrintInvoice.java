package com.virtusa.exceptionHandling.checkedUnchecked.InvoiceGenarator;

import com.virtusa.exceptionHandling.checkedUnchecked.exceptions.PrinterNotFoundException;
public class PrintInvoice {

    public  static void PrintInvoice() throws PrinterNotFoundException {
        throw new PrinterNotFoundException("Printer Can Not  Found");
    }

}
