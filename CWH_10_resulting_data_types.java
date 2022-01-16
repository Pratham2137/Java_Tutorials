package com.company;

public class CWH_10_resulting_data_types {
    public static void main(String[] args) {
       /* byte x = 5;
        int y = 6;
        short z = 8;
        int a = y + z;
        float b = 6.54f + x;
        System.out.println(a);
        System.out.println(b);*/

        // Increment and Decrement Operators
        int i = 56;
        // int b = i++; // first b is assigned to i(56) then incremented
        int j = 67;
        int c = ++j; // first j is incremented then c is assigned to j(68)
        System.out.println(i++);// First i is printed and then incremented
        System.out.println(i);
        System.out.println(++i);// First i is incremented and then printed
        System.out.println(i);

        // Quick Quiz
        int y = 7;
        int x = ++y*8;
        System.out.println(x);
        char ch = 'a';
        System.out.println(++ch);

    }
}
