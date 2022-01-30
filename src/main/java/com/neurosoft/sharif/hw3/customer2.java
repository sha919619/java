package com.neurosoft.sharif.hw3;

import java.util.Scanner;

public class customer2 {
    public static void main(String[] args) {

        Scanner obj= new Scanner(System.in);

        System.out.println("welcome to our coffe shop! what can i get you?");
        String bev= obj.nextLine();

        System.out.println("How many milk do you want in your coffee?");
        int milk= obj.nextInt();

        System.out.println("How many" +
                " sugar do you want in your coffee?");
        int sugar= obj.nextInt();

        System.out.println("How many coffee do you want?");
        int quantity= obj.nextInt();

       // Scanner ob=new Scanner(System.in);
        System.out.println("what size of coffee do you want?");
        String size= obj.nextLine();
        String small, medium, large, xlarge;
        int s=2;
        int m=3;
        int l=4;
        int xl=5;
       // if (size.equalsIgnoreCase("small")) {
        //    System.out.println("your total bill is : " + quantity * s);
      //  }else if (size.equalsIgnoreCase("medium")) {
          //  System.out.println("your total bill is : " + quantity * m);
       // } else if (size.equalsIgnoreCase("large")) {
          //  System.out.println("your total bill is : " + quantity * l);
        //}else if (size.equalsIgnoreCase("xlarge")) {
          //  System.out.println("your total bill is : " + quantity * xl);
        //} else{
           // System.exit(0);
        }





      /*  System.out.println("Enter your credit/debit card and press ok.");
        String payment= obj.nextLine();

        if (payment.equalsIgnoreCase("ok")) {
            System.out.println("processing......");
        } else {
            System.out.println("payment is not completed");
            System.exit(0);
        }
        System.out.println("success");
        System.out.println("printing....");
        System.out.println("Thanks for coming. have a good day!");*/
   // }
}
