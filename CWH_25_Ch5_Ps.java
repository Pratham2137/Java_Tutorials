package com.company;

public class CWH_25_Ch5_Ps {
    public static void main(String[] args) {

        //Question 1
//        int n = 4;
//        for (int i=n; i>0; i--){
//            for(int j=0;j<i;j++){
////                (System.out.print(j);)
//                System.out.print("*");
//            }
////            (System.out.print(i);
////            System.out.print("*");)
//            System.out.print("\n");
//        }

        //Question 2
//        int sum=0;
//        int n=4;
//        for (int i=0; i<n; i++){
//            sum  = sum + (2*i);
//        }
//        System.out.print("Sum of even numbers is: ");
//        System.out.println(sum);

        //Question 3
//        int n=5;
//        for (int i=1; i<=10; i++) {
//            System.out.printf("%d X %d = %d\n", n, i, n * i);
//        }

        //Question 4
//        int n=10;
//        for (int i=n; i>=1; i--) {
//            System.out.printf("%d X %d = %d\n", n, i, n * i);
//        }

        //Question 5
//        int n = 6;
//        int factorial = 1;
//        for (int i=1; i<=n; i++) {
//            factorial *= i;
//            System.out.println(factorial); // prints all factorials
//        }
//        System.out.println(factorial); // prints the last factorial

        //Question6
//        int n=5;
//        //what is factorial n = n *n-1*n-2*....*1
//        //5! = 5*4*3*2*1
//        int i=1;
//        int factorial = 1;
//        while (i<=n){
//            factorial *= i;
//            i++;
//        }
//        System.out.println(factorial);

        //Question7
        int n=4;
        int i=n;
        int j=0;
        while (i>0) {
            while (j<i){
                System.out.print(j);
                System.out.print("*");
                j++;
            }
            System.out.print(i);
            System.out.print("*");
            System.out.print("\n");
            i--;
        }

        //Question 9
//        int n=8;
//        int sum = 0;
//        // for (int i=0; i<=10; i++) - Goes from i=0 to i=9
//        for (int i=1; i<=10; i++) {
//            sum += n*i;
//        }
//        System.out.println(sum);

        //Question 11
//        int sum = 0;
//        int n=4;
//        int i=0;
//        while (i<n){
//            sum = sum + (2*i);
//            i++;
//        }
//        System.out.print("Sum of even numbers is: ");
//        System.out.println(sum);
    }
}
