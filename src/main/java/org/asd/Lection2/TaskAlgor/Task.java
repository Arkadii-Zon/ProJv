package org.asd.Lection2.TaskAlgor;

import java.util.Arrays;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) throws IllegalAccessException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите три числа(algorythm, typeloop, n): ");
        int algorId = scanner.nextInt();
        int typel = scanner.nextInt();
        int n = scanner.nextInt();

        switch (algorId){
            case 1:
                FibonacciSequence fibonacciSequence = new FibonacciSequence(n);
                switch (typel){
                    case 1:
                        System.out.println(Arrays.toString(fibonacciSequence.generateByWhile()));
                        break;
                    case 2:
                        System.out.println(Arrays.toString(fibonacciSequence.generateByDoWhile()));
                        break;
                    case 3:
                        System.out.println(Arrays.toString(fibonacciSequence.generateByFor()));
                        break;
                }
                break;
            case 2:
                Factorial factorial = new Factorial();
                switch (typel){
                    case 1:
                        System.out.println(factorial.generateByWhile(n));
                        break;
                    case 2:
                        System.out.println(factorial.generateByDoWhile(n));
                        break;
                    case 3:
                        System.out.println(factorial.generateByFor(n));
                        break;
                }
                break;
        }
        scanner.close();
    }
}
