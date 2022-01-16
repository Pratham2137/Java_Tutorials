package com.company;

public class CWH_09_Op_Pre {
    public static void main(String[] args) {
        // Precedence & Associativity
//        int a = 6*5-34/2;
        /*
        Highest precedence goes to * and /. They are then evaluated on the basis
        of left to right associativity
            =30-34/2
            =30-17
            =13
         */
//        int b = 60/5-34*2;
        /*
            =60/5-68
            =12-68
            =-56
         */
//        System.out.println(a);
//        System.out.println(b);

        // Quick Quiz
//        int x = 6;
//        int y = 1;
//        int k = x*y/2;
//        System.out.println(k);

        int a = 5;
        int b = 1;//0
        int c = 4;//0
        int k = (b*b - 4*a*c)/(2*a) ;
        System.out.println(k);//0

    }
}
