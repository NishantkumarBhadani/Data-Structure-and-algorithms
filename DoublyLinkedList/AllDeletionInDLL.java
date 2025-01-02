package DoublyLinkedList;

public class AllDeletionInDLL {
    public static class Node{
        int val;
        Node next;
        Node prev;

        public Node (int val){
            this.val=val;
        }
    }
    public static void displayDLL(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
    }
    public static Node deleteAtHead(Node head){
        head=head.next;
        head.prev=null;
        return head;
    }
    public static void deleteAtTail(Node head){
        Node temp=head;
        while(temp.next.next!=null){temp=temp.next;}
      
        temp.next=null;
    }
    // public static void deleteAtIndex(Node head,int index){
    //     Node
    // }
    public static void main(String[] args) {
        Node a=new Node(4);
        Node b=new Node(10);
        Node c=new Node(2);
        Node d=new Node(99);
        Node e=new Node(13);
        // Node f=new Node(4);
        a.prev=null;
        a.next=b;
        b.prev=a;
        b.next=c;
        c.prev=b;
        c.next=d;
        d.prev=c;
        d.next=e;
        e.prev=d;
        displayDLL(a);
        System.out.println();
        // Node head=deleteAtHead(a);
        deleteAtTail(a);
        displayDLL(a);
    }
}
