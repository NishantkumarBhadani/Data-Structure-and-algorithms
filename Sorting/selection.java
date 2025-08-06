import java.util.Scanner;

public class selection{

    static void selection(int arr[],int n){
        for(int i=0;i<=n-2;i++){
            int min=i;
            for(int j=i;j<=n-1;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;

        }
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
        selection(arr,n);
        for(int ar:arr){
            System.out.println(ar);
        }
    }
}