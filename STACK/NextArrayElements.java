package STACK;

import java.util.Stack;

public class NextArrayElements {

    public static void nextGreaterElement(int arr[]){
        int [] res=new int[arr.length];
        Stack<Integer> st=new Stack<>();

        st.push(arr[arr.length-1]);
        res[arr.length-1]=-1;

        for(int i=arr.length-2;i>=0;i--){
            while(st.size()>0 && st.peek()<arr[i]){
                st.pop();
            }
            if(st.size()==0){
                res[i]=-1;
            }
            else{
                res[i]=st.peek();
            }
            st.push(arr[i]);
        }
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={1,3,2,1,8,6,3,4};
        nextGreaterElement(arr);
        
    }
}
