/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shadow_dragon
 */
public class Counter {

    private int startingValue;
    private boolean check;

    public Counter(int startingValue) {
        this(startingValue, false);
    }

    public Counter(boolean check) {
        this(0, check);
    }

    public Counter() {
        this(0, false);
    }

    public Counter(int startingValue, boolean check) {
        this.startingValue = startingValue;
        this.check = check;
    }

    public int value() {
        return this.startingValue;
    }

    public void increase() {
        this.startingValue = this.startingValue + 1;
    }

    public void decrease() {
        if (this.check == true) {
            this.startingValue = this.startingValue - 1;
            if (this.startingValue < 0) {
                this.startingValue = 0;
            }
        } else {
            this.startingValue = this.startingValue - 1;
        }
    }

    public void increase(int increaseAmount) {
        if (increaseAmount >= 0) {
            this.startingValue = this.startingValue + increaseAmount;
        }
    }

    public void decrease(int decreaseAmount) {
        if (decreaseAmount >= 0) {
            if (this.check == true) {
                this.startingValue = this.startingValue - decreaseAmount;
                if (this.startingValue < 0) {
                    this.startingValue = 0;
                }
            } else {
                this.startingValue = this.startingValue - decreaseAmount;
            }
        }
    }

}
