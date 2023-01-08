import java.util.Arrays;
import java.util.Scanner;

public class GradesStatistics1_3 {
    public static int[] grades;

    public static void main(String[] args) {
        readGrades();
        System.out.print("The grades are : ");
        print(grades);
        System.out.println("The average is " + average(grades));
        System.out.println("The median is " + median(grades));
        System.out.println("The minimum is " + min(grades));
        System.out.println("The maximum is " + max(grades));
        System.out.printf("The standard deviation is: %.2f", stdDev(grades));

    }

    public static void readGrades() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int number = sc.nextInt();
        grades = new int[number];
        for (int i = 0; i < number; i++) {
            System.out.print("Enter the grade for student " + (i + 1) + " : ");
            grades[i] = sc.nextInt();
        }
    }

    public static void print(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    public static double average(int[] array) {
        double sum = 0.0;
        for (int j : array) {
            sum += j;
        }
        return sum / array.length;
    }

    public static double median(int[] array) {
        int idx = array.length / 2;
        double med;
        Arrays.sort(array);
        if (array.length % 2 == 0) {
            med = (array[idx - 1] + array[idx]) / 2;
        } else {
            med = array[idx];
        }
        return med;
    }

    public static int max(int[] array) {
        int max = array[0];
        for (int i : array)
            if (i > max)
                max = i;
        return max;
    }

    public static int min(int[] array) {
        int min = array[0];
        for (int i : array)
            if (i < min)
                min = i;
        return min;
    }

    public static double stdDev(int[] array) {
        double u = average(array);
        double stddev = 0.0;
        for (int j : array) {
            stddev += (j * j - u * u);
        }
        stddev = Math.sqrt(stddev / array.length);
        return stddev;
    }
}
