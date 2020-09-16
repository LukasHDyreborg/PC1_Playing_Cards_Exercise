import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Deck deck = new Deck();
        //deck.seeDeck();
        deck.shuffle();
        //deck.shuffle();
        //deck.seeDeck();
        deck.pickACard();
        deck.seeDeck();
        List<Card> cards = deck.getDeck();
        //cards.add(card);
        testCards(cards);
    }

    public static void testDeck(Deck deck1, Deck deck2) {
        if (deck1.equals(deck2)) {
            System.out.println("The 2 decks are the same!");
        } else {
            System.out.println("They are different!");
        }
    }

    public static void testCards(List<Card> cards) {
        for (int i = 0; i < cards.size(); i++) {
            for (int j = i; j < cards.size(); j++) {
                if (cards.get(i).equals(cards.get(j))) {
                    if (i == j) {

                    } else {
                        System.out.println("There are 2 of this card: " + cards.get(i) + "!");
                        System.out.println("at, " + i + " and " + j);
                    }
                }
            }
        }
        System.out.println("All the cards are different!");
    }

}
