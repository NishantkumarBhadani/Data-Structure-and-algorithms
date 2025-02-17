package Recursion_On_Array;

public class LinearSearch {

    public static boolean linearSearch(int arr[],int target,int idx){

        //base case
        if(idx==arr.length) return false;

        //self work
        if(arr[idx]==target) return true;

        //recursive relation
        return linearSearch(arr, target, idx+1);
    }

    public static int linearSearchIndex(int arr[],int target,int idx){

        //base case
        if(idx==arr.length) return -1;

        //self work
        if(arr[idx]==target) return idx;

        //recursive relation
        return linearSearchIndex(arr, target, idx+1);
    }


    public static void main(String[] args) {
        int arr[]={1,4,7,8,5};
        int idx=0;
        int target=7;

        // if(linearSearch(arr,target,idx)){
        //     System.out.println("Yes");
        // }
        // else{
        //     System.out.println("No");
        // }

        System.out.println(linearSearchIndex(arr, target, idx));
    }
}
