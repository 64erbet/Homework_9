import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] organs) throws IOException {
        MyQueue sama_myQueue = new MyQueue();
        sama_myQueue.add("RAS !");
        sama_myQueue.add("DVA !!");
        sama_myQueue.add("TRI !!!");
        sama_myQueue.add("CHETIRE !!!");
        System.out.println("На данный момент у нас есть " + sama_myQueue.getSize() + " нод");
        System.out.println("sama_myQueue = " + sama_myQueue);

    }
}
