package org.ylab.FibonacciMaven;

/*
    Рекурсивная реализация алгоритма поиска числа Фибоначчи.
    // n: 0, 1, 2, 3, 4, 5, ...
    // f: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ...
    Условия ряда Фибоначчи:
    F(0)=0, F(1)=1, F(n)=F(n-1)+F(n-2)
    n>=2, n принадлежит Z (целые числа)
*/

public class FibRecurs {

    public static int fib(int n) {

        if (n < 0 || n > 46) {
            throw new IllegalArgumentException(
                    "Недопустимы отрицательные индексы и индексы > 46!");
        }
        else if (n==0 || n==1) {
            return n;
        } else {
            return fib(n-1) + fib(n-2);
        }

    }

    public static void main(String[] args) throws Exception {

        try {

            System.out.print("f: ");

            for (int n=0; n<=20; n++) {
                System.out.print(fib(n) + ", ");
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
