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
    public boolean put(Object key, Object value) {

        int hash = Objects.hash(key, value);
        Node buffer = lastNode;
        Node node = new Node(hash, key, value, null);
        lastNode = node;
        if (size == 0) {
            firstNode = node;
            System.out.println("Создали ПЕРВУЮ ноду = " + firstNode.key);
            System.out.println();
            size++;
        } else {
//************************ Проверяем нет ли уже такого key. Если есть - перезаписываем
            boolean zamena = false;
            Node newBuffer = firstNode;
            System.out.println("size = " + size);
            if (size>0) {
                for (int i=0; i<size; i++) {
                    if (newBuffer.key.equals(key)) {
                        System.out.println("newBuffer.key = " + newBuffer.key);

                        System.out.println("this.get(newBuffer.key) = " + this.get(newBuffer.key));
                        newBuffer.value = value;
                        System.out.println("Установили новый валуе");
                        zamena = true;
                        lastNode = buffer;
//                        this.toString();
                    }

                    newBuffer = newBuffer.nextNode;
                }
            }
//*****************************************************************************
            if (!zamena) {
                buffer.nextNode = node;
                size++;
            }
            System.out.println("Создали ПОСЛЕДУЮЩУЮ ноду");
            System.out.println();
//            size++;
        }
//        size++;
        return (true);
    }
//************************ remove(Object key) (удаляет пару по ключу) ********************
    public boolean remove(Object localKey) {
        boolean rez = false;
        if (firstNode.key.equals(localKey)) {
            if (firstNode.nextNode != null) {
                firstNode = firstNode.nextNode;
                System.out.println("Удалили первую ноду");
            } else {
                firstNode = null;
                lastNode = null;
                System.out.println("Last Node and First Node succesfully deleted !!!!!!!!!");
            }
        } else {
            Node prevNodeToRemove = firstNode;
            while (!prevNodeToRemove.nextNode.key.equals(localKey)) {
                prevNodeToRemove = prevNodeToRemove.nextNode;
            }
            if (prevNodeToRemove.nextNode.nextNode == null) {
                lastNode = prevNodeToRemove;
                prevNodeToRemove.nextNode = null;
            } else {
                prevNodeToRemove.nextNode = prevNodeToRemove.nextNode.nextNode;
            }
            System.out.println("Удалили ноду");
        }
        size--;
        rez = true;
        return rez;
    }
//************************ clear() (очищает коллекцию) **************************************
    public boolean clear() {
        boolean rez = false;

        for (int i = 0; i < size; ) {
            System.out.println("size = " + size);
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


//    HashMap myMap = new HashMap();
}
