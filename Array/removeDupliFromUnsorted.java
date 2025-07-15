import java.util.HashMap;

public class removeDupliFromUnsorted {

    public static void remove(int arr[]){
        int n=arr.length;
        boolean check[]=new boolean[n];
        for(int i=0;i<n;i++){
            check[i]=true;
        }
        for(int i=0;i<n;i++){
            if(check[i]==true);
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    check[j]=false;
                }
            }
        }
        for(int i=0;i<n;i++){
            if(check[i]==true){
                System.out.println(arr[i]+" ");
            }
        }
    }

    public static void removeUsingHashMap(int arr[]){
        int n=arr.length;
        HashMap<Integer,Integer>mp=new HashMap<>();
        for(int i=0;i<n;i++){
            if(!mp.containsKey(arr[i])){
                System.out.println(arr[i]);
                mp.put(arr[i],1);
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={1,1,25,1,25,18,6,9,6,8};
        remove(arr);
        System.out.println();
        removeUsingHashMap(arr);

    }
}
