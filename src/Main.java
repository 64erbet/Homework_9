import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

public class Main {
    public static void main(String[] organs) throws IOException {
//        Queue
        MyQueue sama_myQueue = new MyQueue();
        //----------- add()----------------
        sama_myQueue.add("ONE !");
        sama_myQueue.add("TWO !!");
        sama_myQueue.add("THREE !!!");
        sama_myQueue.add("FOUR !!!!");
        sama_myQueue.add("FIVE !!!!!");
        System.out.println("main(). На данный момент у нас есть " + sama_myQueue.size + " нод");
        System.out.println("main(). sama_myQueue = " + sama_myQueue);
        //----------- remove()----------------
        System.out.println("main(). Удаляем елемент по индексу 2");
        sama_myQueue.remove(2);
        System.out.println("main(). sama_myQueue = " + sama_myQueue);
        //----------- size()----------------
        System.out.println("main(). sama_myQueue.size = " + sama_myQueue.size);
        //----------- peek()----------------
        System.out.println("main(). sama_myQueue.peek() = " + sama_myQueue.peek());
        //----------- pool()----------------
        System.out.println("main(). sama_myQueue ДО метода poll() " + sama_myQueue.size + " елементов");
        System.out.println("sama_myQueue.poll() = " + sama_myQueue.poll());
        System.out.println("main(). sama_myQueue ПОСЛЕ метода poll() = " + sama_myQueue);



        //----------- clear()----------------
        System.out.println("main(). sama_myQueue ДО метода clear() " + sama_myQueue.size + " елементов");
//        sama_myQueue.clear();
        System.out.println("main(). sama_myQueue ПОСЛЕ метода clear() = " + sama_myQueue);

//        //----------- pool()----------------
//        System.out.println("main(). sama_myQueue ДО метода poll() " + sama_myQueue.size + " елементов");
//        sama_myQueue.poll();
//        System.out.println("main(). sama_myQueue ПОСЛЕ метода poll() = " + sama_myQueue);


        System.out.println("main(). sama_myQueue = " + sama_myQueue);
    }
}
