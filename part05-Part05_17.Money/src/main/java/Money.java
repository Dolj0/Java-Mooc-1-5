
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }
    
    public Money plus(Money addition){
        Money newMoney = new Money((this.euros+addition.euros), (this.cents+addition.cents));
        
        return newMoney;
    }
    
    public boolean lessThan(Money compared){
        
        if (this.euros<compared.euros()){
            return true;
        } else if (this.euros>compared.euros()){
            return false;
        } else if (this.euros==compared.euros()){
            if (this.cents<compared.cents()){
                return true;
            } else if (this.cents>=compared.cents()){
                return false;
            }
        }
        return false;
    }
    
    public Money minus(Money decreaser){
        int eurHold = 0;
        int cenHold = 0;
        if (decreaser.euros>this.euros){
           Money newMoney = new Money(0,0);
           return newMoney;
        } else {
            eurHold=this.euros-decreaser.euros;
        }
        
        
        if (decreaser.cents>this.cents){
            if (eurHold>0){
                eurHold=eurHold-1;
                cenHold=this.cents-decreaser.cents+100;
            }
            
        } else {
            cenHold=this.cents-decreaser.cents;
        }
        
        Money newMoney = new Money(eurHold, cenHold);
        return newMoney;
    }

}
