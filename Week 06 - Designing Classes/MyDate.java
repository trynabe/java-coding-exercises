public class MyDate {
    // Instance Variable
    public int year;
    private int month;
    private int day;
    private int objectNumber;

    // Static Class Variable
    private static int objectCounter;
    private static String[] strMonths = {"January","February","March","April","May","June","July","August","September","October","November","December"};

    // Constructors
    public MyDate(int aYear, int aMonth, int aDay){
        year = aYear;
        month = aMonth;
        day = aDay;
        objectCounter ++;
        objectNumber = objectCounter;
    }

    // Default Constructor
    public MyDate(){
        year = 1900;
        month = 1;
        day = 1;
        objectCounter ++;
        objectNumber = objectCounter;
    }

    // Static Method
    public static boolean isLeapYear(int year){
        if (year % 4 != 0){
            return false;
        } else if (year % 100 == 0 && year % 400 != 0){
            return true;
        } else if (year % 400 == 0 && year % 100 != 0){
            return false;
        } else {
            return true;
        }
    }

    // Instance Methods
    public int getObjectNumber(){
        return objectNumber;
    }

    public void setDate(int aYear, int aMonth, int aDay){
        year = aYear;
        month = aMonth;
        day = aDay;
    }

    public void setYear(int aYear){
        year = aYear;
    }

    public void setMonth(int aMonth){
        month = aMonth;
    }

    public void setDay(int aDay){
        day = aDay;
    }

    public int getYear(){
        return year;
    }

    public int getMonth(){
        return month;
    }

    public int getDay(){
        return day;
    }

    public String toString(){
        return (day+" "+strMonths[month-1]+" "+year);
    }

    // Challenge Bonus (Optional)
    public MyDate nextDay() {
        if (month == 12 && day == 31) {
            year = year + 1;
            month = 1;
            day = 1;
        } else {
            if (month == 4 || month == 6 || month == 9 || month == 11) {
                if (day == 30) {
                    month = month + 1;
                    day = 1;
                } else {
                    day = day + 1;
                }
            } else if (month != 2) {
                if (day == 31) {
                    month = month + 1;
                    day = 1;
                } else {
                    day = day + 1;
                }
            } else {
                if (isLeapYear(year) && day == 29) {
                    month = month + 1;
                    day = 1;
                } else if (!isLeapYear(year) && day == 28) {
                    month = month + 1;
                    day = 1;
                } else {
                    day = day + 1;
                }
            }
        }
        return this;
    }

    public MyDate previousDay() {
        if (month == 1 && day == 1) {
            year = year - 1;
            month = 12;
            day = 31;
        } else {
            if (month == 5 || month == 7 || month == 10 || month == 12) {
                if (day == 1) {
                    month = month - 1;
                    day = 30;
                } else {
                    day = day - 1;
                }
            } else if (month != 3) {
                if (day == 1) {
                    month = month - 1;
                    day = 31;
                } else {
                    day = day - 1;
                }
            } else {
                if (isLeapYear(year) && day == 1) {
                    month = month - 1;
                    day = 29;
                } else if (day == 1) {
                    month = month - 1;
                    day = 28;
                } else {
                    day = day - 1;
                }
            }
        }
        return this;
    }

    public MyDate nextMonth() {
        if (month == 12) {
            year++;
            month = 1;
        } else {
            month++;
        }
        return this;
    }

    public MyDate previousMonth() {
        if (month == 1) {
            year--;
            month = 12;
        } else {
            month--;
        }
        return this;
    }

    public MyDate nextYear() {
        year++;
        return this;
    }

    public MyDate previousYear() {
        if (month == 2 && day == 29)
            day-- ;
            year-- ;
        return this;
    }
}