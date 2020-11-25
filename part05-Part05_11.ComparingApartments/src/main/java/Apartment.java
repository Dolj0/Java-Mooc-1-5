
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }
    
    public boolean largerThan(Apartment compared){
        int ownSize = this.squares;
        int comparedSize = compared.squares;
        
        if (ownSize>comparedSize){
            return true;
        } else {
            return false;
        }
        
    }
    
    public int priceDifference(Apartment compared){
        int ownPrice = this.princePerSquare*this.squares;
        int comparedPrice = compared.princePerSquare*compared.squares;
        int difference = ownPrice-comparedPrice;
        if (difference < 0){
            return difference*-1;
        } else {
            return difference;
        }
    }
    
    public boolean moreExpensiveThan(Apartment compared){
        int ownPrice = this.princePerSquare*this.squares;
        int comparedPrice = compared.princePerSquare*compared.squares;
        int difference = ownPrice-comparedPrice;
        
        if (difference > 0){
            return true;
        } else {
            return false;
        }
    }

    
}
