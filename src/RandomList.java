import java.util.ArrayList;

public class RandomList {
    private int size;
    private ArrayList<Integer> arrayList;
    public RandomList(int size){
        this.size = size;
        arrayList = new ArrayList<>(size);
    }
    public void setList() {
        for (int i = 0; i < size; i++) {
            int element1 = (int) (Math.random() * 100);
            int element2 = (int) (Math.random() * 10);
            int element = element1 + element2;
            arrayList.add(i, element);
        }
    }
    public void display() {
        for (Integer integer : this.arrayList) {
            System.out.print(integer + " , ");
        }
    }
    public void fillerOdd() throws Exception {
        ArrayList<Integer> temp = new ArrayList<>();
        int j = 0;
        for (Integer integer : arrayList) {
            if (integer % 2 == 0) {
                temp.add(j, integer);
                j++;
            }
        }
        arrayList = null;
        arrayList = temp;
    }
}
