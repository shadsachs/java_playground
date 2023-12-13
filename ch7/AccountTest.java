// driver class for the class Account.java 

import java.util.Scanner;


public class AccountTest {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // scanner object to obtain input from window 
        
        // create an account object and assign it  a value

        Account myAccount = new Account("Shad", 100_000.0);
        Account anotherAccount = new Account("sharon", 200_00.0);

        //display initial value of name 

        System.out.printf("Initial Name is:%s  and initial balance is: %f%n%n", myAccount.getName(), myAccount.getBalance());
        System.out.printf("Initial Name is: %s and initial balance is: %f %n%n", anotherAccount.getName(), anotherAccount.getBalance());


        //prompt for and read name; 

        System.out.println("Please enter the name: ");
        String theName = input.nextLine(); // read line of text
        myAccount.setName(theName); //pass entered name to account object 

        System.out.printf("please enter the deposit amount for account %s: ", theName);
        double depositAmount = input.nextDouble();
        myAccount.deposit(depositAmount); // deposit specified amount into account


        System.out.println("Please enter the second name: ");
        String secondName = input.next(); // read second name 
        anotherAccount.setName(secondName); // set name to second account name; 

        // determine deposit amount for second account

        System.out.printf("please enter the deposit amount for account %s: ", secondName);
        double secondDeposit = input.nextDouble();
        anotherAccount.deposit(secondDeposit);


        // display name entered and deposit amounts 
        System.out.printf("Name in first account is: %s%n Deposit amount in first account is: %.2f%n", myAccount.getName(), myAccount.getBalance());
    

        // display name and balance amounts for second account 

        System.out.printf("Name in second account is: %s%n Deposit amount in second account is: %.2f%n", anotherAccount.getName(), anotherAccount.getBalance());

        input.close();
    }

}
