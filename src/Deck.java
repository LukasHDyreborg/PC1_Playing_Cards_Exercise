import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;

public class Deck {

    private List<Card> deck;

    public Deck() {
        List<Card> cards = new ArrayList<>();
        for (Color color : Color.values()) {
            for (Number number : Number.values()) {
                Card c = new Card(color, number);
                cards.add(c);
            }
        }
        this.deck = cards;
    }

    public void seeDeck() {
        List<Card> cards = getDeck();
        for (Card card : cards) {
            System.out.println(card);
        }
    }

    public void shuffle() {
        int random = ThreadLocalRandom.current().nextInt(1, 10);
        List<Card> cards = getDeck();
        for (int i = 0; i <= random; i++) {
            Collections.shuffle(cards);
        }
        setDeck(cards);
    }

    public void pickACard() {
        List<Card> cards = getDeck();
        System.out.println("We take the top card.");
        System.out.println("The card is " + cards.get(0));
        cards.remove(0);
        setDeck(cards);
        numberLeft();
    }

    public void numberLeft() {
        List<Card> cards = getDeck();
        System.out.println("There are " + cards.size() + " cards left!");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Deck deck1 = (Deck) o;
        return Objects.equals(getDeck(), deck1.getDeck());
    }

    @Override
    public String toString() {
        return "Deck\n{\n" +
                "deck=" + deck +
                "\n}";
    }



    public List<Card> getDeck() {
        return deck;
    }

    public void setDeck(List<Card> deck) {
        this.deck = deck;
    }
}
