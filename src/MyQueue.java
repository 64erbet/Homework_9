public class MyQueue {
    private Node firstNode;
    private Node lastNode;
    private int size = 0;

    public MyQueue() {
//        firstNode = new Node(null, null, lastNode);
        lastNode = new Node(firstNode, null, null);
        firstNode = new Node(null, null, lastNode);
    }

    @Override
    public String toString() {
        String vihlop = "";
        for (int i=0; i<size; i++) {
            vihlop += Node.get
        }
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
//***************************************************************************************
    public boolean add(Object value) {
        boolean rez = false;

        Node prevNode = lastNode;
        lastNode = new Node(prevNode, value, null);
        System.out.println("Нода добавлена!!!");
        size++;

        rez = true;
        return (rez);
    }
//***************************************************************************************
    public boolean remove(int index) {
        Node node;
        int i = 0;
        while (i < index) {
            node = node.getNextNode();
            i++;
        }
        node.getPrevNode().setNextNode(node.nextNode);
        node.getNextNode().setPrevNode(node.prevNode);
        node = null;
    }
}
//***************************************************************************************
