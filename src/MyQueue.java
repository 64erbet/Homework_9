public class MyQueue {

    private Node firstNode;
    private Node lastNode;
    private int size = 0;

    public MyQueue() {
        lastNode = new Node(firstNode, null, null);
        firstNode = new Node(null, null, lastNode);
    }

//***************************************************************************************
    private static class Node {

        private Node prevNode;
        private Object item;
        private Node nextNode;

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
            return "Node{" + prevNode +
            ", " + item +
            ", " + nextNode +
            '}';
        }
    }
//************************ Добавляем елемент в конец по значению ************************
    public boolean add(Object value) {
        for(int i=0; i<size; i++) {

        }
        Node newNode;
        if (size == 0) {
//            newNode = lastNode;
//            newNode.setItem(value);

            newNode = new Node(firstNode, value, lastNode);
            lastNode = newNode;

//            lastNode.setPrevNode(firstNode);
//            lastNode.setItem(value);
//            System.out.println("In LAST NODE added value " + value);
            System.out.println("Fist node = " + newNode);
        } else {
            newNode = new Node(lastNode, value, null);
            lastNode = newNode;
            System.out.println("Added new NODE - " + newNode);
        }
        size++;
        return true;
    }
//************************ Удаляем елемент по индексу ***********************************
    public boolean remove(int index) {
        Node nodeToRemove = firstNode;
        for (int i=0; i<=index; i++) {
            nodeToRemove = nodeToRemove.getNextNode();
        }
        System.out.println("Удаляем ноду " + nodeToRemove.getItem());
        nodeToRemove.getNextNode().setPrevNode(nodeToRemove.getPrevNode());
        nodeToRemove.getPrevNode().setNextNode(nodeToRemove.getNextNode());
        nodeToRemove = null;
        size--;
        System.out.println("Удалили успешно!!!");
        return true;
    }
//************************ Очищаем коллекцию ********************************************
    public boolean clear() {
        boolean rez = false;

        lastNode = new Node(firstNode, null, null);
        firstNode = new Node(null, null, lastNode);
        rez = true;

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

//    @Override
//    public String toString() {
//        return "MyQueue{" +
//                "firstNode=" + firstNode +
//                ", lastNode=" + lastNode +
//                ", size=" + size +
//                '}';
//    }

    public String toString() {
        String vihlop = "";
        for (int i=0; i<this.size(); i++) {
//        while (this.poll() != null) {
//            vihlop += this.poll() + " ";

            vihlop += i + " ";
        }
        return vihlop;
    }
//***************************************************************************************
}
