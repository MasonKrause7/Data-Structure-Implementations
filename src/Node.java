public class Node<T> {
    private T data;
    private Node<T> next;

    public Node(){
        data = null;
        next = null;
    }
    public Node(Node next){
        this.next = next;
    }
    public Node(T data, Node next){
        this.next = next;
        this.data = data;
    }

    public Node getNext(){
        return next;
    }
    public void setNext(Node next){
        this.next = next;
    }
    public T getData(){
        return data;
    }
    public void setData(T data){
        this.data = data;
    }

}
