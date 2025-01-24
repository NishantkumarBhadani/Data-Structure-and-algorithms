package STACK;
import java.util.*;
public class MoveStackElement {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(30);
        st.push(20);
        st.push(10);
        st.push(5);
        st.push(7);

        System.out.println(st);

        Stack<Integer> gt=new Stack<>();
        while(st.size()>0){
            gt.push(st.pop());
        }
        Stack<Integer> rt=new Stack<>();
        while(gt.size()>0){
            rt.push(gt.pop());
        }
        System.out.println(rt);
    }
}
