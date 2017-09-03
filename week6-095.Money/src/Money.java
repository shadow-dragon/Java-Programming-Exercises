
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }
    
    public Money plus(Money added) {     
        int n2 = this.cents + added.cents;
        int n1 = this.euros + added.euros;
        Money a = new Money(n1,n2);
        return a;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }
    
    public boolean less(Money compared) {
        if (this.euros < compared.euros) {
            return true;
        } else if (this.euros == compared.euros && this.cents < compared.cents) {
            return true;
        }
        return false;
    }
    
    public Money minus(Money decremented) {     
        Money a = new Money(0,0);
        if (this.euros < decremented.euros) {
            return a;
        } else if (this.euros == decremented.euros && this.cents < decremented.cents) {
            return a;
        }
        int n1 = this.euros - decremented.euros;
        int n2 = this.cents - decremented.cents;
        if (n2 < 0) {
            n2 = 100 + n2;
            n1--;
        }
        if (n1 < 0) {
            n1 = 0;
            n2 = 0;
        }
        Money b = new Money(n1,n2);
        return b;
    }

}
