import java.util.HashMap;

public class MyHashMap {

//************************ Node *********************************************************
    private class Node {
        final int hash
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
    public String toString() {
        return "Node{ " +
                "hash = " + hash +
                ", key = " + key +
                ", value = " + value +
                ", nextNode = " + nextNode +
                "}";
    }
}

//************************ put(Object key, Object value) (добавляет пару ключ + значение)****

//************************ remove(Object key, Object value) (удаляет пару по ключу)**********

//************************ clear() (очищает коллекцию) **************************************

//************************ size() (возвращает размер коллекции) *****************************

//************************ get(Object key) (возвращает значение (Object value) по ключу ******



    HashMap myMap = new HashMap();
}
