public class insertInArray {

    public static void insertAtBegin(int arr[],int n,int value){
        for(int i=n-1;i>=0;i--){
            arr[i+1]=arr[i];
        }
        arr[0]=value;
    }
    public static void insertAtEnd(int arr[],int n,int value){
        arr[n]=value;
    }
    public static void insertAtPosi(int arr[],int n,int pos,int value){
        for(int i=n-1;i>=pos-1;i--){
            arr[i+1]=arr[i];
        }
        arr[pos-1]=value;
    }
    public static void main(String[] args) {
        int n=10;
        int arr[]={1,1,25,1,25,18,6,9,6,8,0};
        int value=3;
        int pos=3;
        // insertAtBegin(arr, n,value);
        // insertAtEnd(arr, n, value);
        insertAtPosi(arr, n, pos, value);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        


    }
}
