import java.util.Scanner;

public class RotateArrayBY90 {

    static void printMatrix(int [][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void transposeInplace(int arr1[][],int r){
        for(int i=0;i<r;i++){
            for(int j=i;j<r;j++){
                int temp=arr1[i][j];
                arr1[i][j]=arr1[j][i];
                arr1[j][i]=temp;
            }
        }
    }
    static void reverseArray(int[]arr){
        int i=0,j=arr.length-1;
        while(i<j){
           int  temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
        }
    }
    static void rotate(int[][] matrix,int n){
        transposeInplace(matrix, n);

        //reverse
        for(int i=0;i<n;i++){
            reverseArray(matrix[i]);
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows and column of matrix 1:");
        int r=sc.nextInt();  //since it is square matrix so r=c
        int arr1[][]=new int[r][r];
        System.out.println("Enter the element of matrix1:");
        for(int i=0;i<r;i++){
            for(int j=0;j<r;j++){
                 arr1[i][j]=sc.nextInt();
            }
        }
        rotate(arr1, r);
        printMatrix(arr1);
    }
}
