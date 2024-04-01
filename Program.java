package homework;

import java.util.ArrayList;

public class Program {

    public static void main(String[] args) {

        Apple apple = new Apple();
        Box<Apple> appleBox = new Box<>(new ArrayList<>());
        appleBox.addFriut(apple);
        appleBox.addFriut(apple);
        appleBox.addFriut(apple);
        System.out.println(appleBox.getWeight());

        Orange orange = new Orange();
        Box<Orange> orangeBox = new Box<>(new ArrayList<>());
        orangeBox.addFriut(orange);
        orangeBox.addFriut(orange);
        System.out.println(orangeBox.getWeight());

        System.out.println(appleBox.compare(orangeBox));
    }

}
