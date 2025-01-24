package STACK;

import java.util.Stack;

public class PushAtBottomByRecur {
    public static void pushAtbottom(Stack<Integer>st,int x){
        if(st.size()==0){
            st.push(x);
            return;
        }
        int top=st.pop();
        pushAtbottom(st, x);
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
        pushAtbottom(st, 8);
        System.out.println(st);
    }
}
