package com.neurosoft.sharif.hw1;

public class peramitarized {

    public void student(int boy, int girl) {
        int total=boy+girl;
        System.out.println("Total students in class =" + total);
    }
    public void exam(int participated, int failed){
        int passed=participated-failed;
        System.out.println("Graduated from this class =" + passed);
    }
    public void snacks(int bread, int tstudents){
        int perstudent=bread/tstudents;
        System.out.println("Bread will be given per student =" + perstudent);
    }
    public void chairs(int chairPerRoom, int classRoom){
        int totalChair=chairPerRoom*classRoom;
        System.out.println("Total chairs in this school =" + totalChair);
    }
}
