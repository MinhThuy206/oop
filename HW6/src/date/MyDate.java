package date;

public class MyDate {

    public static final String[] MONTHS = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    public static final String[] DAYS = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    public static final int[] DAY_IN_MONTHS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    private int year;
    private int month;
    private int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isValidDate(int year, int month, int day) {
        if (year > 9999 || year < 1) {
            return false;
        }
        if (month > 12 || month < 1) {
            return false;
        }
        int maxDay = DAY_IN_MONTHS[month - 1];
        if (isLeapYear(year) && month == 2) {
            maxDay = 29;
        }
        return day >= 1 && day <= maxDay;
    }

    public static int getDayOfWeek(int year, int month, int day) {
        int[] Digit = {4, 2, 0, 6, 4, 2, 0, 6};
        int[] digitNonLeapYear = {0, 3, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};
        int[] digitLeapYear = {6, 2, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};
        int twofistdigitOfYear = year / 100;
        int twolastdigitOfYear = year - 100 * twofistdigitOfYear;
        int dayOfWeek;
        if (isLeapYear(year)) {
            dayOfWeek = (Digit[twofistdigitOfYear - 17] + twolastdigitOfYear + twolastdigitOfYear / 4 + digitLeapYear[month - 1] + day) % 7;
        } else {
            dayOfWeek = (Digit[twofistdigitOfYear - 17] + twolastdigitOfYear + twolastdigitOfYear / 4 + digitNonLeapYear[month - 1] + day) % 7;
        }
        return dayOfWeek;
    }

    public void setDate(int year, int month, int day) {
        if (isValidDate(year, month, day)) {
            this.year = year;
            this.month = month;
            this.day = day;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return DAYS[getDayOfWeek(year, month, day)] + " " + day + " " + MONTHS[month - 1] + " " + year;
    }

    public MyDate nextDay() {
        day++;
        if (!(isValidDate(year, month, day))) {
            month++;
            day = 1;
            return this;
        }
        if (!(isValidDate(year, month, day))) {
            year++;
            month = 1;
            return this;
        }
        return this;
    }

    public MyDate nextMonth() {
        month++;
        if (!(isValidDate(year, month, day))) {
            month = 1;
            year++;
            return this;
        }
        return this;
    }

    public MyDate nextYear() {
        year++;
        if (!(isValidDate(year, month, day))) {
            if (month == 29) {
                month = 28;
                return this;
            } else {
                return null;
            }
        }
        return this;
    }

    public MyDate previousDay() {
        day--;
        if (!(isValidDate(year, month, day))) {
            month--;
            if (month == 0)
                month = 12;
            day = DAY_IN_MONTHS[month - 1];
            return this;
        }
        if (!(isValidDate(year, month, day))) {
            year--;
            month = 12;
            return this;
        }
        return this;
    }

    public MyDate previousMonth() {
        month--;
        if (!(isValidDate(year, month, day))) {
            if (month == 0) {
                month = 12;
                day = DAY_IN_MONTHS[month - 1];
                year--;
                return this;
            } else
                day = DAY_IN_MONTHS[month - 1];
            year--;
            return this;
        }
        return this;
    }

    public MyDate previousYear() {
        year--;
        if (!(isValidDate(year, month, day))) {
            if (day == 29) {
                day = 28;
                return this;
            } else
                return null;
        }
        return this;
    }

}
