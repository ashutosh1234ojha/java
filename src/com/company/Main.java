package com.company;


public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.print("hello ashutosh " + args[0]);
        System.out.println("hello i am just getting started");

        int a[] = {1, 2, 9, 3, 6, 7};
     //   BitsetSeries.bitset(a, 9);


        int b[] = {1, 2, 2, 3, 6,6, 7};

        Main.duplicateNumbers(b);


    }

     private static void duplicateNumbers(int[] b) {

        int initalNo;
        if(b.length>0)
        {
           initalNo=b[0];

            for(int i=1;i<b.length;i++){
                if(initalNo==b[i]){
                    System.out.println("Duplicate number"+initalNo);

                }else {
                    initalNo=b[i];
                }
            }
        }


    }


}
