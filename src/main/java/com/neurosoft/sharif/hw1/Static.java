package com.neurosoft.sharif.hw1;

public class Static {

    public static void Banana() {
        double bag1=12;
        double bag2=8;
        double Total=bag1+bag2;
        System.out.println("Total Banana =" + Total);
    }
    public static void FreshBanana(){
        int all=20;
        int ruined=4;
        int fresh=all-ruined;
        System.out.println("Total Fresh Banana =" + fresh);
    }
    public static void Mango(){
        double tmango=5.0;
        double people=2.0;
        double perhead=tmango/people;
        System.out.println("Mango per head =" + perhead);
    }
    public static void WorkingHours(){
        int days=5;
        int perdays=8;
        int weekly=days*perdays;
        System.out.println("Total work per week =" + weekly);
    }
}
