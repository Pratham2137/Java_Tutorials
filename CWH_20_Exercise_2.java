package com.company;
import java.util.Scanner;
import java.util.Random;

public class CWH_20_Exercise_2 {
    public static void main(String[] args) {
        System.out.println("This is the Rock-Paper-Scissor Game.\n*Here 0=Rock, 1=Paper, 2= Scissor\nEnter your value");
        int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        System.out.print("User:- ");
        if (num==0){
            System.out.println("Rock");
        }
        else if (num==1){
            System.out.println("Paper");
        }
        else if (num==2){
            System.out.println("Scissor");
        }
        else{
            System.out.println("You put Wrong Value");
        }

        Random rd = new Random();
        int r = rd.nextInt(3);
        System.out.print("Computer:- ");
        if (r==0){
            System.out.println("Rock");
        }
        else if (r==1){
            System.out.println("Paper");
        }
        else if (r==2){
            System.out.println("Scissor");
        }


        if (num==0 && r==2){
            System.out.println("User Won!!!");
        }
        else if (num==0 && r==0){
            System.out.println("Match Tie");
        }
        else if (num==0 && r==1){
            System.out.println("Computer Won!!!");
        }
        else if (num==1 && r==0){
            System.out.println("User Won!!!");
        }
        else if (num==1 && r==1){
            System.out.println("Match Tie");
        }
        else if (num==1 && r==2){
            System.out.println("Computer Won!!!");
        }
        else if (num==2 && r==1){
            System.out.println("User Won!!!");
        }
        else if (num==2 && r==2){
            System.out.println("Match Tie");
        }
        else if (num==2 && r==0){
            System.out.println("Computer Won!!!");
        }
        else{
            System.out.println("Put the correct value!!!!");
        }
    }
}
