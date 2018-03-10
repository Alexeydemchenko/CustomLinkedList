import java.util.Iterator;

public class NodeContainer<T> implements Iterable<T> {

    private Node<T> firstNode;
    private Node<T> lastNode;
    private static int nodeAmount;
    private int size = 0;

    NodeContainer(){
        lastNode = new Node(null, firstNode, null);
        firstNode = new Node(null, null, lastNode);
    }

    public int size(){
        return size;
    }

    public void add(T t){
        Node<T> prevElement = lastNode;
        prevElement.setCurrentValue(t);
        lastNode = new Node<T>(null, prevElement, null);
        prevElement.setNextLink(lastNode);
        size++;
    }

    public void addTail(T t){
        Node<T> nextElement = firstNode;
        nextElement.setCurrentValue(t);
        firstNode = new Node<T>(null, null, nextElement);
        nextElement.setNextLink(lastNode);
        size++;
    }

    private Node<T> getNextElement(Node<T> currentLink){
        return currentLink.getNextLink();
    }

    public T getElementByIndex(int index){
        Node<T> value = firstNode.getNextLink();
        for(int i = 0; i < index; i++){
            value = getNextElement(value);
        }
        return value.getCurrentValue();
    }

    public Iterator<T> iterator() {
        return new Iterator<T>(){
            int objCounter = 0;

            public boolean hasNext(){
                return objCounter < size;
            }

            public T next() {
                return getElementByIndex(objCounter++);
            }

            public void remove() {
            }
        };
    }
}
