package Recursion_On_Array;

public class printArrayRecursion {

    public static void printArray(int arr[],int idx){
        if(idx==arr.length){
        return;
        }
        System.out.println(arr[idx]);
        printArray(arr, idx+1);
    }
    public static void main(String[] args) {
        int [] arr ={112,4,7,5,8};
        int idx=0;
        printArray(arr, idx);
    }
}
