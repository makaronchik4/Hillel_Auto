package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Calculator calculator = new Calculator();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int a = sc.nextInt();
        System.out.println("Введите операцию: ");
        String operation = sc.next();
        System.out.println("Введите второе число: ");
        int b = sc.nextInt();
        switch (operation) {
            case "+" :
                System.out.println("Результат сложения: " + calculator.plus(a,b));
                break;
            case "-" :
                System.out.println("Результат вычитания: " + calculator.minus(a,b));
                break;
            case "*" :
                System.out.println("Результат умножения: " + calculator.multiple(a,b));
                break;
            case "/" :
                System.out.println("Результат деления: " + calculator.div(a,b));
                break;

        }

    }

}
//
//        System.out.println("Результат сложения: " + calculator.plus(5, 7));
//        System.out.println("Результат вычитания: " + calculator.minus(15, 5));
//        System.out.println("Результат умножения: " + calculator.multiple(3, 4));
//        System.out.println("Результат деления: " + calculator.div(88, 8));
       // calculator.thirds(9); //изменяя значение переменной а можно получать true/false результаты


//        System.out.println ("Деление на 3 числа 9 - это " + calculator.thirds(9));
//        System.out.println ("Деление на 3 числа 25 - это " + calculator.thirds(25));
//        System.out.println ("Деление на 3 числа 102 - это " + calculator.thirds(102));


