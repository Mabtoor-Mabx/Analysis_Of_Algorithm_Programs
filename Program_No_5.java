package com.company;

public class Program_No_5 {
    public static void main(String[] args) {
        int n1 = 10 , n2 = 20 , maximum;
        maximum = (n1* n2);
        System.out.println("Maximum is" + maximum);
    }

    public static void max(int val1, int val2) {
        int result;
        if (val1>val2){
            result = val1;
        }
        else{
            result = val2;
            System.out.println(result);
        }
    }

}
