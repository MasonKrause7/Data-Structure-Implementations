/*
Singly Linked List implementation

 */
public class SLinkedList<T> {
    private Node head;
    private Node tail;
    private Node curr;
    private int size;


    public SLinkedList(){
        head = null;
        tail = null;
        curr = null;
        size = 0;
    }
    public SLinkedList(Node head, Node tail){
        this.head = head;
        this.tail = tail;
        curr = head;
        size = 0;
        while(curr.getNext() != null){
            curr = curr.getNext();
            size++;
        }
    }
    //END CONSTRUCTORS
    //START ACCESSORS / MUTATORS
    public int getSize(){
        return size;
    }
    public void setSize(int size){
        this.size = size;
    }
    public Node getCurr(){
        return curr;
    }
    public void setCurr(Node curr){
        this.curr = curr;
    }
    public Node getHead(){
        return head;
    }
    public void setHead(Node head){
        this.head = head;
    }
    public Node getTail(){
        return tail;
    }
    public void setTail(Node tail){
        this.tail = tail;
    }
    //END OF ACCESSORS / MUTATORS
    //START METHODS
    public T getValue(){
        return (T) curr.getData();
    }
    public void setValue(T data){
        curr.setData(data);
    }
    public void pushFront(T data){
        Node n = new Node(data, head);
        head = n;
        size++;
    }
    public void pushBack(T data){
        Node n = new Node(data, null);
        tail.setNext(n);
        size++;
        tail = n;
    }
    public T popFront(){
        T data = (T) head.getData();
        head = head.getNext();
        return data;
    }
    public T popBack(){
        T data = (T) tail.getData();
        curr = head;
        Node prev = null;
        while(curr.getNext() != null){
            prev = curr;
            curr = curr.getNext();

        }
        prev.setNext(null);
        System.out.println("tail = "+tail.getData());
        System.out.println("previous = " + prev.getData());
        tail = prev;
        return data;

    }
    public void insert(T data){

    }

    public void printList(){
        curr = head;
        System.out.println(curr.getData()+ " ");
        while(curr.getNext() != null){

            curr = curr.getNext();
            System.out.println(curr.getData()+ " ");

        }
    }
}
