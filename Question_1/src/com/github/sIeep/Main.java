package com.github.sIeep;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
//
//        Find the sum of all the multiples of 3 or 5 below 1000.

//        int x = 5;
//        int y = 3;
//        int answer = (x + y);
//        System.out.println(answer)
        for (int i = 3; i < 1000; i = i + 3) {
            int sumOfThree = i + i;
            System.out.println(i);
            System.out.println(sumOfThree);
        }
    }
}
