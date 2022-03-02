package org.ylab.FibonacciMaven;

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
