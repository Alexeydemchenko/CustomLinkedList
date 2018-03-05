public class Node<T> {

    private T value;
    private Node<T> nextLink;

    public T getValue() {
        return value;
    }

    public void setValue(T value){
        this.value = value;
    }

    public Node<T> getNextLink(){
        return nextLink;
    }

    public void setNextLink(Node<T> newLink){
        this.nextLink = newLink;
    }
}
