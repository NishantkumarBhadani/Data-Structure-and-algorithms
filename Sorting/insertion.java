import java.util.Scanner;


public class insertion{
    static  void insertion(int arr[],int n){
    for(int i=0;i<n;i++){
        int j=i;
        while(j>0 && arr[j-1]>arr[j]){
            int temp=arr[j-1];
            arr[j-1]=arr[j];
            arr[j]=temp;
            j--;
        }
    }
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter array size:");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        insertion(arr,n);
        for(int ar:arr){
            System.out.println(ar);
        }
    }
}