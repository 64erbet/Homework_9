import java.util.List;

public class MyLinkedList<E> {
    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    private int index = -1;

    public int kol_elem = 0;

    private Node firstEl;
    private Node lastEl;


    public MyLinkedList() {
        System.out.println("Создали MyLinkedList");
    }
/*
    public int size() {
        return (index);
    }

*/
//***************************************************************************************
    private class Node {
        private E value;
        private Node<E> next;
        private Node<E> previous;
/*
        public E getValue() {
            return value;
        }

        public void setValue(E value) {
            this.value = value;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }

        public Node<E> getPrevious() {
            return previous;
        }

        public void setPrevious(Node<E> previous) {
            this.previous = previous;
        }
*/
        Node(Node<E> previous, E value, Node<E> next) {
            this.previous = previous;
            this.value = value;
            this.next = next;

            System.out.println("Сооздали новый Node. Размер листа = " + (++index));
        }
    }
//***************************************************************************************
    public boolean add(Object o) {
        boolean rez = false;

        if (o == null) {
            throw new NullPointerException("You are adding NULL");
        }

//        if (index == 0) {
        if (index == -1) {
            Node sam_node = new Node(null, o, null);
        } else
        if (index == 0) {
            Node sam_node = new Node(this.get(0), o, null);
        } else
        if (index > 1) {
            Node sam_node = new Node(this.get(index-1), o, null);
        }

        index ++;
        rez = true;

        System.out.println("Добавили елемент. Всего елементов в арай листе: " + (index + 1));
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
        return (index + 1);
    }
//***************************************************************************************
    public Object get(int index) {
        return null;
    }
//***************************************************************************************
}

