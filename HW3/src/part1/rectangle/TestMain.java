package part1.rectangle;

public class TestMain {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(1.2f, 3.4f);
        System.out.println(rectangle1);
        Rectangle rectangle2 = new Rectangle();
        System.out.println(rectangle2);

        rectangle1.setLenght(5.6f);
        rectangle2.setWidth(7.8f);
        System.out.println(rectangle1);
        System.out.println("lenght is : " + rectangle1.getLenght());
        System.out.println("Width is : " + rectangle1.getWidth());

        System.out.printf("area is : %.2f%n", rectangle1.getArea());
        System.out.printf("perimeter : %.2f%n", rectangle1.grtPerimeter());
    }
}
