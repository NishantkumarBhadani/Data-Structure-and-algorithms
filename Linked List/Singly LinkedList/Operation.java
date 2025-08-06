import java.util.*;
class Node{
    int data;
    Node next;

     Node(int data){
        this.data=data;
        this.next=null;
    }
}

public class Operation{
    
    Node head=null;
    Node tail=null;
    int size=0;

    //insert at begining
    public void insertAtBeginning(int item){
        Node newNode=new Node(item);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
        size++;

    }
    //Insert at end
    public void insertAtEnd(int item){
        Node newNode=new Node(item);
        if(head==null){
            head=newNode;
            size++;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
        size++;
    }

    //Insert at any position
    public void InsertAtAnyPosition(int item,int position){
        Node newNode=new Node(item);
        if(position <0){
            System.out.println("Invalid position");
            return;
        }
        if(position==1){
            newNode.next=head;
            head=newNode;
            size++;
        }
        Node temp=head;
        int currentPosition=0;
        while(currentPosition<position-1 && temp!=null){
            temp=temp.next;
            currentPosition++;
        }
        if(temp==null){
            System.out.println("Invalid position");
            return;
        }
        newNode.next=temp.next;
        temp.next=newNode;
        size++;
    }
    //size of linked list
    // int size(){
    //     Node temp=head;
    //     int count=0;
    //     while(temp!=null){
    //         count++;
    //         temp=temp.next;
    //     }
    //     return count;
    // }

    //get element of index
    public int getAT(int index){
        Node temp=head;
        if(index<0 || index>size){
            System.out.println("Invalid index");
            return -1;
        }
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        return temp.data;
    }
    //displaying the linkedList
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data + "->");
            temp=temp.next;
        }
    }

    //delete from any index
    public void deleteAtIndex(int index){
        Node temp=head;
        for(int i=0;i<index-1;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        if(index==size-1){
            tail=temp;
        }
        //deleting first element
        if(index==0){
            head=head.next;
        }
        
        size--;
    }
    //aray to linkedlist
    public static Node arraytoLL(int arr[]){
        Node head=new Node(arr[0]);
        Node mover = head;
        for(int i=1;i<arr.length;i++){
            Node temp=new Node(arr[i]);
            mover.next=temp;
            mover=temp;
        }
        return head;

    }
    public static void main(String[] args) {
        Operation list=new Operation();
        // list.insertAtBeginning(5);
        // list.insertAtBeginning(7);
        // list.insertAtBeginning(4);
        // list.insertAtEnd(14);
        // list.insertAtEnd(15);
     

        // list.InsertAtAnyPosition(350,2);
        // list.display();
        // System.out.println("No. at 4th index:");
        // System.out.println(list.getAT(4));
        // System.out.println(list.getAT(10));
        // System.out.println(list.size);

        // list.deleteAtIndex(5);
        // list.display();
        // ArrayList<Integer> arr=new ArrayList<>();
        // System.out.println(list.tail.data);
        int arr[]={1,2,5,6};
        Node head=arraytoLL(arr);
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data +" ");
            temp=temp.next;
        }
        
    }
}