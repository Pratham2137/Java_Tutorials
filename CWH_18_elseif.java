package com.company;
//import java.util.Scanner;

public class CWH_18_elseif {
    public static void main(String[] args) {
        String var = "Shubham";

        switch (var) {
            case "Shubham" -> System.out.println("You are going to become an adult!");//hello
            case "Saurabh" -> System.out.println("You are going to join a job!");
            case "Vishakha" -> System.out.println("You are going to retired!");
            default -> System.out.println("Enjoy your life");
        }
        System.out.println("Thanks for using my java code.");



        /*
        int age;
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        if (age>56){
            System.out.println("Your are experienced!");
        }
        else if (age>46){
            System.out.println("You are semi-Experienced");
        }
        else if (age>36){
            System.out.println("your are semi-semi-experienced");
        }
        else{
            System.out.println("You are not experienced");
        }*/
    }
}
