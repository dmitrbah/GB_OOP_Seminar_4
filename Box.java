package homework;

import java.util.ArrayList;

public class Box<T extends Fruit> {

    private ArrayList<T> arrayList;

    Box(ArrayList<T> arrayList) {
        this.arrayList = arrayList;
    }

    public void addFriut(T fruit) {
        arrayList.add(fruit);
    }

    public float getWeight() {
        float resWeight = 0;
        for (T fruit : arrayList) {
            resWeight = resWeight + fruit.getWeight();
        }
        return resWeight;
    }

    public boolean compare(Box box) {
        return this.getWeight() == box.getWeight();
    }

}
