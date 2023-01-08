package oop.collection.excersices;

import java.util.*;

public class Sets {
    public static Set<Integer> intersectionManual(Set<Integer> first, Set<Integer> second) {
        Set<Integer> result = new HashSet<>();
        for (Integer i : first) {
            if((second.contains(i)))
            result.add(i);
        }
        return result;
    }

    public static Set<Integer> unionManual(Set<Integer> first, Set<Integer> second) {
        Set<Integer> result = new HashSet<>();
        for (Integer i : first) {
            result.add(i);
        }
        for (Integer i : second) {
            result.add(i);
        }
        return result;
    }

    public static Set<Integer> intersection(Set<Integer> first, Set<Integer> second) {
        Set<Integer> result = new HashSet<>(first);
        result.retainAll(second);
        return result;
    }

    public static Set<Integer> union(Set<Integer> first, Set<Integer> second) {
        Set<Integer> result = new HashSet<>(first);
        result.addAll(second);
        return result;

    }

    public static List<Integer> toList(Set<Integer> source) {
        return new ArrayList<>(source);
    }

    public static List<Integer> removeDuplicates(Set<Integer> source) {
        return new ArrayList<>(new HashSet<>(source));

    }

    public static List<Integer> removeDuplicatesManual(Set<Integer> source) {
        List<Integer> result = new ArrayList<>();
        for (Integer i : source) {
            if (result.contains(i)) {
                result.add(i);

            }
        }
        return result;
    }

    public static String firstRecurringCharacter(String s) {
        if (s == null || s.length() == 0) {
            return null;
        }
        Set<String> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            String res = s.charAt(i) + "";
            if (set.contains(res)) {
                return res;
            }
            set.add(res);
        }
        return null;
    }

    public static Set<Character> allRecurring(String s) {
        Set<Character> set = new HashSet<>();
        Set<Character> res = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (set.contains(c)) {
                res.add(c);
            } else {
                set.add(c);
            }

        }
        return res;
    }

    public static Integer[] toArray(Set<Integer> source) {
        return source.toArray(new Integer[0]);
    }

    public static int getFirst(TreeSet<Integer> source) {
        return source.first();
    }

    public static int getLast(TreeSet<Integer> source) {

        return source.last();
    }

    public static int getGreater(TreeSet<Integer> source, int value) {

        return source.higher(value);
    }

}
