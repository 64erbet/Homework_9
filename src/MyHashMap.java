public class MyHashMap {


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

//************************ put(Object key, Object value) *********************************

//************************ remove(Object key, Object value) *********************************
}
