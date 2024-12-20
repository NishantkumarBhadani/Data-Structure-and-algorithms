import java.util.ArrayList;

public class ArrayListOperation {
    public static void main(String[] args) {
        ArrayList<Integer> l1= new ArrayList<>();

        //add new element
        l1.add(5);
        l1.add(10);
        l1.add(15);

        //print with for loop
        for(int i=0;i<l1.size();i++){
            System.out.println(l1.get(i));
        }

        //get an element
        System.out.println(l1.get(1));

        //printing the element without four loop
        System.out.println(l1);

        //adding the element at specigic index
        l1.add(1,15);
        System.out.println(l1);

        //modifying element at any index
        l1.set(0, 7);
        System.out.println(l1);

        //removing any element 
        l1.remove(0);
        System.out.println(l1);

        //removing element by its value
        l1.remove(Integer.valueOf(10));
        System.out.println(l1);

        //checking any element exist or not
        boolean ans=l1.contains(Integer.valueOf(17));
        System.out.println(ans);


    }
}
