public class Clock {
    private BoundedCounter hours;
    private BoundedCounter minutes;
    private BoundedCounter seconds;
   
    public Clock(int hoursAtBeginning, int minutesAtBeginning, int secondsAtBeginning) {
        // the counters that represent hours, minutes and seconds are created and set to have the correct initial values
        hours = new BoundedCounter(23); 
        minutes = new BoundedCounter(59);
        seconds = new BoundedCounter(59);
        hours.setValue(hoursAtBeginning);
        minutes.setValue(minutesAtBeginning);
        seconds.setValue(secondsAtBeginning);       
        
    }
    
    public void tick() {
        // Clock advances by one second
        this.seconds.next();
        if (seconds.getValue() == 0) {
            this.minutes.next();
            if (minutes.getValue() == 0) {
                this.hours.next();
            }
        }
    }
    
    public String toString() {
        // returns the string representation
        int a = seconds.getValue();
        int b = minutes.getValue();
        int c = hours.getValue();
        String h = "";
        String m = "";
        String s = "";
        
        if (c < 10) {
            h = h + "0" + c;
        } else {
            h = h + c;
        }
        
        if (b < 10) {
            m = m + "0" + b;
        } else {
            m = m + b;
        }
        
        if (a < 10) {
            s = s + "0" + a;
        } else {
            s = s + a;
        }
        
        return h + ":" + m + ":" + s;
    }
}
