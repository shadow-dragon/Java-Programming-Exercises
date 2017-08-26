/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shadow_dragon
 */
public class Multiplier {

    private int number;   

    public Multiplier(int number) {
        this.number = number;
        
               
    }

    public int multiply(int otherNumber) {               
        this.number = this.number * otherNumber;
        return this.number;
    }
}
