package com.company;

public class CWH_15_Ch3_Ps {
    public static void main(String[] args) {

        //Question1
        String name = "Pratham Shinde";
        name = name.toLowerCase();
        System.out.println(name);

        //Question2
        String Brother = " Vismay Shinde ";
        Brother = Brother.replace(" ","_");
        System.out.println(Brother);

        //Question3
        String text = "Dear Harsh, Thanks a lot";
        text = text.replace("Harsh","Rohan");
        System.out.println(text);

        //Question4
        String myString = "This string contain  double and   triple spaces.";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));

        //Question5
        String letter = "Dear Harry,\n\tThis java course is nice.\n\tThanks";
        System.out.println(letter);

    }
}
