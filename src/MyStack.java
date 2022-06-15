public class MyStack {
    public Node firstNode;
    public Node lastNode;
    public int size = 0;

    public MyStack() {
        System.out.println("КОНСТРУКТОР MyStack()");
    }

//************************ Node *********************************************************
    private class Node {
        Object item;
        Node nextNode;

        Node(Object item, Node nextNode) {
            this.item = item;
            this.nextNode = nextNode;
        }

        @Override
        public String toString() {
            return "Node{ " +
                    item +
                    ", " +
                    nextNode +
                    " }";
        }
    }

//************************ push() ***********************************

    public boolean push(Object value) {
        Node buffer = lastNode;
        Node node = new Node(value, null);
        lastNode = node;

        if (size == 0) {
            firstNode = node;
//            size++;
            System.out.println("Создали ПЕРВУЮ ноду");
        } else {
            buffer.nextNode = node;
//            size++;
            System.out.println("Создали ПОСЛЕДУЮЩУЮ ноду");
        }
        size++;
        return true;
    }
//************************ remove() ***********************************
    public boolean remove(int index) {
        if (index == 0) {
            if (firstNode.nextNode != null) {
                firstNode = firstNode.nextNode;
                System.out.println("Deleted first element");
            } else {
                firstNode = null;
                lastNode = null;
                System.out.println("Last Node and First Node succesfully deleted !!!!!!!!!");
            }
        } else {
            Node prevNodeToRemove = firstNode;
            for (int i=0; i<(index-1); i++) {
                prevNodeToRemove = prevNodeToRemove.nextNode;
            }
            System.out.println("prevNodeToRemove = " + prevNodeToRemove);
            if (prevNodeToRemove.nextNode.nextNode == null) {
                System.out.println("LAST NODE!!!");
                lastNode = prevNodeToRemove;
                prevNodeToRemove.nextNode = null;
            } else {
                prevNodeToRemove.nextNode = prevNodeToRemove.nextNode.nextNode;
            }
        }
        size--;
        System.out.println("Удалили успешно!!!");
        return true;
    }
//************************ clear() ***********************************
    public boolean clear() {
        boolean rez = false;

        for (int i = 0; i < size; ) {
            System.out.println("size = " + size);
            remove(0);
        }

        rez = true;
        size = 0;

        return (rez);
    }
//************************ size() ***********************************
    public int size() {
        return size;
    }
//************************ peek() Возвращаем первый елемент *********
    public Object peek() {
        return lastNode.item;
    }
//************************ pop() Возвращаем первый елемент и УДАЛЯЕМ его
    public Object pop() {
        Object vihlop = lastNode.item;
        remove(size-1);

        return vihlop;
    }
//************************ toString() ***********************************

    @Override
    public String toString() {
        return "MyStack{ " +
                "firstNode=" + firstNode +
                ", lastNode=" + lastNode +
                ", size=" + size +
                " }";
    }
}
