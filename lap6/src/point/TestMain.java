package point;

import java.util.Arrays;

public class TestMain {
    public static void main(String[] args) {
        Point3D point3D = new Point3D(1, 2, 3);
        System.out.println(point3D);

        point3D.setX(2);
        System.out.println(point3D);

        point3D.setY(3);
        System.out.println(point3D);

        point3D.setXYZ(4, 5, 6);
        System.out.println(point3D);

        System.out.println(point3D.getX());
        System.out.println(point3D.getY());


        System.out.println(Arrays.toString(point3D.getXYZ()));
    }
}
