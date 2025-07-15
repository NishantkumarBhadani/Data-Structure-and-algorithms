import java.util.HashMap;

public class frequesncy {

    //T.c=O(n*n)
    public static void freq(int arr[],int n){
        boolean visited[]=new boolean[n];
        
        for(int i=0;i<n;i++){
            if(visited[i]==true){
                continue;
            }
            int count=1;
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    visited[j]=true;
                    count++;
                }
            }
            System.out.println(arr[i]+":"+count);
        }
    }
    //using map

    public static void freqUsingMap(int arr[],int n){
        HashMap<Integer,Integer>mp=new HashMap<>();
        for(int i=0;i<n;i++){
            if(mp.containsKey(arr[i])){
                mp.put(arr[i],mp.get(arr[i])+1);
            }
            else{
                mp.put(arr[i],1);
            }
        }
        for (HashMap.Entry<Integer, Integer> entry : mp.entrySet()) {
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }
    public static void main(String[] args) {
        int arr[]={5,9,5,1,4,2,5,7,-1,0,-1,0};
        int n=arr.length;
        // freq(arr, n);
        freqUsingMap(arr, n);
    }
}
