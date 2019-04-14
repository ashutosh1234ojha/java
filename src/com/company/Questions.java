package com.company;

public class Questions {

    /**
     * It can be solved using hasing also
     */
    void findSumInSortedArray(){
        int input[]={1,2,3,4,5};
        int l=0,r=input.length-1;
        int sum=6;
        boolean found=false;

        while(l<r){

            int temp=input[l]+input[r];
            if(temp==sum){
                found=true;
                System.out.println(input[l]+" "+input[r]);
                l++;
                r--;

            }else if(temp<sum){
                l++;
            }
            else{
                r--;
            }
        }

        if(!found){
            System.out.println("No found");

        }

    }
    }

