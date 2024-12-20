import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ReverseArrayList {
    public static void Reverse(ArrayList<Integer> list){
        int i=0,j=list.size()-1;
        while(i<j){
            Integer temp=Integer.valueOf(list.get(i));
            list.set(i, list.get(j));
            list.set(j, temp);
            i++;
            j--;
            
        }
        
        System.out.println("So the reverse array is:");
        System.out.println(list);
    }
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(50);
        list.add(40);
        list.add(25);
        list.add(20);
        list.add(10);
        System.out.println("Input array");
        System.out.println(list);

        // Reverse(list);
        
        Collections.reverse(list);
        System.out.println(list);




    }
}
