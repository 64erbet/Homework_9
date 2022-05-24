import java.util.List;

public class MyLinkedList<E> {

    https://www.youtube.com/watch?v=BH6RJf2fVCQ

    private Node<E> first;
    private Node<E> last;
    private int size = 0;
/*
    public MyLinkedList() {
        last = new Node<E>(first, null, null);
        first = new Node<E>(null, null, last);
    }
*/
    //***************************************************************************************
    private static class Node<E> {

        public Node<E> prev;
        public E item;
        public Node<E> next;

        Node(Node<E> prev, E item, Node<E> next) {
            this.prev = prev;
            this.item = item;
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
            this.first = sam_node;
            this.last = sam_node;
        } else
        if (size == 1) {
            Node sam_node = new Node(this.get(0), o, null);
            this.last = sam_node;
        } else
        if (size > 1) {
            Node sam_node = new Node(this.get(size-1), o, null);
            this.last = sam_node;
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

            // ТУТ НУЖНО ПЕРЕБРАТЬ ВЕСЬ НАШ MYLINKEDLIST И НАЙТИ (Я ДУМАЮ ПО ЕГО ПОЛЮ SIZE)
            // НУЖНЫЙ НАМ ЕЛЕМЕНТ И ДАЛЬШЕ ЕГО ОБНУЛИТЬ И ПЕРЕНАЗНАЧИТЬ ССЫЛКИ НА СОСЕДНИЕ... НО
            // НУЖЕН ИТЕРАТОР !!!!!!!!!!!!!
            // А если реализовать (написать после класса implements List) List - то нужно будет
            // переопределять ВСЕ методы интерфейса лист. А этого делать в задании вроде НЕТ.
            // Сориентирую как перебрать все елементы нашего свежего класса не используя итератора??

//            Node<E> sam_element = this.get(index);
//            System.out.println("sam_element.item" + sam_element.item);


        }





//        size --;
        rez = true;

        return rez;
    }
    //************************ Это метод clear() ********************************************
    public void clear() {
        this = new MyLinkedList<>();
    }
    //************************ Это метод size() *********************************************
    public int size() {
        return (size);
    }
    //************************ Это метод get() **********************************************
    public Node<E> get(int index) {
        // Опять нужно перебрать весь наш LinkedList и если наше поле Node будет равно index
        // вернуть у этго елемента значение Node.item
        return null;
    }
//************************* Это метод toString() ****************************************
/*
    @Override
    public String toString() {
        String S = "";
        for(E i : this) {
            S += i + " ";
        }
        return (S);
    }
*/
}

