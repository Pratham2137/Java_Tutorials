package com.company;

public class CWH_26_Ch6_arrays {
    public static void main(String[] args) {
        /*Classroom of 500 students - You have to store marks of these 500 students
        You have 2 options:
        1. _Create_500_Variables
        2. _Using_Arrays
         */
        //There are 3 main way's oto create an arrays in java

        //1.Declaration and memory allocation
        //int [] marks = new int [5];

        //2.Declaration and then memory allocation
        //int [] marks;
        //marks = new int [5];
        //Initialization
//        marks[0] = 100;
//        marks[1] = 60;
//        marks[2] = 70;
//        marks[3] = 90;
//        marks[4] = 86;

        //3.Declaration, memory allocation and initialization
        int [] marks = {100,60,70,90,86};
        System.out.println(marks[4]);

    }
}
