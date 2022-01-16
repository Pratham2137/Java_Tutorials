package com.company;
import java.util.Scanner;

public class CWH_06_exercise_1 {

    public static void main(String[] args) {

        System.out.println("This is the program to calculate the percentage of marks obtain in 5 subjects");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the marks of the 1st subject: ");
        float m1 = sc.nextInt();
        System.out.print("The total marks of 1st subject: ");
        float t1 = sc.nextInt();

        System.out.print("Enter the marks of the 2st subject: ");
        float m2 = sc.nextInt();
        System.out.print("The total marks of 2st subject: ");
        float t2 = sc.nextInt();

        System.out.print("Enter the marks of the 3st subject: ");
        float m3 = sc.nextInt();
        System.out.print("The total marks of 3st subject: ");
        float t3 = sc.nextInt();

        System.out.print("Enter the marks of the 4st subject: ");
        float m4 = sc.nextInt();
        System.out.print("The total marks of 4st subject: ");
        float t4 = sc.nextInt();

        System.out.print("Enter the marks of the 5st subject: ");
        float m5 = sc.nextInt();
        System.out.print("The total marks of 5st subject: ");
        float t5 = sc.nextInt();

        float p1 =  m1/t1*100;
        System.out.print("The percentage of 1st subject is ");
        System.out.println(p1);

        float p2 =  m2/t2*100;
        System.out.print("The percentage of 2st subject is ");
        System.out.println(p2);

        float p3 =  m3/t3*100;
        System.out.print("The percentage of 3st subject is ");
        System.out.println(p3);

        float p4 =  m4/t4*100;
        System.out.print("The percentage of 4st subject is ");
        System.out.println(p4);

        float p5 =  m1/t1*100;
        System.out.print("The percentage of 5st subject is ");
        System.out.println(p5);

        float mt = m1 +m2 +m3 +m4 +m5;
        System.out.print("Total marks obtain ");
        System.out.print(mt);
        float tt = t1 +t2 +t3 +t4 +t5;
        System.out.print(" out of ");
        System.out.println(tt);
        float pt = mt/tt*100;
        System.out.print("Total percentage obtain is ");
        System.out.print(pt);
        System.out.println(" out of 100 percentage.");
    }

}
