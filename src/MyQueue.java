public class MyQueue {

    private Node firstNode;
    private Node lastNode;
    private int size = 0;

    public MyQueue() {

        System.out.println("КОНСТРУКТОР MyQueue()");

        lastNode = new Node(firstNode, null, null);
        System.out.println("Создали самую ПОСЛЕДНЮЮ ноду " + lastNode);

        firstNode = new Node(null, null, lastNode);
        System.out.println("Создали самую ПЕРВУЮ ноду " + firstNode);

//        lastNode.setPrevNode(firstNode);
//        System.out.println("ЕЩЕ РАЗ!!! Создали самую ПОСЛЕДНЮЮ ноду " + lastNode);
    }

//***************************************************************************************

//    private static int kolNod = 0;
//    public static int getKolNod() {
//        return kolNod;
//    }

    private static class Node {

        private Node prevNode;
        private Object item;
        private Node nextNode;



        Node(Node prevNode, Object item, Node nextNode) {
            this.prevNode = prevNode;
            this.item = item;
            this.nextNode = nextNode;

//            kolNod++;
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
        Node newNode;
        if (size == 0) {
            firstNode.setItem(value);
            System.out.println("Назначили item firstNode ноде. ВОТ ОНА " + firstNode);
        } else
        if (size == 1) {
            lastNode.setItem(value);
            System.out.println("Назначили item lastNode. ВОТ ОНА " + lastNode);
//            lastNode.setPrevNode(firstNode);
//            System.out.println("Назначили предыдущую lastNode. ВОТ ОНА " + lastNode);
        }
        else {
            newNode = new Node(lastNode, value, null);
            System.out.println("Создали НОВУЮ ноду и назначили ей предыдущую lastNode" +
                    " и value = " + value + " Вот она: " + newNode);
            lastNode = newNode;
        }
        size++;
        return true;
    }
//************************ Удаляем елемент по индексу ***********************************
    public boolean remove(int index) {
        Node nodeToRemove = firstNode;
        for (int i=0; i<index; i++) {
            nodeToRemove = nodeToRemove.getNextNode();
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

        lastNode = new Node(firstNode, null, null);
        firstNode = new Node(null, null, lastNode);
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
