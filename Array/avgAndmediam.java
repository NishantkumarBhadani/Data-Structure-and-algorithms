import java.util.Arrays;
import java.util.Scanner;
public class avgAndmediam {

    public static double avg(int arr[]){
        int n=arr.length;
        double sum=0.0;
        for(int i=0;i<n;i++){
            sum+=(double)arr[i];
        }
        return sum/n;
    }
    public static void median(int arr[]){

        Arrays.sort(arr);
        int n=arr.length;
        if(n%2==0){
            int idx1=n/2-1;
            int idx2=n/2;
            System.out.println("Median is:"+(double)(idx1+idx2)/2);
        }
        else{
            System.out.println("Median is:"+arr[n/2]);
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of elements:");
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(avg(arr));
        median(arr);
    }
}
