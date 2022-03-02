package org.ylab.FibonacciMaven;

public class FibCasheRun {

    public static void main(String[] args) throws Exception {

        try {

            FibCashe fibCashe = new FibCashe();

            long preTime=System.nanoTime();
            System.out.println(fibCashe.fib(46));
            long postTime=System.nanoTime();
            System.out.println("Время вычисления в наносекундах: " + (postTime-preTime));

            long preTime2=System.nanoTime();
            System.out.println(fibCashe.fib(45));
            long postTime2=System.nanoTime();
            System.out.println("Время вычисления в наносекундах: " + (postTime2-preTime2));

        }
        catch(IllegalArgumentException ex)
        {
            System.out.println("Недопустимы отрицательные индексы!");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
