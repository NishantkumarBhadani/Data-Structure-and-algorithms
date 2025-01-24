package STACK;

import java.util.Stack;

public class InsertInStack {

    public static void insertAtBottom( Stack <Integer> st,int x){
        Stack<Integer> rt=new Stack<>();
        while(st.size()>0){
            rt.push(st.pop());
        }
        st.push(x);
        while(rt.size()>0){
            st.push(rt.pop());
        }
    }
    public static void insertAtAnyIndex(Stack <Integer> st,int index,int x){
        Stack <Integer> rt=new Stack<>();
        while(st.size()>index){
            rt.push(st.pop());
        }
        st.push(x);
        while(rt.size()>0){
            st.push(rt.pop());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(30);
        st.push(20);
        st.push(10);
        st.push(5);
        st.push(7);
        st.pop();
        System.out.println(st);
        insertAtBottom(st, 9);
        System.out.println(st);
        insertAtAnyIndex(st, 3, 18);
        System.out.println(st);
    }
}
