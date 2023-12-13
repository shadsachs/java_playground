public class Card {


    private final String face; // face of card 

    private final String suit;  //suit of card
    
    public Card (String cardFace, String cardSuit){

        this.face = cardFace; // initialise face of card 
        this.suit = cardSuit; //initialise suit of card 
    }

    // return string representation of card 

    public String toString(){
        return face + " of " +  suit;
    }

    
}
