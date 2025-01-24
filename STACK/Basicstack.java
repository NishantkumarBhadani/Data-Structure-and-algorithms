package STACK;
import java.util.Stack;

public class Basicstack {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(30);
        st.push(20);
        st.push(10);
        st.push(5);
        st.push(7);
        st.pop();
        System.err.println(st.peek());
        System.out.println(st.size());

        System.out.println(st);
    }
}
