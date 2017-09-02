
public class BoundedCounter {

    private int value;
    private int upperLimit;

    public BoundedCounter(int upperLimit) {
        // write code here
        this.value = 0;
        this.upperLimit = upperLimit;
        if (this.value >= 0 && this.value <= this.upperLimit) {

        }
    }

    public void next() {
        // write code here
        if (this.value < this.upperLimit) {
            this.value = this.value + 1;
        } else {
            this.value = 0;
        }
    }

    public String toString() {
        // write code here
        if (value < 10) {
            return "0" + this.value;
        }
        return "" + this.value;
    }

    public int getValue() {
        // write here code that returns the value
        if (value == 0) {
            return value;
        }
        return value;
    }
    
    public void setValue(int num) {
        if (value >= 0 && value <= upperLimit){
            this.value = num;
        } else {
            this.value = 0;
        }        
    }
    
}
