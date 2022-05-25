import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] organs) throws IOException {
/*
//************************ Добавляем елемент *******************************************
        System.out.println("Введите елемент массива.");
        BufferedReader sam_reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String sam_element = sam_reader.readLine();

            if (sam_element.equals("!")) {
                break;
            }

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
        MyLinkedList<Integer> myIntL = new MyLinkedList<>();
        myIntL.add(56);
        myIntL.add(6);
        myIntL.add(67);
        myIntL.add(98);

//        System.out.println(myIntL);

//        myIntL.remove(1);

//        for (Integer i : myIntL) {
//            System.out.println("Element = " + i);
//        }
        System.out.println("myIntL 2 = " + myIntL.get(2));
    }
}
