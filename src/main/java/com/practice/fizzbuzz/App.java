package com.practice.fizzbuzz;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        FizzBuzz fizzBuzz = new FizzBuzz();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int length = scanner.nextInt();
        scanner.close();
        String result = fizzBuzz.buildString(length);
        System.out.println(result);
        System.out.println("fizz:" + fizzBuzz.getFizz());
        System.out.println("lucky:" + fizzBuzz.getLucky());
        System.out.println("lucky:" + fizzBuzz.getLucky());
        System.out.println("lucky:" + fizzBuzz.getLucky());
    }
}
