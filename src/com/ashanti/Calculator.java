package com.ashanti;

public class Calculator {
    String case1 = "The first number is greater than the second";
    String case2 = "The second number greater than the first";
    String case3 = "The numbers are equal";


    public int add(int x, int y) {
        return x + y;
    }

    public int subtract(int x, int y) {
        return x - y;
    }

    public void compare(int x, int y) {

        if (x > y) {
            System.out.println(case1);
        } else if (x < y) {
            System.out.println(case2);
        } else {
            System.out.println(case3 + " you stupid mf ");
        }

    }

}
