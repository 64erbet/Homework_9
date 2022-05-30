import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] organs) throws IOException {
/*

        System.out.println("Введите елемент массива.");
        BufferedReader sam_reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String sam_element = sam_reader.readLine();

            if (sam_element.equals("!")) {
                break;
            }
//************************ Добавляем елемент *******************************************
            MyArrayList.add(sam_element);
        }
//************************ Удаляем елемент *********************************************

        System.out.println("После удаления 2-го елемента " +
                Arrays.toString(MyArrayList.remove(2)));

//************************ Очищаем коллекцию *******************************************

        System.out.println("MyArrayList почищен " +
                Arrays.toString(new Object[MyArrayList.massiv.length]));

//************************ Возвращаем размер коллекции *********************************

        System.out.println("Размер коллекции " +
                MyArrayList.size());

//************************ get(int index) возвращает элемент под индексом **************
        System.out.println("Возвращаем елемент по индексу [3] = " + MyArrayList.get(3));
//**************************************************************************************
        System.out.println("Выводим массив: " + Arrays.toString(MyArrayList.massiv));
*/


/*
        MyLinkedList myIntL = new MyLinkedList();
        myIntL.add(56);
        myIntL.add(6);
        myIntL.add(67);
        myIntL.add(98);

        System.out.println("myIntL = " + myIntL);
        myIntL.remove(2);
        System.out.println("Удалили 2-ой елемент. Теперь наш список: " + myIntL);
        System.out.println("Длина списка (size()) = " + myIntL.size());
        myIntL.clear();
        System.out.println("ТЕПЕРЬ!! Длина списка (size()) = " + myIntL.size());
        System.out.println("myIntL = " + myIntL);
*/


        MyQueue sama_myQueue = new MyQueue();
//        System.out.println("sama_myQueue = " + sama_myQueue);
        sama_myQueue.add("RAS !");
        sama_myQueue.add("DVA !!");
        sama_myQueue.add("TRI !!!");
        System.out.println("Размер очереди = " + sama_myQueue.size());
        System.out.println("sama_myQueue = " + sama_myQueue);
//        sama_myQueue.remove(1);

    }
}
