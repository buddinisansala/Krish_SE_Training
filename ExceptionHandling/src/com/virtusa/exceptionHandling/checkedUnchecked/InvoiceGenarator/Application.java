package com.virtusa.exceptionHandling.checkedUnchecked.InvoiceGenarator;

import java.util.Scanner;
import com.virtusa.exceptionHandling.checkedUnchecked.exceptions.*;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter invoice amount");
        int amount = scanner.nextInt();
        System.out.println("Enter tax rate");
        int taxRate = scanner.nextInt();

        Invoice invoice = new Invoice(amount, taxRate);
        try {
            invoice.calculateInvoiceAmount();
        } catch ( DivideByZeroException exception ) {
            System.err.println("Tax Rate can not be zero");
        }

        System.out.println("Enter 0 or 1 for print invoice");
        int isPrint = scanner.nextInt();

        if (isPrint == 1) {
            PrintInvoice print = new PrintInvoice();
            try {
                print.PrintInvoice();
            } catch ( PrinterNotFoundException exception ) {
                System.err.println("Printer Not Connected");
            }

        }
    }
}
