import javax.lang.model.element.Element;

public class MyQueue {
//--------------------
    public Node firstNode;
//    private Node firstNode;
//
//    public Node getFirstNode() {
//        return firstNode;
//    }
//
//    public void setFirstNode(Node firstNode) {
//        this.firstNode = firstNode;
//    }
//--------------------
    public Node lastNode;
//    private Node lastNode;
//
//    public Node getLastNode() {
//        return lastNode;
//    }
//
//    public void setLastNode(Node lastNode) {
//        this.lastNode = lastNode;
//    }
//--------------------
    public int size = 0;
//    private int size = 0;
//
//    public int getSize() {
//        return size;
//    }
//
//    public void setSize(int size) {
//        this.size = size;
//    }

    public MyQueue() {
        System.out.println("КОНСТРУКТОР MyQueue()");
    }

//***************************************************************************************
    private class Node {

        Node prevNode;
        Object item;
        Node nextNode;

        Node(Node prevNode, Object item, Node nextNode) {
            this.prevNode = prevNode;
            this.item = item;
            this.nextNode = nextNode;
        }

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
//***************************************************************************************

//    Node firstNode = new Node(null, null, lastNode);
//    Node lastNode = new Node(firstNode, null, null);

//************************ Добавляем елемент в конец по значению ************************
    public boolean add(Object value) {
        if (size == 0) {
            Node node = new Node(null, value, null);
            firstNode = node;
            lastNode = node;
            size++;
            System.out.println("Создали ПЕРВУЮ ноду");
        } else {
            Node node = new Node(lastNode, value, null);
//            lastNode.nextNode = node;
            lastNode = node;
            size++;
            System.out.println("Создали ПОСЛЕДУЮЩУЮ ноду");
        }

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
        System.out.println("Удаляем елемент ноды " + nodeToRemove.getItem());
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
//        return firstNode;
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
