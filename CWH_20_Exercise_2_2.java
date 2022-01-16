package com.company;
import java.util.Scanner;
import java.util.Random;

public class CWH_20_Exercise_2_2 {
    public static void main(String[] args) {
        System.out.println("This is the Rock-Paper-Scissor Game.\n*Here 0=Rock, 1=Paper, 2= Scissor\nEnter your value");
        int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        Random rd = new Random();
        int r = rd.nextInt(3);

    }
}
