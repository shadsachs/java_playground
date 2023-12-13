// program for bank account using custom classes and methods 
// this class does not execute since it contains no main method it's just a class 


public class Account {

    private String name; //instance variable 
    private double balance;


    // constructor to initialise instance variables 

    public Account(String name, double balance){ // constructor name is class name 
        this.name = name;
        if (balance > 0.0){ // if balance is valid, initialise the balance 
            this.balance = balance;
    
        }
    }

    // method to deposits positive doubles into the account
    public void deposit(double depositAmount){
        if (depositAmount > 0.0){
            balance += depositAmount;
        }
    }

    // method to return account balance 
    public double getBalance(){
        return balance;
    }

    


    // setter method to set name of account 
    public void setName (String name){
        this.name = name; // store name 
    }

    // getter method to get name of account 
    public String getName(){
        return name;
    }




    
}
