package com.company;

import java.text.RuleBasedCollator;

public class Main {

    public static void main(String[] args) {
        int temp_Smallest;
        int tempVariable;
        int i= 0;
        int[] numbers = {22, 13, 10, 80, 19, 54, 51, 81, 30, 99, 91, 73, 65, 36, 35, 74, 82, 12, 43, 6};
        temp_Smallest = numbers[0];
        for (int x=0;x<19;x++) {

            while ((i<1) && (numbers[i] > temp_Smallest )){
                numbers[i + 1] = numbers[i];
                temp_Smallest= numbers[i+1];
                i++;
            }


        }
        for (int x=0;x<numbers.length;x++) {
            System.out.println(numbers[x]);
        }
    }
}
