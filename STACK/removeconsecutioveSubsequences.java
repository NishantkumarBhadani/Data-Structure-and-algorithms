package STACK;

import java.util.Stack;

public class removeconsecutioveSubsequences {
    public static int[] remove(int arr[]){
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<arr.length;i++){
            if(st.size()==0||st.peek()!=arr[i]){
                st.push(arr[i]);
            }
            else{
                if(i==arr.length-1||arr[i]!=arr[i+1]){
                    st.pop();
                }
            }
        }
        int res1[]=new int[st.size()];
        for(int i=res1.length-1;i>=0;i--){
            res1[i]=st.pop();
        }
        
        return res1;
    }
    public static void main(String[] args) {
        int arr[]={1,2,2,3,10,10,10,4,4,4,5,7,7,2};
        int res[]=remove(arr);
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }
}
