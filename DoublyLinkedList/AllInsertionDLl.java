package DoublyLinkedList;

public class AllInsertionDLl {
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
    public static Node insertAtHead(Node head,int x){
        Node temp=new Node(x);
        temp.next=head;
        if(head!=null){ //checking if head is null
            head.prev=temp;
        }
        
        head=temp;
        return head;
    }
    public static void insertAtTail(Node head,int x){
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        Node t=new Node(x);
        temp.next=t;
        t.prev=temp;
    }
    public static void insertAtIdx(Node head,int idx,int x){
        Node s=head;
        for(int i=1;i<=idx-1;i++){
            s=s.next;
        }
        Node r=s.next;
        Node t=new Node(x);
        s.next=t;
        t.prev=s;
        t.next=r;
        r.prev=t;
    }
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
        e.next=null;
        // Node head=insertAtHead(a, 35);
        // displayDLL(head);

        insertAtTail(a, 5);
        displayDLL(a);
        System.out.println();
        insertAtIdx(a, 3, 56);
        displayDLL(a);
    }
}
