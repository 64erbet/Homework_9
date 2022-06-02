public class MyQueue {
//--------------------
    private Node firstNode;

    public Node getFirstNode() {
        return firstNode;
    }

    public void setFirstNode(Node firstNode) {
        this.firstNode = firstNode;
    }
//--------------------
    private Node lastNode;

    public Node getLastNode() {
        return lastNode;
    }

    public void setLastNode(Node lastNode) {
        this.lastNode = lastNode;
    }
//--------------------
    private int size = 0;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public MyQueue() {
        System.out.println("КОНСТРУКТОР MyQueue()");
    }

//***************************************************************************************

    private static class Node {

        private Node prevNode;
        private Object item;
        private Node nextNode;

        public Node getPrevNode() {
            return prevNode;
        }

        public void setPrevNode(Node prevNode) {
            this.prevNode = prevNode;
        }

        public Object getItem() {
            return item;
        }

        public void setItem(Object item) {
            this.item = item;
        }

        public Node getNextNode() {
            return nextNode;
        }

        public void setNextNode(Node nextNode) {
            this.nextNode = nextNode;
        }

        @Override
        public String toString() {
            return "Node{ " +
                    prevNode +
            ", " +
                    item +
            ", " +
                    nextNode +
            " }";
        }
    }
//************************ Добавляем елемент в конец по значению ************************
    private Node prevNode = null;
    public boolean add(Object value) {

        if (size == 0) {
            Node firstNode = new Node();
            this.setSize(size++);
            size++;
            firstNode.setItem(value);
            firstNode.setPrevNode(null);
            firstNode.setNextNode(null);
            this.setFirstNode(firstNode);
            this.setLastNode(firstNode);

            System.out.println("ВСТАВИЛИ НОДУ (((  " + firstNode + "  ))) В НАЧАЛО. \nВсего есть " + this.getSize() + " нода");
        }
        else {
            Node node = new Node();
            size++;
            this.setSize(size);
            node.setItem(value);
            node.setPrevNode(lastNode);
//            this.lastNode.setNextNode(node);
            node.setNextNode(null);
            this.setLastNode(node);
//            lastNode.getPrevNode().setNextNode(node);
//            Node prevNode =

            System.out.println("lastNode = " + lastNode);

//********************************************************
//            node.getPrevNode().setNextNode(node);
//********************************************************

            System.out.println("Вставили ноду (((  " + node + "  ))) В КОНЕЦ. \nВсего есть " + this.getSize() + " нод");
        }

//        System.out.println("size = " + size);
        return true;
    }
//************************ Удаляем елемент по индексу ***********************************
    public boolean remove(int index) {
        Node nodeToRemove = firstNode;
        for (int i=0; i<index; i++) {
            nodeToRemove = nodeToRemove.getNextNode();
            System.out.println("i = " + i);
            System.out.println("nodeToRemove = " + nodeToRemove);
        }
        System.out.println("Удаляем ноду " + nodeToRemove.getItem());
        nodeToRemove.getNextNode().setPrevNode(nodeToRemove.getPrevNode());
        nodeToRemove.getPrevNode().setNextNode(nodeToRemove.getNextNode());
        nodeToRemove = null;
        size--;
//        kolNod--;
        System.out.println("Удалили успешно!!!");
        return true;
    }
//************************ Очищаем коллекцию ********************************************
    public boolean clear() {
        boolean rez = false;

//        lastNode = new Node(firstNode, null, null);
//        firstNode = new Node(null, null, lastNode);
        rez = true;
        size = 0;

        return (rez);
    }
//************************ Возвращаем размер коллекции **********************************
    public int size() {
        return size;
    }
//************************ Возвращаем первый елемент в очереди (FIFO) *******************
    public Object peek() {
        return (firstNode.getItem());
    }
//************************ Воздвращаем первый елемент из очереди и УДАЛЯЕМ ЕГО из коллекции
    public Object poll() {
        Object vihlop = firstNode.getItem();

        remove(0);

        return vihlop;
    }
//************************ toString() ***************************************************

    @Override
    public String toString() {
        return "MyQueue{ " +
                " firstNode = " + firstNode +
                ", lastNode = " + lastNode +
                ", size = " + size +
                " }";
    }

//    public String toString() {
//        String vihlop = "";
//        for (int i=0; i<this.size(); i++) {
//            vihlop += i + " ";
//        }
//        return vihlop;
//    }
//***************************************************************************************
}
