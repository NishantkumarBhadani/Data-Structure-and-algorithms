import java.util.Scanner;

public class TransposeOfMatrix {
    static void printMatrix(int [][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    static int[][] Transpose(int arr1[][], int r1, int c1){
        int [][] ans=new int[c1][r1];
        for(int i=0;i<c1;i++){
            for(int j=0;j<r1;j++){
                ans[i][j]=arr1[j][i];
            }
        }
        return ans;
    }
     public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows and column of matrix 1:");
        int r1=sc.nextInt();
        int c1=sc.nextInt();
        int arr1[][]=new int[r1][c1];
        System.out.println("Enter the element of matrix1:");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                 arr1[i][j]=sc.nextInt();
            }
        }
        int[][] answer=Transpose(arr1, r1, c1);
        printMatrix(answer);
    }
}
