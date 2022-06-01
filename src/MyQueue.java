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
            return "Node{" + prevNode +
            ", " + item +
            ", " + nextNode +
            '}';
        }
    }
//************************ Добавляем елемент в конец по значению ************************
    private Node prevNode = null;
    public boolean add(Object value) {
        size = this.getSize();

        if (size == 0) {
            Node node = new Node();
            this.setSize(size++);
            size++;
            node.setItem(value);
            node.setPrevNode(null);
            node.setNextNode(null);
            this.setFirstNode(node);
            this.setLastNode(node);

            prevNode = node;
            lastNode = node;

            System.out.println("ВСТАВИЛИ НОДУ В НАЧАЛО. \nВсего есть " + this.getSize() + " нода");
        }
        else {
            Node node = new Node();
            this.setSize(size++);
            size++;
            node.setItem(value);
            node.setPrevNode(this.lastNode);
            node.setNextNode(null);
            this.setLastNode(node);

            prevNode = node;

            System.out.println("Вставили ноду в конец. \nВсего есть " + this.getSize() + " нод");
        }

        System.out.println("size = " + size);
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
        return "MyQueue{" +
                "firstNode=" + firstNode +
                ", lastNode=" + lastNode +
                ", size=" + size +
                '}';
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
