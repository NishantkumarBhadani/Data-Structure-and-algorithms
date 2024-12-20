import java.util.Scanner;

public class ReverseElement {

    public static void ReverseArray(int arr[]){
        for(int i=arr.length-1;i>=0;i--){
            System.out.println("Reversed array :"+arr[i]);
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        ReverseArray(arr);

    }
    
}
