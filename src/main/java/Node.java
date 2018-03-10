public class Node<T> {

    private T value;
    private Node<T> nextLink;
    private Node<T> prevLink;
    private T currentValue;

    Node(T value, Node<T> prevLink, Node<T> nextLink) {
        this.value = value;
        this.prevLink = prevLink;
        this.nextLink = nextLink;
    }

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

    public Node<T> getPrevLink() {
        return prevLink;
    }

    public void setPrevLink(Node<T> newLink){
        this.prevLink = newLink;
    }

    public T getCurrentValue(){
        return currentValue;
    }

    public void setCurrentValue(T newCurrentValue){
        this.currentValue = newCurrentValue;
    }
}
