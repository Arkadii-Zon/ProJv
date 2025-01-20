package org.asd.Lection2;


/** Написать класс FibonacciSequence, в котором есть поле length - длинна последовательности Фибоначчи.
 Написать 3 метода в этом классе, возвращающих последовательность фибоначчи размера length в виде массива. Пример [0, 1, 1, 2, 3, 5] для length = 6.
 Каждый метод использует свой вариант цикла: 1 метод через цикл for, 2 через while, 3 через do-while.
 Написать конструктор с параметром и без параметров для этого класса. Не допускать возможность установки отрицательного значения length.
 Написать программу (отдельный класс с методом main) в котором создать объект класса FibonacciSequence и протестировать работу всех получившихся методов.
 */


public class FibonacciSequence {
    private int lenth = 0;

    public FibonacciSequence (){
    }

    public void setLenth(int lenth) {
        this.lenth = lenth;
    }

    public  FibonacciSequence (int lenth){
        this.lenth = lenth;
    }

    public int [] generateByFor(){

        if (lenth == 0) return new int[0];
        if (lenth == 1) return new int[]{0};
        int[] fibSequence = new int[lenth];
        fibSequence[0] = 0;
        fibSequence[1] = 1;
        int index = 2;
        for (int i = 2; i < lenth; i++) {
            fibSequence[i] = fibSequence[i - 1] + fibSequence[i - 2];
            fibSequence[index] = fibSequence[i];
            index++;
            if (lenth < 0){
                return null;
            }
        }

        return fibSequence;
    }

    public int[] generateByWhile(){

        if (lenth == 0) return new int[0];
        if (lenth == 1) return new int[]{0};
        int[] fibSequence = new int[lenth];
        fibSequence[0] = 0;
        fibSequence[1] = 1;

        int i = 2;
        while (i < lenth ){
            fibSequence[i] = fibSequence[i - 1] + fibSequence[i - 2];
            i++;

        }
        return fibSequence;
    }

    public int[] generateByDoWhile(){

        if (lenth == 0) return new int[0];
        if (lenth == 1) return new int[]{0};
        int[] fibSequence = new int[lenth];
        fibSequence[0] = 0;
        fibSequence[1] = 1;
        int i = 2;
        do{
            fibSequence[i] = fibSequence[i - 1] + fibSequence[i - 2];
            i++;

        } while (i < lenth );
        return fibSequence;
    }
}
