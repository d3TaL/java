package pr5;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {public static void main(String[] args)
{
    ArrayList<Integer> test1 = new ArrayList<>();
    LinkedList<Integer> test2 = new LinkedList<>();

    long time = System.nanoTime();
    for (int i = 0; i < 100000; i++)
    {
        test1.add((int)(Math.random()*100));

    }
    time = System.nanoTime() - time;
    System.out.println("Arraylist add time: "+ time );

    time = System.nanoTime();
    for (int i = 0; i < 100000; i++)
    {
        test2.add((int)(Math.random()*100));

    }
    time = System.nanoTime() - time;
    System.out.println("Linkedlist add time: "+ time );

    time = System.nanoTime();
    test1.add(2, 10);
    time = System.nanoTime() - time;
    System.out.println("Arraylist вставка time: "+ time  + "ns");

    time = System.nanoTime();
    test2.add(2, 10);
    time = System.nanoTime() - time;
    System.out.println("Linkedlist вставка time: "+ time  + "ns");

    time = System.nanoTime();
    test1.indexOf(10);
    time = System.nanoTime() - time;
    System.out.println("Arraylist search time: "+ time  + "ns");

    time = System.nanoTime();
    test2.indexOf(10);
    time = System.nanoTime() - time;
    System.out.println("Linkedlist search time: "+ time  + "ns");


    time = System.nanoTime();
    test1.remove(10);
    time = System.nanoTime() - time;
    System.out.println("Arraylist delete time: "+ time  + "ns");

    time = System.nanoTime();
    test2.remove(10);
    time = System.nanoTime() - time;
    System.out.println("Linkedlist delete time: "+ time  + "ns");

}

}
