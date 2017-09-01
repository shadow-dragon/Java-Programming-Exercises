
public class Apartment {

    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }
    
     public boolean larger(Apartment otherApartment) {
         if (this.rooms > otherApartment.rooms) {
             return true;
         }
         
         if (this.rooms == otherApartment.rooms && this.squareMeters > otherApartment.squareMeters) {
             return true;
         }
         return false;
     }
     
     public int priceDifference(Apartment otherApartment) {
         int price1 = this.pricePerSquareMeter * this.squareMeters;
         int price2 = otherApartment.squareMeters * otherApartment.pricePerSquareMeter;
         int priceDifference = price1 - price2;
         if (priceDifference < 0) {
             priceDifference = priceDifference * -1;
             return priceDifference;
         }
         return priceDifference;
     }
     
     public boolean moreExpensiveThan(Apartment otherApartment) {
         int price1 = this.pricePerSquareMeter * this.squareMeters;
         int price2 = otherApartment.squareMeters * otherApartment.pricePerSquareMeter;
         if (price1 > price2) {
             return true;
         }
         return false;
     }
    
}
