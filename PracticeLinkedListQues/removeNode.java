package PracticeLinkedListQues;

public class removeNode {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
        }
    } 
    public static Node removeNode1(Node head,int index){
        Node slow=head;
        Node fast=head;

        for (int i = 0; i <index; i++) {
            fast=fast.next;
        }
        if(fast.next==null){
            head=head.next;
            return head ;
        }
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next;
        return head;
        
    }
    public static void display(Node head){
        Node temp=head;
        while(temp.next!=null){
            System.out.println(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        Node a=new Node(100);
        Node b=new Node(13);
        Node c=new Node(4);
        Node d=new Node(5);
        Node e=new Node(12);
        Node f=new Node(10);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        display(a);

        a=removeNode1(a,2);
        display(a);

    }
}

