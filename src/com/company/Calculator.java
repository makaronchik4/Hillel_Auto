package com.company;

public class Calculator {
    public void thirds(int a) {
        if (a % 3 == 0) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    public int plus(int a, int b) {
        return a + b;
    }
    public int minus(int a, int b) {
        return a - b;
    }
    public int multiple(int a, int b) {
        return a * b;
    }
    public int div(int a, int b) {
        return a / b;
    }

}
