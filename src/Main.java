public class Main {
    public static void main(String[] args) {

        //Testing SLinkedList implementation
        int size = 1;
        SLinkedList sll = new SLinkedList();
        Node n = new Node(size, null);
        sll.setHead(n);
        sll.setCurr(n);
        size++;
        Node no = new Node(size, null);
        n.setNext(no);
        size++;
        Node nod = new Node(size, null);
        no.setNext(nod);
        size++;
        Node node = new Node(size, null);
        nod.setNext(node);
        sll.setTail(node);

        sll.printList();
        System.out.println();
        System.out.println("pushFront(10)");
        sll.pushFront(10);
        sll.printList();
        System.out.println();
        System.out.println("pushBack(20)");
        sll.pushBack(20);
        sll.printList();
        System.out.println();
        System.out.println("popFront() = " + sll.popFront());
        System.out.println("popBack() = "+ sll.popBack());
        sll.printList();




    }
}