public class reverse {
    public static void main(String[] args) {
        int arr[]={1,2,5,8,7,5};
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        System.out.println("Reverse array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(+arr[i]);
        }

    }
}
