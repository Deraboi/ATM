

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {

    private int customerNumber;
    private int pinNumber;
    private double currentBalance = 0;
    private double savingsBalance = 0;

    Scanner input = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");

    public int setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
        return customerNumber;
    }

    public int getCustomerNumber() {
        return customerNumber;
    }

    public int setPinNumber(int pinNumber) {
        this.pinNumber = pinNumber;
        return pinNumber;
    }

    public int getPinNumber() {
        return pinNumber;
    }

    public double getCurrentBalance() {
        return currentBalance;
}

    public double getSavingsBalance() {
        return savingsBalance;
    }


    public double calcCurrentWithdraw(double amount) {
        currentBalance = (currentBalance - amount);
        return currentBalance;
    }

    public double calcSavingsWithdraw(double amount) {
        savingsBalance = (savingsBalance - amount);
        return savingsBalance;
    }

    public double calcCurrentDeposit(double amount) {
        currentBalance = (currentBalance + amount);
        return currentBalance;
    }

    public double calcSavingsDeposit(double amount) {
        savingsBalance = (savingsBalance + amount);
        return savingsBalance;
    }

    public void getCurrentWithdrawInput() {
        System.out.println("Checking Account Balance: " + moneyFormat.format(currentBalance));
        System.out.print("Amount you want to withdraw from Current Account: ");
        double amount = input.nextDouble();

        if ((currentBalance -amount) >= 0) {
            calcCurrentWithdraw(amount);
            System.out.println("New Current Account Balance: " + moneyFormat.format(currentBalance));
        } else{
            System.out.println("Balance cannot be Negative." + "\n");
        }
    }

    public void getSavingsWithdrawInput() {
        System.out.println("Saving Account Balance: " + moneyFormat.format(savingsBalance));
        System.out.print("Amount you want to withdraw from Savings Account: ");
        double amount = input.nextDouble();

        if ((savingsBalance - amount) >= 0) {
            calcSavingsWithdraw(amount);
            System.out.println("New Savings Account Balance: " + moneyFormat.format(savingsBalance));
        } else {
            System.out.println("Balance cannot be Negative." + "\n");
        }
    }

    public void getCurrentDepositInput() {
        System.out.println("Current Account Balance: " + moneyFormat.format(currentBalance));
        System.out.print("Amount you want to Deposit from Current Account: ");
        double amount = input.nextDouble();

        if ((currentBalance + amount) >= 0) {
            calcCurrentDeposit(amount);
            System.out.println("New Current Account Balance: " + moneyFormat.format(currentBalance));
        } else {
            System.out.println("Balance Cannot be Negative." + "\n");
        }
    }

    public void getSavingsDepositInput() {
        System.out.println("Savings Account Balance: " + moneyFormat.format(savingsBalance));
        System.out.print("Amount you want to Deposit from Savings Account: ");
        double amount = input.nextDouble();

        if ((savingsBalance + amount) >= 0) {
            calcSavingsDeposit(amount);
            System.out.println("New savings Account Balance: " + moneyFormat.format(savingsBalance));
        } else {
            System.out.println("Balance cannot be Negative." + "\n");
        }
    }






}
