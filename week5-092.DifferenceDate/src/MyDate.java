public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int montd, int year) {
        this.day = day;
        this.month = montd;
        this.year = year;
    }

    public String toString() {
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
    
    public int differenceInYears(MyDate comparedDate) {
        int year1 = this.day + (30 * this.month) + (365 * this.year);
        int year2 = comparedDate.day + (30 * comparedDate.month) + (365 * comparedDate.year);
        int difference = year1 - year2;
        if (difference < 0) {
            difference = difference * -1;  
        }
        int soultion = difference / 365;
        return soultion;
    }

}
