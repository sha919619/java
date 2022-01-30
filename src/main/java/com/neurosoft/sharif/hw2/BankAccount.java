package com.neurosoft.sharif.hw2;


    import java.util.Scanner;

    public class BankAccount {

        public static void main(String[] args) {

            Scanner obj = new Scanner(System.in);
            System.out.println("Enter your account number");
            int accountNumber = obj.nextInt();
            //String accountName = obj.nextLine();
            //System.out.println("Your Account Name is : " + accountNumber);
            System.out.println("Enter Your Password");
            int password = obj.nextInt();
            if(accountNumber==000 && password==123) {
                System.out.println("Welcome to neurosoft bank limited");
                System.out.println("Your acount name is sharif");
                System.out.println("Enter your total balance");

            } else if(accountNumber==111 && password==987){
                System.out.println("Welcome to neurosoft bank limited");
                System.out.println("Your acount name is nazmul");
                System.out.println("Enter your total balance");
            } else if(accountNumber==222 && password==654){
                System.out.println("Welcome to neurosoft bank limited");
                System.out.println("Your acount name is shariar");
                System.out.println("Enter your total balance");
            } else if(accountNumber==333 && password==321){
                System.out.println("Welcome to neurosoft bank limited");
                System.out.println("Your acount name is islam");
                System.out.println("Enter your total balance");
            }

            else{
                System.out.println("You entered wrong information");
                System.exit(0);
            }
            int totalbalance = obj.nextInt();
            System.out.println("Your total balance is :" + totalbalance);
            System.out.println("Enter your Deposit balance");
            int deposit = obj.nextInt();
            totalbalance=totalbalance+deposit;
            System.out.println("Your new balance is : " + totalbalance);
            System.out.println("Enter your withdraw balance");
            int withdraw = obj.nextInt();
            totalbalance=totalbalance-withdraw;
            System.out.println("Your new balance is : " + totalbalance);
            System.out.println("Do you want print copy ?");
            System.out.println("press 1 for yes and press 2 for no");
            int reply= obj.nextInt();
            if(reply == 1){

                System.out.println("printing");
                System.out.println("Thanks for your banking !");
            } else if(reply == 2){

                System.out.println("Thanks for your banking !");
            }
        }
    }

