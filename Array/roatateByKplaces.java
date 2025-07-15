import java.util.*;
public class roatateByKplaces {

    public static int[] rotate(int arr[],int k,int n){
        int temp[]=new int[k];
        for(int i=0;i<k;i++){
            temp[i]=arr[i];
        }
        for(int i=k;i<n;i++){
            arr[i-k]=arr[i];
        }
        for(int i=n-k;i<n;i++){
            arr[i]=temp[i-(n-k)];
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[]={1,4,7,2,8,4};
        int k=3;
        int n=arr.length;
        System.out.println(Arrays.toString(rotate(arr,k,n)));


    }
}
