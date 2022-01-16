package com.company;

public class CWH_24_break_and_continue {
    public static void main(String[] args) {
        // Break and continue using loops

//        for (int i=0;i<5;i++){
//            System.out.println(i);
//            System.out.println("Java is great.");
//            if (i==2){
//                System.out.println("Ending the loop...");
//                break;
//            }
//        }

//        int i=0;
//        while(i<5){
//            System.out.println(i);
//            System.out.println("Java is great.");
//            if (i==2) {
//                System.out.println("Ending the loop...");
//                break;
//            }
//            i++;

//        int i=0;
//        do {
//            System.out.println(i);
//            System.out.println("Java is great.");
//            if (i==2) {
//                System.out.println("Ending the loop...");
//                break;
//            }
//            i++;
//        }while(i<5);


//        for (int i=0;i<5;i++){
//            if (i==2){
//                System.out.println("Ending the loop...");
//                continue;
//            }
//            System.out.println(i);
//            System.out.println("Java is great.");
//        }

        int i=0;
        do {
            i++;
            if (i==2) {
                System.out.println("Ending the loop...");
                continue;
            }
            System.out.println(i);
            System.out.println("Java is great.");
        }while(i<5);
        System.out.println("loop ends here");
    }
}
