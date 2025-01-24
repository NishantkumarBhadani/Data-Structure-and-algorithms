package STACK;

public class ArrayImplementationOfStack {
    public static class Stack{
        int arr[]=new int[5];
        int index=0;

        void push(int x){
            if(arr.length==size()){
                System.out.println("Stack is full!");
                return;
            }
            arr[index]=x;
            index++;
        }
        int pop(){
            if(index==0){
                System.out.println("Stack is empty");
                return -1;
            }
            arr[index-1]=0;
            index--;
            return arr[index-1];
            
        }
        int peek(){
            if(index==0){
                System.out.println("Stack is empty");
                return -1;
            }
            return arr[index-1];
        }
        boolean isEmpty(){
            if(index==0) return true;
            else return false;
        }
        int size(){
            return index;
        }
        boolean isFull(){
            if(arr.length==size()){
                   return true;
            }
            return false;
        }
        void display(){
            for(int i=0;i<=index-1;i++){
                System.out.print( arr[i]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Stack st=new Stack();
        st.push(5);
        st.push(7);
        st.push(8);
        st.push(8);
        st.display();
        st.pop();
        st.display();
        st.push(6);
        st.push(2);
        st.display();
        System.out.println(st.peek());
        st.pop();
        st.display();
        System.out.println(st.size());
        System.out.println(st.isFull());
    }
}
