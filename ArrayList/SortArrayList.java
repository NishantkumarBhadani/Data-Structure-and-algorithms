import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(50);
        list.add(40);
        list.add(25);
        list.add(20);
        list.add(10);
        System.out.println("Input array");
        System.out.println(list);

        //ascending order sorting
        Collections.sort(list);
        System.out.println("Array is sorted in ascending order:"+list);

        //desending order
        Collections.sort(list,Collections.reverseOrder());
        System.out.println("Array is sorted in desending order:"+list);
    }
}
