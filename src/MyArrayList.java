import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyArrayList {

    public  Object massiv[];

//************************ add(Object value) добавляет элемент в конец *********************
    public Object[] add(Object value) {
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
    public Object[] remove(int index) {
        Object[] new_massiv = new Object[massiv.length - 1];
        int kol_del = 0;
        for(int i=0; i< massiv.length-1; i++) {
            if(i==index) {
                kol_del++;
            }
            new_massiv[i] = massiv[i+kol_del];
        }
        massiv = new_massiv;
        return (massiv);
    }
//************************ clear() очищает коллекцию ***********************************
    public void clear() {
        massiv = null;
    }
//************************ size() возвращает размер коллекции **************************
    public int size() {
        return (massiv.length);
    }
//************************ get(int index) возвращает элемент под индексом **************
    public Object get(int index) {
        return (massiv[index]);
    }

    @Override
    public String toString() {
        return "MyArrayList{ " +
                "massiv = " + Arrays.toString(massiv) +
                " }";
    }
}