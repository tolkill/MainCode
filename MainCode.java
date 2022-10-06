package leeson112;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;

public class MainCode {
    public static <Orange, Apple> void main(String[] args) {

        Integer arr1[] = {1, 2, 3, 4, 5, 6, 7};
        String arr2[] = {"A", "B", "C"};
        swap(arr1, 1, 4);
        swap(arr2, 0, 2);

        String[] arrayOfStrings = {"A", "B", "C", "D"};
        asList(arrayOfStrings);

        Box or = new Box();
        Box or1 = new Box();
        Box ap = new Box();
        Box ap1 = new Box();
        System.out.println("Task3");
        System.out.println("'g' - addFruit: ");
        or.add(new Orange(), 10);
        or1.add(new Orange(), 12);
        ap.add(new Apple(), 8);
        ap1.add(new Apple(), 4);
        System.out.println("Box 1: " + or.getHeight());
        System.out.println("Box 2: " + or1.getHeight());
        System.out.println("Box 3: " + ap.getHeight());
        System.out.println("Box 4: " + ap1.getHeight());
        System.out.println("'e' - compare(): ");
        System.out.println("Box 1 equals box 3: " + or.compWriteObjectNotify());
        System.out.println("Box 2 equals box 4: " + or1.compWriteObjectNotify(ap1));
        System.out.println("'f' - pourTo(): ");
        or.add(or1);
        ap.add(ap1);
        System.out.println("'d' - getWeight(): ");
        System.out.println("Box 1: " + or.getHeight());
        System.out.println("Box 2: " + or1.getHeight());
        System.out.println("Box 3: " + ap.getHeight());
        System.out.println("Box 4: " + ap1.getHeight());


    }

    public static void swap(Object[] arr, int n1, int n2) {
        System.out.println("Task1: " + Arrays.toString(arr));
        Object sw = arr[n1];
        arr[n1] = arr[n2];
        arr[n2] = sw;
        System.out.println("The result of the replacement: " + Arrays.toString(arr) + "\n================================");
    }

    public static <T> void asList(T[] arr) {

        ArrayList<T> alt = new ArrayList<>(Arrays.asList(arr));
        System.out.println("Task2 and the result of the conversion : " + alt + "\n================================");
    }
}
