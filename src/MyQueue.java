import javax.lang.model.element.Element;
import java.util.Stack;

/*



 */

public class MyQueue {
//--------------------
    public Node firstNode;
//--------------------
    public Node lastNode;
//--------------------
    public int size = 0;


    public MyQueue() {
        System.out.println("КОНСТРУКТОР MyQueue()");
    }


//***************************************************************************************
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
//************************ Добавляем елемент в конец по значению ************************
    public boolean add(Object value) {

        Node buffer = lastNode;
        Node node = new Node(value, null);
        lastNode = node;

        if (size == 0) {
            firstNode = node;
            size++;
            System.out.println("Создали ПЕРВУЮ ноду");
        } else {
            buffer.nextNode = node;
            size++;
            System.out.println("Создали ПОСЛЕДУЮЩУЮ ноду");
        }

        return true;
    }
//************************ Удаляем елемент по индексу ***********************************
    public boolean remove(int index) {
        if (index == 0) {
            if (firstNode.nextNode != null) {
                firstNode = firstNode.nextNode;
                System.out.println("Deleted first element");
            } else {
                firstNode = null;
                lastNode = null;
                System.out.println("Last Node and First Node succesfully deleted !!!!!!!!!");
            }
        } else {
            Node prevNodeToRemove = firstNode;
            for (int i=0; i<(index-1); i++) {
                prevNodeToRemove = prevNodeToRemove.nextNode;
            }
            System.out.println("prevNodeToRemove = " + prevNodeToRemove);
            if (prevNodeToRemove.nextNode.nextNode == null) {
                System.out.println("LAST NODE!!!");
                lastNode = prevNodeToRemove;
                prevNodeToRemove.nextNode = null;
            } else {
                prevNodeToRemove.nextNode = prevNodeToRemove.nextNode.nextNode;
            }
        }
        size--;
        System.out.println("Удалили успешно!!!");
        return true;
    }
//************************ Очищаем коллекцию ********************************************
    public boolean clear() {
        boolean rez = false;

        for (int i = 0; i < size; ) {
            System.out.println("size = " + size);
            remove(0);
        }

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
        return (firstNode.item);
    }
//************************ Воздвращаем первый елемент из очереди и УДАЛЯЕМ ЕГО из коллекции
    public Object poll() {
        Object vihlop = firstNode.item;
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
//***************************************************************************************
}