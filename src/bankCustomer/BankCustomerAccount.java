/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankCustomer;


public class BankCustomerAccount {

    public BankCustomerAccount(float balance) {
        if(balance<=100)
        {
            System.out.println("You cannot make an account with that balance");
            return;
        }
        this.balance = balance;
    }

    private float balance;

    public void deposit(float amount) {
        if (amount < 0) {
            System.out.println("Invalid amount. Please enter a positive value");
            return;
        }
        balance += amount;
    }

    public void withdraw(float amount) {
        if (amount < 0) {
            System.out.println("Invalid amount. Please enter a positive value");
            return;
        }
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Invalid amount " + amount + " Please try less");
        }

    }

    public float getBalance() {
        return balance;
    }
}
