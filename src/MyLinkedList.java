public class MyLinkedList<E> {

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

//        System.out.println("Добавили елемент. Всего елементов в арай листе: " + this.size);
        return rez;
    }
    //************************ Это метод remove() ******************************************
    public boolean remove(int index) {
        boolean rez = false;

        if (size == 0) {
            throw new IllegalStateException("List is empty");
        } else {
            Node<E> nodeToRemove = firstNode.getNextNode();
            for(int i=0; i < index; i++) {
                nodeToRemove = nodeToRemove.getNextNode();
            }

            nodeToRemove.getNextNode().setPrevNode(nodeToRemove.getPrevNode());
            nodeToRemove.getPrevNode().setNextNode(nodeToRemove.getNextNode());

            nodeToRemove = null;
        }
        size --;

        rez = true;

        return rez;
    }
    //************************ Это метод clear() ********************************************
    public void clear() {

        this.lastNode = new Node<E>(firstNode, null, null);
        this.firstNode = new Node<E>(null, null, lastNode);
        this.size = 0;

//        System.out.println("MyLinkedList обнулен !!!!!");
    }
    //************************ Это метод size() *********************************************
    public int size() {
        return (size);
    }
    //************************ Это метод get() **********************************************

    public E get(int index) {
        Node<E> vihlop = firstNode.getNextNode();

        for (int i=0; i<index; i++) {
            vihlop = vihlop.getNextNode();
        }

        return vihlop.getItem();
    }
    //************************* Это метод toString() ****************************************

    @Override
    public String toString() {
        String S = "[ ";

        if (this == null) {
            S = "fuck";
        }

        for(int i=0; i<this.size(); i++) {
            S += this.get(i) + " ";
        }
        return (S.trim() + " ]");
    }
}

