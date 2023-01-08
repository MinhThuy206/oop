package geometricobject;

public class TestMain {
    public static void main(String[] args) {
        Circle circle = new Circle(5.5);
        System.out.println(circle);
        System.out.println(circle.getPerimeter());
        System.out.println(circle.getArea());

        Rectangle rectangle = new Rectangle(2.0, 3.0);
        System.out.println(rectangle);
        System.out.println(rectangle.getPerimeter());
        System.out.println(rectangle.getArea());
    }
}
