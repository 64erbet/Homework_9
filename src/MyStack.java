public class MyStack {
    int kolNod = 0;

    class Node {
        Object item;
        Node nextNode;

        Node(Object item, Node nextNode) {
            this.item = item;
            this.nextNode = nextNode;
        }

        @Override
        public String toString() {
            return "Node{ " +
                    "item= " + item +
                    ", nextNode= " + nextNode +
                    "}";
        }
    }
    public push(Object value) {
        if (kolNod == 0) {
            Node firstNode = new Node(value, null);
        } else {

        }

        kolNod++;
    }
    public remove(int index) {

    }
    public clear() {

    }
    public size() {

    }
    public peek() {

    }
    public pop() {

    }

}
