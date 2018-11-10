package com.company;

import java.util.BitSet;

public class BitsetSeries {

     static void bitset(int numbers[],int n) {
        BitSet bitSet = new BitSet();
        int missingNumber=n-numbers.length;

        for (int number : numbers) {
            //bit set not maintain the order of insertion
            bitSet.set(number-1);

        }

        int lastMissingIndex=0;

        for(int i=0;i<missingNumber;i++){
            lastMissingIndex=bitSet.nextClearBit(lastMissingIndex);
            System.out.println(++lastMissingIndex);


        }



    }
}
