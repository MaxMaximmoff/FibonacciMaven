package org.ylab.FibonacciMaven;

/*
    Реализация алгоритма поиска числа Фибоначчи без использования массива.
    // n: 0, 1, 2, 3, 4, 5, ...
    // f: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ...

    F(0)=0, F(1)=1, F(n)=F(n-1)+F(n-2)
    n>=2, n принадлежит Z (целые числа)
*/

public class FibNoMem {

    public static int fib(int n){

        int n0 = 0, n1=1, n2;

        if (n < 0 || n > 46) {
            throw new IllegalArgumentException(
                    "Недопустимы отрицательные индексы и индексы > 46!");
        }
        else if (n==0) {
            return n0;
        }
        else if (n==1) {
            return n1;
        }

        for (int i = 1; i<n; i++) {

            n2 = n0 + n1;
            n0 = n1;
            n1 = n2;

        }

        return n1;
    }

    public static void main(String[] args) throws Exception {

        try {

            int n = 7; // индекс ряда Фибоначчи

            System.out.printf("Элемент с индексом %d ряда Фибоначчи равен %d\n", n, fib(n));

            int n_max = 6; //

            System.out.print("f: ");

            for (int i=0; i<=n_max; i++) {
                System.out.print(fib(i) + ", ");
            }

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
