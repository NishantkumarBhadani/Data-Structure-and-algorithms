
import java.util.ArrayList;

public class moveZeroToEnd {

    //brutforce
    public static int[] move(int arr[]){
        int i;
        int n=arr.length;
        ArrayList<Integer> list=new ArrayList<>();
        for(i=0;i<n;i++){
            if(arr[i]!=0){
                list.add(arr[i]);
            }
        }
        for(i=0;i<list.size();i++){
            arr[i]=list.get(i);
        }
        for(i=list.size();i<n;i++){
            arr[i]=0;
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[]={1,2,5,0,8,0,2,0,5};
        int result[]=move(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(result[i]);
        }
    }
}
