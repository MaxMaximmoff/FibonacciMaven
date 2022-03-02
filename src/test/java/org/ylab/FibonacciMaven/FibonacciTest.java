package org.ylab.FibonacciMaven;

import static org.junit.Assert.*;

public class FibonacciTest {

    // Тестирование правильности вычисления чисел Фибоначчи рекурсивным методом
    @org.junit.Test
    public void fibRec() {

        FibRecurs fibRecurs = new FibRecurs();

        int n_max = 20; // максимальный индекс ряда Фибоначчи
        int[] fibRecurs20 = new int[n_max+1];
        int[] expected = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765};

        for (int i=0; i<=n_max; i++) {
            fibRecurs20[i] = fibRecurs.fib(i);
            assertEquals(expected[i], fibRecurs20[i]);
        }
    }

    // Тестирование правильности вычисления чисел Фибоначчи память+цикл
    @org.junit.Test
    public void fibMem() {

        FibMem fibMem = new FibMem();

        int n_max = 20; // максимальный индекс ряда Фибоначчи
        int[] fibRecurs20 = new int[n_max+1];
        int[] expected = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765};

        for (int i=0; i<=n_max; i++) {
            fibRecurs20[i] = fibMem.fib(i);
            assertEquals(expected[i], fibRecurs20[i]);
        }
    }

    // Тестирование правильности вычисления чисел Фибоначчи без использования массива
    @org.junit.Test
    public void fibNoMem() {

        FibNoMem fibNoMem = new FibNoMem();

        int n_max = 20; // максимальный индекс ряда Фибоначчи
        int[] fibRecurs20 = new int[n_max+1];
        int[] expected = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765};

        for (int i=0; i<=n_max; i++) {
            fibRecurs20[i] = fibNoMem.fib(i);
            assertEquals(expected[i], fibRecurs20[i]);
        }
    }

    // Тестирование правильности вычисления чисел Фибоначчи c кэшем
    @org.junit.Test
    public void fibCache1() {

        FibCashe fibCashe = new FibCashe();

        int n_max = 20; // максимальный индекс ряда Фибоначчи
        int[] expected = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765};

        for (int i=0; i<=n_max; i++) {
            assertEquals(expected[i], fibCashe.fib(i));
        }

    }

    // Тестирование работы кэша при вычисления чисел Фибоначчи при помощи класса FibCashe
    @org.junit.Test
    public void fibCache2() {

        // создаем объект и кэш соответственно
        FibCashe fibCashe = new FibCashe();

        // вычисляем число Фибоначчи для n=10
        int n = 46;
        long preTime1=System.nanoTime();
        System.out.println(fibCashe.fib(n));
        long postTime1=System.nanoTime();
        long time1 = (postTime1-preTime1);

        // получаем из кэша число Фибоначчи для n=9
        n = 45;
        long preTime2=System.nanoTime();
        System.out.println(fibCashe.fib(n));
        long postTime2=System.nanoTime();
        long time2 = (postTime2-preTime2);

        System.out.println(time1);
        System.out.println(time2);

        assertTrue(time1>time2);

    }

}
















