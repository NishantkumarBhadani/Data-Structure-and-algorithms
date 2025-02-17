package Recursion_On_Array;

public class isSorted {

    public static boolean isSortedArray(int arr[],int n,int idx){
        //base case
       if(idx>=n-1){
        return true;
       }
        //self work
        if(arr[idx]<=arr[idx+1]){
            return isSortedArray(arr, n, idx+1);
        }
        else{
            return false;
        }

        
    }
    public static void main(String[] args) {
        int arr[]={1,4,5,7,8,9};
        int idx=0;
        int n=arr.length;
        boolean ans=isSortedArray(arr,n,idx);
        System.out.println(ans);
    }
    
}
