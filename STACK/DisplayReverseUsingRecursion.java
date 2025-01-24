package STACK;

import java.util.Stack;

public class DisplayReverseUsingRecursion {
    public static void displayRevByRecursion(Stack<Integer> st){
        if(st.size()==0){
            return;
        }
        int top=st.pop();
        System.out.print(top+ " ");
        displayRevByRecursion(st);
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
        displayRevByRecursion(st);
    }
}
