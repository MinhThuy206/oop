import java.util.Arrays;

public class Print {
    public static void main(String[] args) {
        int[] intEmp = {};
        float[] floatEmp = {};
        double[] doubleEmp = {};

        int[] intOne = {2};
        float[] floatOne = {0.1F};
        double[] doubleOne = {0.2};


        int[] intTestMul = {1, 2, 3, 4, 5};
        float[] floatMul = {0.1F, 0.2F};
        double[] doubleMul = {1.1, 2.2};

        print(intOne);
//        print(floatOne);
//        print(doubleOne);
        print(intEmp);
//        print(floatEmp);
//        print(doubleEmp);
        print(intTestMul);
//        print(floatTestMul);
//        print(doubleTestMul);

    }

    static void print(int[] array) {
        if (array.length == 0) {
            System.out.print("[]");
        } else {
            System.out.print("[" + array[0]);
            for (int i = 1; i < array.length; i++) {
                System.out.print(", " + array[i]);
            }
            System.out.print("]");
        }
    }

    static void print(float[] array) {
        System.out.println(Arrays.toString(array));
    }

    static void print(double[] array) {
        System.out.println(Arrays.toString(array));
    }
}

