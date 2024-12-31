package PracticeLinkedListQues;

public class nthNodefromlast {
    
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
        }
    } 
    public static Node nthNodeFromLast(Node head,int index){
            int size=0;
            Node temp=head;
            while(temp!=null){
                size++;
                temp=temp.next;
            }
            int m=size-index+1;
            //mth node from start

            temp=head;
            for(int i=0;i<m-1;i++){
                temp=temp.next;
            }
            return temp;

    }
    //only in one traversal
    public static Node nthNodeFromLast2(Node head,int index){
        Node slow=head;
        Node fast=head;

        for (int i = 0; i <index; i++) {
            fast=fast.next;
        }
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
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

        Node q=nthNodeFromLast(a,3);
        System.out.println(q.data);
        Node p=nthNodeFromLast2(a, 3);
        System.out.println(p.data);
    }
}
