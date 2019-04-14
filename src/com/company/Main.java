package com.company;


public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.print("hello ashutosh " + args[0]);
        System.out.println("hello i am just getting started");

        int a[] = {1, 2, 9, 3, 6, 7};
        //   BitsetSeries.bitset(a, 9);


        int b[] = {1, 2, 2, 3, 6, 6, 7};

        Main.duplicateNumbers(b);

Main.printPattern(8);

String s ="ABC";

Permutation.permute(s,0,s.length()-1);

    }

    private static void duplicateNumbers(int[] b) {

        int initalNo;
        if (b.length > 0) {
            initalNo = b[0];

            for (int i = 1; i < b.length; i++) {
                if (initalNo == b[i]) {
                    System.out.println("Duplicate number" + initalNo);

                } else {
                    initalNo = b[i];
                }
            }
        }


    }

  private static   void printPattern(int n) {

        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < n+1; j++) {

                if(i==1||i==n){
                    System.out.print("*");

                }else if(j==1||j==n){
                    System.out.print("*");

                }else                     System.out.print(" ");

            }
            System.out.println();

        }
    }
}