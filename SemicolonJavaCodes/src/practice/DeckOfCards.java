package practice;

import java.security.SecureRandom;

class Card {

    private final String face;
    private final String suit;


    public Card(String cardface, String cardsuit) {
        this.face = cardface;
        this.suit = cardsuit;
    }
    public String toString(){//creates a string consisting of the card,
        return face + "of" + suit;//the string "of" and the of the card.
    }
}



class DeckOfCards {
//    random number generator
    private static final SecureRandom randomNumbers = new SecureRandom();
    private static final int NUMBER_OF_CARDS = 52;//constant of cards

    private Card[] deck = new Card[NUMBER_OF_CARDS];// cards reference
    private int currentCard = 0; // index of next Card to be dealt (0 - 51)

    public DeckOfCards(){
        String[] faces = {"Aces", "Deuce", "Three", "Four", "five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};

        //populate deck with card objects
        for (int i = 0; i < deck.length; i++) {
            deck[i] = new Card(faces[i % 13], suits[i/13]);
        }
    }
    //shuffle deck of cards with one pass algorithm
    public void shuffle (){
        // next call to method dealcard should strat at deck[0] again
        currentCard = 0;
// for each card, pick another random card(0 - 51) and swap them
        for (int first = 0; first < deck.length; first++) {
// select a random number between 0 and 51
            int second = randomNumbers.nextInt(NUMBER_OF_CARDS);
            //swap current card with randomly selected card
            Card temp = deck[first];
            deck[first] = deck[second];
            deck[second] = temp;
        }
    }
    //deal one Card
    public Card dealCard(){
        //determine whether Cards remain to be dealt
        if (currentCard < deck.length){
            return deck[currentCard++];//return current Card in array
        }
        else {
            return null; //return null to indicate that all cards were dealt
        }
    }
}


class DeckOfCardsTest {
    public static void main(String[] args) {
        DeckOfCards myDeckCards = new DeckOfCards();
        myDeckCards.shuffle();

        for (int i = 1; i <= 52; i++) {
            System.out.printf("%-19s", myDeckCards.dealCard());
            if (i % 4 == 0){
                System.out.println();
            }
        }
    }
}
