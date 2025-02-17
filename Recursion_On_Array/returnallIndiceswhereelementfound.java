package Recursion_On_Array;

public class returnallIndiceswhereelementfound {

    public static void allindices(int arr[],int n,int idx,int target){
        //base case
        if(idx>=n) return;

        //self work
        if(arr[idx]==target){
            System.out.println(idx);
        }

        //Recursive work
        allindices(arr, n, idx+1, target);
    }
    public static void main(String[] args) {
        int arr[]={1,4,7,8,7, 5 , 8 ,7 , 2};
        int idx=0;
        int target=7;
        int n=arr.length;
        allindices(arr, n, idx, target);
    }
}
