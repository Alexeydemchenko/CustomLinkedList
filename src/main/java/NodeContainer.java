public class NodeContainer<T> {

    private Node<T> firstNode;
    private Node<T> lastNode;
    private static int nodeAmount;

    NodeContainer(){
        lastNode = new Node(null, firstNode, null);
        firstNode = new Node(null, null, lastNode);
    }

    public void add(T t){
        Node<T> prevElement = lastNode;
        prevElement.setCurrentValue(t);
        lastNode = new Node<T>(null, prevElement, null);
        prevElement.setNextLink(lastNode);
        nodeAmount++;
    }

    
}
