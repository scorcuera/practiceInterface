import java.util.ArrayList;

public class IntArrayList implements IntList {
    private int capacity = 10;
    private ArrayList<Integer> arrayList = new ArrayList<Integer>(capacity);
    @Override
    public void add(int number) {
        if (arrayList.size() < 10) {
            arrayList.add(number);
        } else {
            capacity *= 1.5;
            ArrayList<Integer> tempArrayList = new ArrayList<Integer>(capacity);
            for (int i = 0; i < arrayList.size(); i++) {
                tempArrayList.add(arrayList.get(i));
            }
            tempArrayList.add(number);
            arrayList = tempArrayList;
        }
    }

    @Override
    public void get(int number) {

    }
}
