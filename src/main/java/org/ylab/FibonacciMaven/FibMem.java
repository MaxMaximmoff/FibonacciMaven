package org.ylab.FibonacciMaven;

/*
    Реализация алгоритма поиска числа Фибоначчи в цикле, с использованием памяти.
    // n: 0, 1, 2, 3, 4, 5, ...
    // f: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ...

    F(0)=0, F(1)=1, F(n)=F(n-1)+F(n-2)
    n>=2, n принадлежит Z (целые числа)
*/

public class FibMem {

    public static int fib(int n_max){

        int[] fibStore = new int[n_max+1];
        int out = 0;

        if (n_max < 0 || n_max > 46) {
            throw new IllegalArgumentException(
                    "Недопустимы отрицательные индексы и индексы > 46!");
        }
        else if (n_max==0) {
            fibStore[0] = 0;
            return fibStore[0];
        }
        else if (n_max==1) {
            fibStore[0] = 0;
            fibStore[1] = 1;
            return fibStore[1];
        }
        else {
            fibStore[0] = 0;
            fibStore[1] = 1;
        }

        for (int i = 2; i<fibStore.length; i++) {

            fibStore[i] = fibStore[i-1] + fibStore[i-2];
            out = fibStore[i];
        }

        return out;
    }

    public static void main(String[] args) throws Exception {

        try {

            int n_max = 20; // максимальный индекс ряда Фибоначчи
            int ind = 7; // индекс элемента ряда Фибоначчи
            System.out.printf("Элемент с индексом %d ряда Фибоначчи равен %d\n", ind, fib(ind));

            System.out.print("f: ");

            for (int i=0; i<=n_max; i++) {
                System.out.print(fib(i) + ", ");
            }

        }
        catch(IllegalArgumentException ex)
        {
            System.out.println("Недопустимы отрицательные индексы и индексы > 46!");
        }
        catch(ArrayIndexOutOfBoundsException ex)
        {
            System.out.println("Недопустимый индекс!");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
