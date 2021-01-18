package com.virtusa.exceptionhandling.checkedunchecked.invoicegenarator;

import java.util.Scanner;
import com.virtusa.exceptionhandling.checkedunchecked.exceptions.*;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Amount");
        int amount = scanner.nextInt();
        System.out.println("Enter electricity Rate");
        int electricityRate = scanner.nextInt();

        Invoice invoice = new Invoice(amount, electricityRate);
        try {
            invoice.calculateInvoiceAmount();
        } catch ( DivideByZeroException exception ) {
            System.err.println("Electricity Rate can not be zero");
        }

        System.out.println("Do you want print Invoice, Press 1");
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
