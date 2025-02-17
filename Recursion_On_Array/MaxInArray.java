package Recursion_On_Array;

public class MaxInArray {

    public static int maximum(int []arr,int idx){
        if(idx==arr.length-1){
            return arr[idx];
        }

        int smallAns=maximum(arr, idx+1);
        return Math.max(arr[idx],smallAns);
    }
    public static void main(String[] args) {
        int arr[]={15,4,7,8,9,10};
        int idx=0;
        System.out.println(maximum(arr,idx));
    }
}
