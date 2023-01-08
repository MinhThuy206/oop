import java.util.Scanner;

public class GradesStatistics {
    public static void main(String[] args) {
        final int numStudent;
        int[] grades;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of student: ");
        numStudent = sc.nextInt();
        grades = new int[numStudent];

        for (int i = 0; i < grades.length; i++) {
            System.out.print("Enter the number of student " + (i + 1) + ": ");
            grades[i] = sc.nextInt();
        }

        double sum = 0.0;
        for (int grade : grades) {
            sum += grade;
        }
        double ave = sum / grades.length;
        System.out.printf("The average is : %.2f", ave);
        System.out.println();

        int min = grades[0];
        for (int grade : grades) {
            if (grade < min)
                min = grade;
        }
        System.out.println("The minimum is : " + min);

        int max = grades[0];
        for (int grade : grades) {
            if (grade > max)
                max = grade;
        }
        System.out.println("The maximum is : " + max);
    }
}
