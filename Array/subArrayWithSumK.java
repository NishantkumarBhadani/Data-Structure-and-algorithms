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

    public static int optimal(int arr[],int k){
        int n=arr.length;
        int l=0;
        int r=0;
        int maxLen=0;
        int sum=arr[0];
        while(r<n){
            while(l<r && sum>k){
                sum-=arr[l];
                l++;
            }
            if(sum==k){
                maxLen=Math.max(maxLen,r-l+1);
            }
            r++;
            if(r<n){
                sum+=arr[r];
            }
        }
        return maxLen;
    }
     public static void main(String[] args) {
        int arr1[]={1,2,3,4,5,4,2};
        int k=6;
        System.out.println("Length:"+brutForce(arr1, k));
        System.out.println(optimal(arr1, k));
     }
}
