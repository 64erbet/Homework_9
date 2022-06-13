import javax.lang.model.element.Element;

/*

Осталось допилить метод poll() и clear()

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
//        Node buffer;
        if (index == 0) {
//            System.out.println("Deleting first element");
            firstNode = firstNode.nextNode;
            System.out.println("Deleted first element");
        }
        if (index == (size-1)) {
            System.out.println("Deleting last element");
//            lastNode = lastNode.
        }
        Node prevNodeToRemove = firstNode;
        for (int i=0; i<(index-1); i++) {
            prevNodeToRemove = prevNodeToRemove.nextNode;
        }

        prevNodeToRemove.nextNode = prevNodeToRemove.nextNode.nextNode;
        size--;
        System.out.println("Удалили успешно!!!");
        return true;
    }
//************************ Очищаем коллекцию ********************************************
    public boolean clear() {
        boolean rez = false;

        for (int i = 0; i < size; i++) {
            System.out.println("i = " + i);
                this.remove(0);
//            remove(i);
//            if (i!=(size-1)) {
//                System.out.println("Удаляем " + i + "-й елемент ");
                System.out.println("Удаляем 0-й елемент ");
//            }

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
        System.out.println("Зашли в метод полл!!");
        Object vihlop = firstNode.item;
//        System.out.println("Зашли в метод полл!!");
        remove(0);

//        return firstNode.item;
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

//    public String toString() {
//        String vihlop = "";
//        for (int i=0; i<this.size(); i++) {
//            vihlop += i + " ";
//        }
//        return vihlop;
//    }
//***************************************************************************************
}
