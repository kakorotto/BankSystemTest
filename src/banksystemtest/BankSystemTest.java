/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banksystemtest;


import bankCustomer.BankCustomerAccount;

public class BankSystemTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BankCustomerAccount bankCustomerAccount = new BankCustomerAccount(1000.5F);

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int choice;
        do {
            System.out.println("1- Deposit");
            System.out.println("2- Withdraw");
            System.out.println("3- View Balance");
            System.out.println("4- Exit");
            System.out.println("Please enter your choice:");
            choice = scanner.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("Please enter the amount you want to deposit:");
                    float amount = scanner.nextFloat();
                    bankCustomerAccount.deposit(amount);
                    System.out.println("Your balance now is: " + bankCustomerAccount.getBalance());
                }
                break;
                case 2: {
                    System.out.println("Please enter the amount you want to withdraw:");
                    float amount = scanner.nextFloat();
                    bankCustomerAccount.withdraw(amount);
                    System.out.println("Your balance now is: " + bankCustomerAccount.getBalance());
                }
                break;
                case 3:
                    System.out.println("Your balance now is: " + bankCustomerAccount.getBalance());
                    break;
                case 4:
                    System.out.println("Thank you for using our amazing bank account system");
                    return;
                    
            }
            if(choice==4)
                break;
        } while (true);

    }

}
