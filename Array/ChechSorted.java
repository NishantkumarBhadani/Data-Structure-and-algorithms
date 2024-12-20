import java.util.Scanner;

public class ChechSorted {
    public static boolean SortedChecking(int arr[]){
        boolean isAsendingSorted=true;
        boolean isDesendingSorted=true;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i+1]<arr[i]){
                isAsendingSorted=false;
                break;
            }
            
        }
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i+1]>arr[i]){
                isDesendingSorted=false;
                break;
            }
            
        }
        return isAsendingSorted||isDesendingSorted;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        boolean result=SortedChecking(arr);
        if(result==true){
            System.out.println("Sorted");
        }
        else{
            System.out.println("Not Sorted");
        }

    }
}
