package org.asd.Lection2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        FibonacciSequence fibonacciSequence = new FibonacciSequence();
        fibonacciSequence.setLenth(15);
        System.out.println("Последовательность с For :" + Arrays.toString(fibonacciSequence.generateByFor()));
        System.out.println("Последовательность с While :" + Arrays.toString(fibonacciSequence.generateByWhile()));
        System.out.println("Последовательность с DoWhile :" +Arrays.toString(fibonacciSequence.generateByDoWhile()));
    }
}
