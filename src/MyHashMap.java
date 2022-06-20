import java.util.ArrayList;
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
    public Object put(Object key, Object value) {
        Object rez = null;
        int hash = Objects.hash(key, value);
        Node buffer = lastNode;
        Node node = new Node(hash, key, value, null);
        lastNode = node;
        if (size == 0) {
            firstNode = node;
            size++;
        } else {
//************************ Проверяем нет ли уже такого key. Если есть - перезаписываем
            boolean zamena = false;
            Node newBuffer = firstNode;
            if (size>0) {
                for (int i=0; i<size; i++) {
                    if (newBuffer.key.equals(key)) {
                        rez = newBuffer.value;
                        newBuffer.value = value;
                        zamena = true;
                        lastNode = buffer;
                    }
                    newBuffer = newBuffer.nextNode;
                }
            }
//*****************************************************************************
            if (!zamena) {
                buffer.nextNode = node;
                size++;
            }
        }
        return (rez);
    }
//************************ remove(Object key) (удаляет пару по ключу) ********************
    public Object remove(Object localKey) {
        Object rez = null;
        if (firstNode.key.equals(localKey)) {
            if (firstNode.nextNode != null) {
                rez = firstNode.value;
                firstNode = firstNode.nextNode;
            } else {
                rez = firstNode.value;
                firstNode = null;
                lastNode = null;
            }
        } else {
            Node prevNodeToRemove = firstNode;
            while (!prevNodeToRemove.nextNode.key.equals(localKey)) {
                prevNodeToRemove = prevNodeToRemove.nextNode;
            }
            System.out.println("prevNodeToRemove = " + prevNodeToRemove);
            if (prevNodeToRemove.nextNode.nextNode == null) {
                rez = prevNodeToRemove.nextNode.value;
                lastNode = prevNodeToRemove;
                prevNodeToRemove.nextNode = null;
            } else {
                rez = prevNodeToRemove.nextNode.value;
                prevNodeToRemove.nextNode = prevNodeToRemove.nextNode.nextNode;
            }
        }
        size--;
        return (rez);
    }
//************************ clear() (очищает коллекцию) **************************************
    public boolean clear() {
        boolean rez = false;
        for (int i = 0; i < size; ) {
            remove(firstNode.key);
        }
        rez = true;
        size = 0;
        return (rez);
    }
//************************ size() (возвращает размер коллекции) *****************************
    public int size() {
        return size;
    }
//************************ get(Object key) (возвращает значение (Object value) по ключу ******
    public Object get(Object key) {
        Node node = firstNode;
        for (int i=0; i<size; i++) {
            if (node.key.equals(key)) {
                return (node.value);
            }
            node = node.nextNode;
        }
        return null;
    }

//************************ toString() ********************************************************
    @Override
    public String toString() {
        return "MyHashMap{ " +
                "firstNode= " + firstNode +
                ", lastNode= " + lastNode +
                ", size= " + size +
                " }";
    }
}
