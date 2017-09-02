
import java.util.Calendar;

public class Person {

    private String name;
    private MyDate birthday;
    private int day;
    private int month;
    private int year;
    private int age;

    public Person(String name, int pp, int kk, int vv) {
        this.name = name;
        this.birthday = new MyDate(pp, kk, vv);
        this.day = pp;
        this.month = kk;
        this.year = vv;
    }

    public int age() {
// calculate the age based on the birthday and the current day
        // you get the current day as follows: 
        Calendar.getInstance().get(Calendar.DATE);
        Calendar.getInstance().get(Calendar.MONTH);
        // January is 0 so we add one
        Calendar.getInstance().get(Calendar.YEAR);
        int today = Calendar.getInstance().get(Calendar.DATE) + (30 * (Calendar.getInstance().get(Calendar.MONTH) + 1) + (365 * Calendar.getInstance().get(Calendar.YEAR)));
        int birthday = this.day + (30 * this.month) + (365 * this.year);
        int difference = (today - birthday);
        if (difference < 0) {
            difference = difference * -1;
        }
        int solution = difference / 365;
        this.age = solution;
        return solution;
    }

    public boolean olderThan(Person compared) {
        // compare the ages based on birthdays
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return this.name + ", born " + this.birthday;
    }
    
    public Person(String name) {
        this.name = name;
        this.birthday = new MyDate(Calendar.getInstance().get(Calendar.DATE), Calendar.getInstance().get(Calendar.MONTH) + 1, Calendar.getInstance().get(Calendar.YEAR));
    }
    
    public Person(String name, MyDate birthday) {
        this.name = name;
        this.birthday = birthday;
       
    }
    
}
