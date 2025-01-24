package STACK;

import java.util.Stack;

public class DispalyStackElement {
    public static void displayUsingStack(Stack <Integer> st){
        Stack<Integer> rt=new Stack<>();
        while(st.size()>0){
            rt.push(st.pop());
        }
        while(rt.size()>0){
            System.out.print(rt.peek()+" ");
            st.push(rt.pop());
        }
    }
    public static void displayUsingArray(Stack<Integer> st){
        int n=st.size();
        int arr[]=new int[n];
        for(int i=n-1;i>=0;i--){
            arr[i]=st.pop();
        
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
            st.push(arr[i]);
        }
    }
    public static void displayUsingRecursion(Stack<Integer> st){
        if(st.size()==0) return;
        int top=st.pop();
        displayUsingRecursion(st);
        System.out.print(top+" ");
        st.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(30);
        st.push(20);
        st.push(10);
        st.push(5);
        st.push(7);
        System.out.println(st);
        // displayUsingStack(st);
        // displayUsingArray(st);
        displayUsingRecursion(st);
    }
}
