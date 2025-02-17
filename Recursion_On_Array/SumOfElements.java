package Recursion_On_Array;

public class SumOfElements {
    public static int sumofArrayElement(int [] arr,int idx){
        if(idx==arr.length-1){
            return arr[idx];
        }
        int smallSum=sumofArrayElement(arr,idx+1);
        return arr[idx]+smallSum;
    }
    public static void main(String[] args) {
        int arr[]={5,4,1,6,1};
        int idx=0;
    System.out.println(sumofArrayElement(arr,idx));
    }
}
