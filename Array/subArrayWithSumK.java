public class subArrayWithSumK {

    public static int brutForce(int arr[],int k){
        int len=0;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];
                if(sum==k){
                    int l1=Math.max(len,j-i+1);
                    len=l1;
                }
            }
        }
        return len;
    }
     public static void main(String[] args) {
        int arr1[]={1,2,3,4,5,4,2};
        int k=6;
        System.out.println("Length:"+brutForce(arr1, k));
     }
}
