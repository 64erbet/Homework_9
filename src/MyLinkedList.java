public class MyLinkedList<E> {

//    https://www.youtube.com/watch?v=BH6RJf2fVCQ

    private Node<E> firstNode;
    private Node<E> lastNode;
    private int size = 0;

    public MyLinkedList() {
        lastNode = new Node<E>(firstNode, null, null);
        firstNode = new Node<E>(null, null, lastNode);
    }

    //***************************************************************************************
    private static class Node<E> {

        private Node<E> prevNode;
        private E item;
        private Node<E> nextNode;

        Node(Node<E> prevNode, E item, Node<E> nextNode) {
            this.prevNode = prevNode;
            this.item = item;
            this.nextNode = nextNode;
        }

        public Node<E> getPrevNode() {
            return prevNode;
        }

        public void setPrevNode(Node<E> prevNode) {
            this.prevNode = prevNode;
        }

        public E getItem() {
            return item;
        }

        public void setItem(E item) {
            this.item = item;
        }

        public Node<E> getNextNode() {
            return nextNode;
        }

        public void setNextNode(Node<E> nextNode) {
            this.nextNode = nextNode;
        }
    }
    //************************ Это метод add() **********************************************
    public boolean add(E o) {
        boolean rez = false;

        Node<E> prevNode = lastNode;
        prevNode.setItem(o);
        lastNode = new Node<E>(prevNode, null, null);
        prevNode.setNextNode(lastNode);
        size++;

        rez = true;

        System.out.println("Добавили елемент. Всего елементов в арай листе: " + this.size);
        return rez;
    }
    //************************ Это метод remove() ******************************************
//    public boolean remove(int index) {
//        boolean rez = false;
/*
        if (size == 0) {
            throw new IllegalStateException("List is empty");
        } else {
            for(int i=0; i < this.size(); i++) {
                if(i == index) {

                }

            }
            // ТУТ НУЖНО ПЕРЕБРАТЬ ВЕСЬ НАШ MYLINKEDLIST И НАЙТИ (Я ДУМАЮ ПО ЕГО ПОЛЮ SIZE)
            // НУЖНЫЙ НАМ ЕЛЕМЕНТ И ДАЛЬШЕ ЕГО ОБНУЛИТЬ И ПЕРЕНАЗНАЧИТЬ ССЫЛКИ НА СОСЕДНИЕ... НО
            // НУЖЕН ИТЕРАТОР !!!!!!!!!!!!!
            // А если реализовать (написать после класса implements List) List - то нужно будет
            // переопределять ВСЕ методы интерфейса лист. А этого делать в задании вроде НЕТ.
            // Сориентирую как перебрать все елементы нашего свежего класса не используя итератора??

//            Node<E> sam_element = this.get(index);
//            System.out.println("sam_element.item" + sam_element.item);
*/

//        }





//        size --;
//        rez = true;

//        return rez;
//    }
    //************************ Это метод clear() ********************************************
    public void clear() {
//        this = new MyLinkedList<>();
    }
    //************************ Это метод size() *********************************************
    public int size() {
        return (size);
    }
    //************************ Это метод get() **********************************************
//    public Node<E> get(int index) {
    public E get(int index) {
        Node<E> vihlop = firstNode.getNextNode();

        for (int i=0; i<index; i++) {
            vihlop = getNextNode(vihlop);
        }

        return vihlop.getItem();
    }

    private Node<E> getNextNode(Node<E> samaNode) {
        return (samaNode.getNextNode());
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

