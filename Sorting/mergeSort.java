import java.util.Scanner;

public class mergeSort {

    static void conquer(int arr[],int low, int mid,int high){
        int mergedArray[]=new int[high-low+1];
        int idx1=low;
        int idx2=mid+1;
        int i=0;

        while(idx1<=mid && idx2<=high ){
            if(arr[idx1]<arr[idx2]){
                mergedArray[i++]=arr[idx1++];
            }
            else{
                mergedArray[i++]=arr[idx2++];
            }
        }
        while(idx1<=mid){
            mergedArray[i++]=arr[idx1++];
        }
        while(idx2<=high){
            mergedArray[i++]=arr[idx2++];
        }

        for (int j = 0,t=low; j < mergedArray.length; j++,t++) {
            arr[t]=mergedArray[j];
        }
    }
    public static void divide(int arr[],int low,int high){
        if(low>=high) return;

        int mid=low+(high-low)/2;

        divide(arr, low, mid);
        divide(arr, mid+1,high);
        conquer(arr,low,mid,high);
    }
      public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter array size:");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        divide(arr,0,n-1);
        for(int ar:arr){
            System.out.println(ar);
        }
    }
}
