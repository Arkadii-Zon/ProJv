package org.asd.Lection2.TaskAlgor;

public class Factorial {
    public Factorial() {
    }

    public int generateByFor(int n){
        int number = 1;
        for (int i = 1; i <= n; i++) {
            number = number * i;
        }
        return number;
    }

    public int generateByWhile(int n){
        int number = 1;
        int count = 1;
        while (count <= n){
            number = number * count;
            count++;
        }
        return number;
    }

    public int generateByDoWhile (int n){
        int number = 1;
        int count = 1;
        do {
            number = number * count;
            count++;
        } while (count <= n);
        return number;
    }
}
