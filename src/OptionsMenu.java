

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

public class OptionsMenu extends Account {
    Scanner menuInput = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");

    HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();

    public void getLogin() throws IOException {
        int x = 1;
        do {
            try {
                data.put(989000, 7899);
                data.put(989001, 7890);
                data.put(554433, 6060);

                System.out.println("Welcome to the ATM Project!");
                System.out.println("Enter your Customer Number: ");
                setCustomerNumber(menuInput.nextInt());

                System.out.print("Enter your PIN number: ");
                setPinNumber(menuInput.nextInt());
            }catch (Exception e) {
                System.out.println("\n" + "Invalid Character(s). Only numbers." + "\n");
                x = 2;
            }
            /*
             * for(Map.Entry<Integer,Integer> it : data.entrySet()){
             * if(it.getKey()==getCustomerNumber() && it.getValue()==getPinNumber){
             * getAccountType(); }}
             */
            int cn = getCustomerNumber();
            int pn = getPinNumber();
            if (data.containsKey(cn) && data.get(cn) == pn) {
                getAccountType();
            } else
                System.out.println("\n" + "Wrong Customer Number or Pin Number" + "\n");
        } while (x == 1);
    }

    public void getAccountType() {
        System.out.println("Select the Account you Want to Access: ");
        System.out.println(" Type 1 - Current Account");
        System.out.println(" Type 2 - Savings Account");
        System.out.println(" Type 3 - Exit");

        int selection = menuInput.nextInt();

        switch (selection) {
            case 1:
                getCurrent();
                break;

            case 2:
                getSavings();
                break;

            case 3:
                System.out.println("Thank You for using this ATM. \n");
                break;

            default:
                System.out.println("\n" + "Invalid Choice." + "\n");
                getAccountType();
        }
    }

    public void getCurrent() {
        System.out.println("Current Account: ");
        System.out.println(" Type 1 - View Balance");
        System.out.println(" Type 2 - Withdraw Funds");
        System.out.println(" Type 3 - Deposit Funds");
        System.out.println(" Type 4 - Exit");
        System.out.println("Choice: ");

        int selection = menuInput.nextInt();

        switch (selection) {
            case 1:
                System.out.println("Checking Account Balance: " + moneyFormat.format(getCurrentBalance()));
                getAccountType();
                break;

            case 2:
                getCurrentWithdrawInput();
                getAccountType();
                break;

            case 3:
                getCurrentDepositInput();
                getAccountType();
                break;

            case 4:
                System.out.println("Thank you for using this ATM.");
                break;

            default:
                System.out.println("\n" + "Invalid Choice." + "\n");
                getCurrent();
        }
    }

    public void getSavings() {
        System.out.println("Savings Account: ");
        System.out.println(" Type 1 - View Balance");
        System.out.println(" Type 2 - Withdraw Funds");
        System.out.println(" Type 3 - Deposit Funds");
        System.out.println(" Type 4 - Exit");
        System.out.println("Choice: ");

        int selection = menuInput.nextInt();

        switch (selection) {
            case 1:
                System.out.println("Savings Account Balance: " + moneyFormat.format(getSavingsBalance()));
                getAccountType();
                break;

            case 2:
                getSavingsWithdrawInput();
                getAccountType();
                break;

            case 3:
                getSavingsDepositInput();
                getAccountType();
                break;

            case 4:
                System.out.println("Thank you for using this ATM");
                break;

            default:
                System.out.println("\n" + "Invalid Choice." + "\n");
                getCurrent();
        }

    }
}
