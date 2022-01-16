package com.company;

public class CWH_27_Ch6_arrays_method {
    public static void main(String[] args) {
        /*
        float [] marks = {100,60.5f,70,90,86};
        String [] students = {"Harry", "Rohan", "Pratham", "Shubham"};
        System.out.println(students.length);
        System.out.println(students[1]);
        */

        int [] marks = {98,45,79,99,80};
        //System.out.println(marks.length);

        //Displaying the array (naive way)
//        System.out.println("Printing using naive way");
//        System.out.println(marks[0]);
//        System.out.println(marks[1]);
//        System.out.println(marks[2]);
//        System.out.println(marks[3]);
//        System.out.println(marks[4]);

        //Displaying the array (for loop)
        System.out.println("Printing using for loop");
        for(int i=0; i<marks.length; i++){
            System.out.println(marks[i]);
        }
        //Quick Quiz, Displaying the array in reverse order (for loop)
        System.out.println("Printing using for loop in reverse order");
        for(int i=marks.length-1; i>=0; i--){
            System.out.println(marks[i]);
        }

        //Displaying the array (for-each loop)
        System.out.println("Printing using for-each loop");
        for (int element : marks){
            System.out.println(element);
        }

    }
}
