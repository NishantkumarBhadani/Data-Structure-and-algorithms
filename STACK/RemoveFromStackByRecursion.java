package STACK;

import java.util.Stack;

public class RemoveFromStackByRecursion {
    public static void removeFromBootom(Stack <Integer> st){
        if(st.size()==1){
            st.pop();
            return;
        }
        int top=st.pop();
        removeFromBootom(st);
        st.push(top);
    }
    public static void removeFromIndex(Stack <Integer> st,int index){
        if(st.size()==index){
            st.pop();
            return;
        }
        int top=st.pop();
        removeFromIndex(st,index);
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
        // removeFromBootom(st);
        // System.out.println(st);
        removeFromIndex(st,2);
        System.out.println(st);
    }
}
