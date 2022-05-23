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

//            System.out.println("Сооздали новый Node. Размер листа = " + size);
        }
    }
//************************ Это метод add() **********************************************
    public boolean add(E o) {
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
//************************ Это метод remove() ******************************************
    public boolean remove(int index) {
        boolean rez = false;

        if (size == 0) {
            throw new IllegalStateException("List is empty");
        } else {
            Node<E> sam_element = this.get(index);
        }




//        size --;
        rez = true;

        return rez;
    }
//************************ Это метод clear() ********************************************
    public void clear() {

    }
//************************ Это метод size() *********************************************
    public int size() {
        return (size);
    }
//************************ Это метод get() **********************************************
    public Node<E> get(int index) {
        return null;
    }
//************************* Это метод toString() ****************************************
/*
    public String toString() {
        String S = "";
        for(E i : this) {
            S += i + " ";
        }
        return (S);
    }
*/
 */
}

