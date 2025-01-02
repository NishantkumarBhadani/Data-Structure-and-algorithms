package DoublyLinkedList;

public class DisplayWithRandomNode {
    public static class Node{
        int val;
        Node next;
        Node prev;

        public Node (int val){
            this.val=val;
        }
    }
    public static void displayDLLWithRandomNode(Node random){
        Node temp=random;

        while(temp.prev!=null){
            temp=temp.prev;
        }
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        Node a=new Node(4);
        Node b=new Node(10);
        Node c=new Node(2);
        Node d=new Node(99);
        Node e=new Node(13);
        // Node f=new Node(4);
        a.next=b;
        b.prev=a;
        b.next=c;
        c.prev=b;
        c.next=d;
        d.prev=c;
        d.next=e;
        e.prev=d;
        displayDLLWithRandomNode(e);
    }
}
