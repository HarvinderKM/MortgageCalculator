package com.pluralsight;

import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args) {
        //accept input from user
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter amount required: ");
        double principle = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Enter preferred interest rate: ");
        float interestRate = scanner.nextFloat();
        scanner.nextLine();

        System.out.println("Enter Loan Length in years: ");
        int loanLength = scanner.nextInt();
        scanner.nextLine();

        // calculate
        float monthlyInterestRate = ((interestRate / 100)/ 12);
        int numOfPayments  = loanLength * 12;

        double monthlyPayment = principle * (
                (monthlyInterestRate * Math.pow(1 + monthlyInterestRate,numOfPayments)))/
                (Math.pow(1 + monthlyInterestRate,numOfPayments)-1);
                //Math.pow puts whats inside the parenthesis to the numOfPayments
        System.out.println("Monthly Payment is: "+monthlyPayment);

        double totalPayment = monthlyPayment * numOfPayments;
        double totalInterestOwed = totalPayment - principle;
        System.out.println("Total interest rate to pay over the term is: "+ totalInterestOwed);



        //Display results
    }
}
