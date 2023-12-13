import java.security.SecureRandom;


public class DeckOfCards {

    //random number generator 

    private static final SecureRandom randomNumbers = new SecureRandom();

    private static final int NUMBER_OF_CARDS = 52; //CONSTANT NUMBER OF CARDS 

    private Card [] deck = new Card[NUMBER_OF_CARDS]; // card reference 
    
    private int currentCard = 0; // index of next Card to be dealt 0-51;
    
    // constructor fills deck of Cards 

    public DeckOfCards() {

        String[] faces = {"Ace", "Deuce", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};

        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};

        // populate deck with Card objects 
        for(int count = 0; count < deck.length; count++){
            deck[count] = new Card(faces[count%13], suits[count/13]);
        }
    }

    // shuffle deck with one pass algorithm

    public void shuffle(){
        //next call to method dealCard should start at deck[0] again

        currentCard = 0;

        for(int first=0; first < deck.length; first++){
            // select random number between 0 and 51

            int second = randomNumbers.nextInt(NUMBER_OF_CARDS);

            // swap current card with randomly selected card 

            Card temp = deck[first];
            deck[first] = deck[second];
            deck[second] = temp;
        } 
    }

    public Card dealCard(){
        // determine whether cards remain to be dealt

        if(currentCard < deck.length){
            return deck[currentCard++]; // return current card in array
        }

        else{
            return null; // return null when all cards are dealt
        }
    }

    
}
