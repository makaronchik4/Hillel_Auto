package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Calculator calculator = new Calculator();

        System.out.println("Результат сложения: " + calculator.plus(5, 7));
        System.out.println("Результат вычитания: " + calculator.minus(15, 5));
        System.out.println("Результат умножения: " + calculator.multiple(3, 4));
        System.out.println("Результат деления: " + calculator.div(88, 8));
        calculator.thirds(9); //изменяя значение переменной а можно получать true/false результаты


/*        System.out.println ("Деление на 3 числа 9 - это " + calculator.thirds(9));
        System.out.println ("Деление на 3 числа 25 - это " + calculator.thirds(25));
        System.out.println ("Деление на 3 числа 102 - это " + calculator.thirds(102));*/

    }
}