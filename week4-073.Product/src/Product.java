/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shadow_dragon
 */
public class Product {
    private String nameAtStart;
    private double priceAtStart;
    private int amountAtStart;
       
    public Product(String nameAtStart, double priceAtStart, int amountAtStart) {
        this.amountAtStart = amountAtStart;
        this.priceAtStart = priceAtStart;
        this.nameAtStart = nameAtStart;
    }
    
    public void printProduct() {
        System.out.println(this.nameAtStart + ", " + this.priceAtStart + ", " + this.amountAtStart);
    }
    
}
