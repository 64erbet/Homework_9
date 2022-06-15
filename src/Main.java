import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] organs) throws IOException {


////************************ myStack ***********************************
//        MyStack myStack = new MyStack();
//
////************************ push() ****************************************
//        myStack.push("One");
//        myStack.push("Two");
//        myStack.push("Three");
//        myStack.push("Four");
//        myStack.push("Five");
//        myStack.push("Six");
//        myStack.push("Seven");
//        myStack.push("Eight");
//        System.out.println("myStack = " + myStack);
////************************ remove() **************************************
//        myStack.remove(0);
//        System.out.println("First deleted");
//        System.out.println(myStack);
//        myStack.remove(2);
//        System.out.println("2ya deleted");
//        myStack.remove(1);
//        System.out.println("Second deleted");
////************************ size() ****************************************
//        System.out.println("myStack.size() = " + myStack.size());
////************************ peek() ****************************************
//        System.out.println("myStack.peek() = " + myStack.peek());
////************************ pop() *****************************************
//        System.out.println("myStack.pop() = " + myStack.pop());
////************************ clear() ***************************************
//        myStack.clear();
//        System.out.println("myStack после clear()" + myStack);

//********************************************************************



//************************ myQueue ***********************************
//        MyQueue sama_myQueue = new MyQueue();
//        //----------- add()----------------
//        sama_myQueue.add("ONE !");
//        sama_myQueue.add("TWO !!");
//        sama_myQueue.add("THREE !!!");
//        sama_myQueue.add("FOUR !!!!");
//        sama_myQueue.add("FIVE !!!!!");
//        System.out.println("main(). На данный момент у нас есть " + sama_myQueue.size + " нод");
//        System.out.println("main(). sama_myQueue = " + sama_myQueue);
//
//        //----------- remove()----------------
//        System.out.println("main(). Удаляем елемент по индексу 4");
//        sama_myQueue.remove(4);
//        System.out.println("main(). sama_myQueue = " + sama_myQueue);
//
//        //----------- size()----------------
//        System.out.println("main(). sama_myQueue.size = " + sama_myQueue.size);
//
//        //----------- peek()----------------
//        System.out.println("main(). sama_myQueue.peek() = " + sama_myQueue.peek());
//
//        //----------- pool()----------------
//        System.out.println("main(). sama_myQueue ДО метода poll() " + sama_myQueue.size() + " елементов: " + sama_myQueue);
//        System.out.println("sama_myQueue.poll() = " + sama_myQueue.poll());
//        System.out.println("main(). sama_myQueue ПОСЛЕ метода poll() = " + sama_myQueue);
//
//        //----------- clear()----------------
//        System.out.println("*******************\nmain(). sama_myQueue ДО метода clear() " + sama_myQueue.size + " елементов" + "\n*******************");
//        sama_myQueue.clear();
//        System.out.println("*******************\nmain(). sama_myQueue ПОСЛЕ метода clear() = " + sama_myQueue + "\n*******************");

//********************************************************************



//************************ myLinkedList ******************************
        MyLinkedList myLinkedList = new MyLinkedList();

        //**************** add() **************************************
        myLinkedList.add("One");
        myLinkedList.add("Two");
        myLinkedList.add("Three");
        myLinkedList.add("Four");
        myLinkedList.add("Five");
        myLinkedList.add("Six");

        System.out.println("myLinkedList = " + myLinkedList);

        //**************** remove() *************************************
        myLinkedList.remove(0);
        System.out.println("myLinkedList after remove 0 = " + myLinkedList);

        //**************** size() ***************************************
        System.out.println("myLinkedList.size() = " + myLinkedList.size());

        //**************** get() ****************************************
        System.out.println("myLinkedList.get(0) = " + myLinkedList.get(0));
        System.out.println("myLinkedList.get(4) = " + myLinkedList.get(4));
        System.out.println("myLinkedList.get(3) = " + myLinkedList.get(3));

        //**************** clear() *************************************
        myLinkedList.clear();
        System.out.println("myLinkedList after clear() = " + myLinkedList);


//************************ myArrayList *******************************
//        MyArrayList myArrayList = new MyArrayList();
//        //**************** add() **************************************
//        myArrayList.add("RAZ");
//        myArrayList.add("DVA");
//        myArrayList.add("TRI");
//        myArrayList.add("Four");
//        myArrayList.add("Five");
//        myArrayList.add("Six");
//
//        System.out.println("myArrayList = " + myArrayList);
//
//        //**************** remove() *************************************
//        myArrayList.remove(1);
//        System.out.println("myArrayList after remove (1) = " + myArrayList);
//
//        //**************** size() ***************************************
//        System.out.println("myArrayList.size() = " + myArrayList.size());
//
//        //**************** get() ****************************************
//        System.out.println("myArrayList.get(4) = " + myArrayList.get(4));
//
//        //**************** clear() *************************************
//        myArrayList.clear();
//        System.out.println("myArrayList.clear = " + myArrayList);
    }
}
