package JavaBasics;

public class DeckOfCards {

	public static void main(String[] args) {
		
			    int[] deck = new int[52];
			    String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
			    String[] ranks = {"Ace", "deuce", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "Jack", "Queen", "King"};

			   
			    for (int i = 0; i < deck.length; i++) {
			      deck[i] = i;
			    }

			   
			    for (int i = 0; i < deck.length; i++) {
			      int index = (int)(Math.random() * deck.length);
			      int temp = deck[i];
			      deck[i] = deck[index];
			      deck[index] = temp;
			    }

			    
			    for (int i = 0; i < 52; i++) {
			      String suit = suits[deck[i] / 13];
			      String rank = ranks[deck[i] % 13];
			      System.out.println( rank + " of " + suit);
			    }
			  }
			

	}

