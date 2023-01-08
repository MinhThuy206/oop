package movable;

public class TestMovableCircle {
    public static void main(String[] args) {
        MovableCircle movableCircle = new MovableCircle(4, 5, 2, 1, 3);
        System.out.println(movableCircle);
        movableCircle.moveUp();
        System.out.println(movableCircle);
        movableCircle.moveDown();
        System.out.println(movableCircle);
        movableCircle.moveLeft();
        System.out.println(movableCircle);
        movableCircle.moveRight();
        System.out.println(movableCircle);
    }
}
