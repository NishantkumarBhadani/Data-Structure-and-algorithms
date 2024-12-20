public class ArrayADT {
    private int capacity;
    private int size;
    private int array[];

    public ArrayADT(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.array = new int[this.capacity];
    }

    // Insert element

    public void insert(int value) {
        if (size == capacity) {
            System.out.println("Array is already full.");
        } else {
            array[size] = value;
            size++;
        }
    }

    // Delete element

    public void Delete(int deletedIndex) {
        if (deletedIndex < 0 || deletedIndex > size) {
            System.out.println("The array is empty");
        } else {
            for (int i = deletedIndex; i < size-1; i++) {
                array[i] = array[i + 1];
            }
            size--;
        }
    }

    // Search

    public void Search(int target) {
        int indexResult = -1;
        for (int i = 0; i < size; i++) {
            if (array[i] == target) {
                indexResult = i;
                break;
            }
        }
        if (indexResult == -1) {
            System.out.println("Element is not present in the array");
        } else {
            System.out.println("Element is found at index number:" + indexResult);
        }

    }
    // update element
    public void updateElement(int updateIndex,int value){
        if(updateIndex<0||updateIndex>size){
            System.out.println("Invalid updation");
            return;
        }
        array[updateIndex]=value;
        
    }

    // traverse
    public void traverse() {
        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);
        }
    }
    //get size
    public void getSize(){
        
    }

    public static void main(String[] args) {
        ArrayADT arr = new ArrayADT(5);
        arr.insert(5);
        arr.insert(8);
        arr.insert(10);
        arr.insert(17);
        arr.insert(13);
        arr.traverse();
        arr.Delete(2);
        arr.traverse();
        arr.Search(5);
        // arr.Search(12);
        arr.updateElement(2, 28);
        arr.traverse();

    }
}
