package singleton;

public class Application {
    public static void main(String[] args) {
        Database database1 = Database.getInstance();
        database1.query("SELECT * FROM K65A6");

        Database database2 = Database.getInstance();
        database2.query("SELECT * FROM K65A6");

        System.out.println(database1 == database2);
    }
}
