import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MyArrayList {

//************************ add(Object value) добавляет элемент в конец *********************

    public static Object[] add(Object value) {
        Object[] old_massiv;

        if (massiv == null) {
            massiv = new Object[1];
            massiv[0] = value;
        } else {
            old_massiv = massiv;
            massiv = new Object[old_massiv.length + 1];

            for(int i=0; i< old_massiv.length; i++) {
                massiv[i] = old_massiv[i];
            }

            massiv[massiv.length - 1] = value;
        }
        return massiv;
    }
//************************ remove(int index) удаляет элемент под индексом **************

    public static Object[] remove(int index) {
        Object[] new_massiv = new Object[massiv.length - 1];
        int kol_del = 0;
        for(int i=0; i< massiv.length-1; i++) {
            if(i==index) {
                kol_del++;
            }
            new_massiv[i] = massiv[i+kol_del];
        }
        return (new_massiv);
    }

    //************************ clear() очищает коллекцию ***********************************
    public static Object[] clear() {
        return (new Object[massiv.length]);
    }
    //************************ size() возвращает размер коллекции **************************
    public static int size() {
        return (massiv.length);
    }
    //************************ get(int index) возвращает элемент под индексом **************
    public static Object get(int index) {
        return (massiv[index]);
    }
//**************************************************************************************

    private static Object massiv[];

    public static void main(String[] organs) throws IOException {
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

        System.out.println("После удаления елемента " +
                Arrays.toString(MyArrayList.remove(2)));

//************************ Очищаем коллекцию *******************************************

        System.out.println("MyArrayList почищен " +
                Arrays.toString(new Object[massiv.length]));

//************************ Возвращаем размер коллекции *********************************

        System.out.println("Размер коллекции " +
                MyArrayList.size());

//************************ get(int index) возвращает элемент под индексом **************
        System.out.println("Возвращаем елемент по индексу [3] = " + MyArrayList.get(3));
//**************************************************************************************
        System.out.println("Выводим массив: " + Arrays.toString(massiv));
    }
}