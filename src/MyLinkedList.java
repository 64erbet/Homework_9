import java.util.List;

public class MyLinkedList {

    private class Node {
        Object value;
        Object next;
        Object previous;

        Node(Object previous, Object value, Object next) {
            this.value = value;
            this.next = next;
            this.previous = previous;
        }
    }

    public int kol_elementov = 0;


    public int size() {
        return (kol_elementov);
    }

    public boolean add(Object o) {
        boolean rez = false;

        if (kol_elementov == 0) {
            Node sam_node = new Node(null, o, null);

            kol_elementov ++;
            rez = true;
        } else
        if (kol_elementov == 1) {
            Node sam_node = new Node(this.get(0), o, null);

            kol_elementov ++;
            rez = true;
        } else
        if (kol_elementov > 1) {
            Node sam_node = new Node(this.get(kol_elementov-2), o, null);

            kol_elementov ++;
            rez = true;
        }

        return rez;
    }

    public boolean remove(int index) {
        boolean rez = false;

        Object sam_element = this.get(index);


        kol_elementov--;
        rez = true;

        return rez;
    }

    public void clear() {

    }

    public Object get(int index) {
        return null;
    }
}

