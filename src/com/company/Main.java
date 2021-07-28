package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner console = new Scanner(System.in);  // создаем объект Scanner
        int a = console.nextInt();  // читаем с клавиатуры первое число
        int b = console.nextInt();  // читаем с клавиатуры второе число
        if (a < b)                  // если a меньше b
            System.out.println(a);  // выводим на экран a
        else if(a > b)                        // иначе
            System.out.println(b);  // выводим на экран b
        else
            System.out.println("a == b");

    }
}
