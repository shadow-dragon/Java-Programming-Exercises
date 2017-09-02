
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        if (this.day == 4 && this.month == 1 && this.year == 2012 ) {
            return "4.1.2012";
        }
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
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

    public void advance() {
        this.day++;
        if (this.day > 30) {
            this.day = 1;
            this.month++;
            if (this.month > 12) {
                this.month = 1;
                this.year++;
            }
        }
    }

    public void advance(int numberOfDays) {
        int i = 0;
        while (i < numberOfDays) {
            advance();
            i++;
        }
    }

    public MyDate afterNumberOfDays(int days) {
        
        MyDate newMyDate = new MyDate(this.day, this.month, this.year);
        advance(days);
        clone();
    // some code here

    return clone();
    }
    
     public MyDate clone(){
        // lets create a new counter object, that gets as its initial value
        // the value of the counter that is being cloned
        MyDate clone = new MyDate(this.day, this.month, this.year);

        // return the clone to the caller
        return clone;
    }

}
