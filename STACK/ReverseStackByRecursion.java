package STACK;

import java.util.Stack;

public class ReverseStackByRecursion {
    public static void pushAtbottom(Stack<Integer>st,int x){
        if(st.size()==0){
            st.push(x);
            return;
        }
        int top1=st.pop();
        pushAtbottom(st, x);
        st.push(top1);

    }
    public static void reverseElement(Stack <Integer> st){
        if(st.size()==1){
            return;
        }
        int top=st.pop();
        reverseElement(st);
        pushAtbottom(st,top);
    }
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(30);
        st.push(20);
        st.push(10);
        st.push(5);
        st.push(7);
        System.out.println(st);
        reverseElement(st);
        System.out.println(st);
    }
}
