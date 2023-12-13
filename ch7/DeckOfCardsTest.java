public class DeckOfCardsTest {

    // execute 

    public static void main(String[] args) {

        DeckOfCards myDeckOfCards = new DeckOfCards();
        myDeckOfCards.shuffle(); // shuffle new deck object

        // print all 52 cards as they're dealt

        for (int i =1; i <= 52; i++){
            //deal and display a Card 

            System.out.printf("%-19s", myDeckOfCards.dealCard()); // deal card

            if(i %4 == 0){
                System.out.println();
            }
        }
        
    }
    
}
