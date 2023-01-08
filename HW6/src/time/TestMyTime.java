package time;

public class TestMyTime {
    public static void main(String[] args) {
        MyTime myTime = new MyTime(9, 125, 10);
        System.out.println(myTime);

        myTime.setTime(11, 0, 0);
        System.out.println(myTime);

        System.out.println(myTime.nextSecond());
        System.out.println(myTime.previousSecond());

        System.out.println(myTime.getHour());
        System.out.println(myTime.getMinute());
        System.out.println(myTime.getSecond());

    }
}
