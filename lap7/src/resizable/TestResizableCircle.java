package resizable;

public class TestResizableCircle {
    public static void main(String[] args) {
        int percent = 50;
        ResizableCircle resizableCircle = new ResizableCircle(3.0);
        System.out.println(resizableCircle);
        System.out.println(resizableCircle.getArea());
        System.out.println(resizableCircle.getPerimeter());
        System.out.println(resizableCircle.resize(percent));
    }
}
