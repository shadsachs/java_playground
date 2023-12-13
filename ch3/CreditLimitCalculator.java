package ch3;
import java.util.Scanner;
/* 

This application detemines whether  any of the several department store customers have exceed
the credit limit on a charge  account.

The program inputs the following as ints:
(account number, 
balance at the beginning of the month, 
total of all items charged by  the custtomer this month
ttotal of all credits applicated to the customer's account tthis month
allowed credit limit)

new balance = beginning balance  + charges - credits 

if the customer has exceeded credit limit display message displaying exceeded credit limit, if not,  display remaining credit limit
*/

public class CreditLimitCalculator {

    public static void main(String[] args) {
        
        // scanner object to take inputs 

        Scanner input = new Scanner (System.in);

        //initiallise all  variables as scanner inputs 

        System.out.print("Enter account number: "); // account number 
        int accountNumber = input.nextInt();

        System.out.print("Enter initial balance: "); // beginning balance
        int initialBalance = input.nextInt();

        System.out.print("Enter sum of charged items: "); // total sum of charged items this month
        int sumOfCharges = input.nextInt();


        System.out.print("Enter credits applied this month: "); // total credits customer had this month
        int credits = input.nextInt();

        System.out.print("Enter permitted credit limit: "); // permitted credit limit
        int CreditLimit = input.nextInt();

        int newBalance = initialBalance +  (sumOfCharges - credits);

        if (newBalance  <= CreditLimit)
        {
            System.out.printf("%nAccount: %s remaining credit is %d%n",accountNumber, newBalance);
        }
        else
        {
            System.out.printf("%nAccount: %s Credit exceeded by %d%n", accountNumber,newBalance);
        }
        input.close();
    }
    
}
