import java.util.Scanner;

public class SphereComputation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius, surfaceArea, volume;
        System.out.print("Enter the radius : ");
        radius = sc.nextDouble();

        surfaceArea = 4 * Math.PI * radius * radius;
        volume = (double) 4 / 3 * Math.PI * radius * radius * radius;
        System.out.printf("SurfaceArea is : %.2f%n ", surfaceArea);
        System.out.printf("Volume is : %.2f%n ", volume);

    }
}
