import java.util.List;

public class MyLinkedList<E> {

    int size = 0;

    transient Node<E> first;
    transient Node<E> last;

//***************************************************************************************
    private class Node<E> {

        private Node<E> previous;
        private E value;
        private Node<E> next;

        Node(Node<E> previous, E value, Node<E> next) {
            this.previous = previous;
            this.value = value;
            this.next = next;

            System.out.println("Сооздали новый Node. Размер листа = " + size);
        }
    }
//***************************************************************************************
    public boolean add(Object o) {
        boolean rez = false;

        if (o == null) {
            throw new NullPointerException("You are adding NULL");
        }

        if (size == 0) {
            Node sam_node = new Node(null, o, null);
        } else
        if (size == 1) {
            Node sam_node = new Node(this.get(0), o, null);
        } else
        if (size > 1) {
            Node sam_node = new Node(this.get(size-1), o, null);
        }

        size ++;
        rez = true;

        System.out.println("Добавили елемент. Всего елементов в арай листе: " + this.size);
        return rez;
    }
//***************************************************************************************
    public boolean remove(int index) {
        boolean rez = false;

        if (index == -1) {
            throw new IllegalStateException("List is empty");
        } else {
            E sam_element = (E) this.get(index);
        }




//        size --;
        rez = true;

        return rez;
    }
//***************************************************************************************
    public void clear() {

    }
//***************************************************************************************
    public int size() {
        return (size);
    }
//***************************************************************************************
    public Node get(int index) {
        return null;
    }
//***************************************************************************************
}

