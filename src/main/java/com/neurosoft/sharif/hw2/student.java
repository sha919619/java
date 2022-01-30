package com.neurosoft.sharif.hw2;

import java.util.Scanner;

public class student {

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        System.out.println("enter your name");
        String name=obj.nextLine();

            System.out.println("enter your number");
            int mark= obj.nextInt();

            if (mark >= 60 && mark <= 62) {

                System.out.println("Your Grade is -D");

            } else if (mark >= 63 && mark <= 66) {

                System.out.println("Your Grade is D");
            } else if (mark >= 67 && mark <= 69) {

                System.out.println("Your Grade is D+");
            } else if (mark >= 70 && mark <= 72) {

                System.out.println("Your Grade is -C");
            } else if (mark >= 73 && mark <= 76) {

                System.out.println("Your Grade is C");
            } else if (mark >= 77 && mark <= 79) {

                System.out.println("Your Grade is C+");
            } else if (mark >= 80 && mark <= 82) {

                System.out.println("Your Grade is B-");
            } else if (mark >= 83 && mark <= 86) {

                System.out.println("Your Grade is B");
            } else if (mark >= 87 && mark <= 89) {

                System.out.println("Your Grade is B+");
            } else if (mark >= 90 && mark <= 93) {

                System.out.println("Your Grade is A-");
            } else if (mark >= 94 && mark <= 100) {

                System.out.println("Your Grade is A+");
            } else {
                System.out.println("You are Fail!");
            }
        }
    }

