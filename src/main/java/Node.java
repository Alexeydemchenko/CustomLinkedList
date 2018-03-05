public class Node {

    Node nextElement;
    Object currentData;

    public Node(Object newValue){
        nextElement = null;
        currentData = newValue;
    }

    public Node(Object newValue, Node nextValue){
        nextElement = nextValue;
        currentData = newValue;
    }

    public Object getCurrentData(){
        return currentData;
    }

    public void setCurrentData(Object currentData){
        this.currentData = currentData;
    }

    public Node getNextElement(){
        return nextElement;
    }

    public void setNextElement(Node nextElement){
        this.nextElement = nextElement;
    }
}
