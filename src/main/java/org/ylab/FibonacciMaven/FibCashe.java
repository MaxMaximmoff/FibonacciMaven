package org.ylab.FibonacciMaven;

/*
    Реализация алгоритма поиска числа Фибоначчи с использованием кэша.
    // n: 0, 1, 2, 3, 4, 5, ...
    // f: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ...

    F(0)=0, F(1)=1, F(n)=F(n-1)+F(n-2)
    n>=2, n принадлежит Z (целые числа)
*/

import java.util.ArrayList;

class FibCashe {

    ArrayList<Integer> fibcashe = new ArrayList<Integer>();

    public int fib(int x){

        if (x < 0 || x > 46) {
            throw new IllegalArgumentException(
                    "Недопустимы отрицательные индексы и индексы > 46!");
        }
        else if (x==0) {
            fibcashe.add(0, 0);
            return fibcashe.get(0);
        }
        else if (x==1){
            fibcashe.add(0, 0);
            fibcashe.add(1, 1);
            return fibcashe.get(1);
        }
        else if (indexExists(fibcashe, x) && fibcashe.get(x)!=0){
            return fibcashe.get(x);
        }
        else {
            fibcashe.add(0, 0);
            fibcashe.add(1, 1);
        }

        for(int i=2; i<=x; i++){
            int sum = fibcashe.get(i - 1) + fibcashe.get(i - 2);
            fibcashe.add(i, sum);
        }

        return fibcashe.get(x);
    }

    public boolean indexExists(ArrayList list, int index) {
        return index >= 0 && index < list.size();
    }
}
