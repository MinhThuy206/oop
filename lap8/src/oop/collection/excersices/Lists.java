package oop.collection.excersices;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Lists {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        insertFirst(list, 3);
        System.out.println(list);
        insertLast(list, 5);
        System.out.println(list);
        replace(list, 7);
        System.out.println(list);
        removeThird(list);
        System.out.println(list);
        removeEvil(list);
        System.out.println(list);

        ArrayList<Integer> arr = new ArrayList<>();
        arr = generateSquare();
        System.out.println(arr);
        System.out.println(contains(list, 3));

        copy(list, arr);
        System.out.println(arr);
        reverse(list);
        System.out.println(list);
        reverseManual(list);
        System.out.println(list);

        LinkedList<Integer> list1 = new LinkedList<>();
        insertBeginningEnd(list1, 3);
        System.out.println(list1);

    }


    public static void insertFirst(ArrayList<Integer> list, int value) {
        if (list == null) {
            return;
        }
        list.add(0, value);
    }

    public static void insertLast(ArrayList<Integer> list, int value) {
        if (list == null) {
            return;
        }
        list.add(list.size() - 1, value);
    }

    public static void replace(ArrayList<Integer> list, int value) {
        if (list == null || list.size() < 3) {
            return;
        }
        list.set(2, value);
    }

    public static void removeThird(ArrayList<Integer> list) {
        list.remove(2);
    }

    public static void removeEvil(ArrayList<Integer> list) {
        if (list == null) {
            return;
        }
        list.removeAll(List.of(666));
    }

    public static ArrayList<Integer> generateSquare() {
        ArrayList<Integer> lists = new ArrayList<>();
        for (int i = 1; i < 11; i++) {
            lists.add(i * i);
        }
        return lists;
    }

    public static boolean contains(ArrayList<Integer> list, int value) {
        return list.contains(value);
    }

    public static void copy(ArrayList<Integer> source, ArrayList<Integer> target) {
        if (source == null) {
            return;
        }
        target.clear();
        for (int i = 0; i < source.size(); i++) {
            target.add(source.get(i));
        }
    }

    public static void reverse(ArrayList<Integer> list) {

        if (list == null) {
            return;
        }
        Collections.reverse(list);
    }

    public static void reverseManual(ArrayList<Integer> list) {
        ArrayList<Integer> reverse = new ArrayList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            reverse.add(list.get(i));
        }
    }

    public static void insertBeginningEnd(LinkedList<Integer> list, int value) {
        list.addFirst(value);
        list.addLast(value);
    }
}
