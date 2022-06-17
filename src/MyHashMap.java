import java.util.HashMap;
import java.util.Objects;

public class MyHashMap {
    private Node firstNode;
    private Node lastNode;
    public int size = 0;

//************************ Node *********************************************************
    private class Node {
        final int hash;
        final Object key;
        Object value;
        Node nextNode;

        Node(int hash, Object key, Object value, Node nextNode) {
            this.hash = hash;
            this.key = key;
            this.value = value;
            this.nextNode = nextNode;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Node)) return false;
            Node node = (Node) o;
            return hash == node.hash && Objects.equals(key, node.key) && Objects.equals(value, node.value) && Objects.equals(nextNode, node.nextNode);
        }

        @Override
        public int hashCode() {
            return Objects.hash(hash, key, value, nextNode);
        }

        @Override
        public String toString() {
            return
//                    "Node" +
                            "{ " +
//                    "hash = " + hash +
//                    ", key = " +
                    key +
//                    ", value = " +
                    ", " +
                    value +
//                    ", nextNode = " + nextNode +
                    ", " +
                    nextNode +
                    " }";
        }
    }

//************************ put(Object key, Object value) (добавляет пару ключ + значение)****
    public boolean put(Object key, Object value) {
        Node buffer = lastNode;
        Node node = new Node(Objects.hash(key, value), key, value, null);
        lastNode = node;

        if (size == 0) {
            firstNode = node;
            System.out.println("Создали ПЕРВУЮ ноду");
        } else {
            buffer.nextNode = node;
            System.out.println("Создали ПОСЛЕДУЮЩУЮ ноду");
        }

        size++;
        return (true);
    }
//************************ remove(Object key) (удаляет пару по ключу) ********************
    public boolean remove(Object key) {
        boolean rez = false;
        Node node = firstNode;
        for (int i=0; i<size; i++) {
            if (node.key.equals(key)) {
                System.out.println("Нашли что удалять!!!!");
                rez = true;
            }
            node = node.nextNode;
        }
        System.out.println("rez = " + rez);
        return rez;
    }
//************************ clear() (очищает коллекцию) **************************************

//************************ size() (возвращает размер коллекции) *****************************

//************************ get(Object key) (возвращает значение (Object value) по ключу ******

    @Override
    public String toString() {
        return "MyHashMap{ " +
                "firstNode= " + firstNode +
                ", lastNode= " + lastNode +
                ", size= " + size +
                " }";
    }


//    HashMap myMap = new HashMap();
}
