/**
 * A class to create a deck of cards.
 * The deck can be shuffled and cards can be dealt from the deck.
 * size of the deck will be reduced for every card dealt.
 * 
 * @author Stuart Thomson pi C6660723
 * @version 2
 * 10/12/15
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
public class Deck
{
     private List <String> deckOfCards;
     private Card cards;
     private String beenShuffled;
  public Deck()
  {
    this.cards = new Card();
    this.cards.makeCards();
    this.deckOfCards = new ArrayList <String> ();
    beenShuffled = "";
   }
   
   /**
    * A method to get cards from the Card class to 
    * create an unshuffled Deck
    */
  public void setDeckOfCards()
  {
      int lengthOfSuits = cards.getSizeOfSuits();
      int lengthOfRanks = cards.getSizeOfRanks();
      int counter = 0;
      for (int i = 0;i < lengthOfSuits; i++)
      {
         for(int x = 0;x <lengthOfRanks; x++)
         {
            this.deckOfCards.add(cards.getRank(x) + " of " + this.cards.getSuit(i));
            counter ++;
         }
      }
      beenShuffled = "no";      
   }
  
   /**
    * Returns the current size of the deck
    */
  public int getSizeOfDeck()
  {
     return this.deckOfCards.size();
   }
  
  /**
   * A method to shuffle the deck of cards.
   */
  public void shuffelDeck()
  { 
     if (!this.deckOfCards.isEmpty())
     {
        Collections.shuffle(this.deckOfCards);
        beenShuffled = "yes";
      }
      else
      {
         System.out.println("Cant shuffle an empty deck");
      }
   }
  
  /** 
   * Method to deal a card from the deck returns a string.
   * The size of the deck is reduced by one. Deck must be shuffled.
   */
  public String dealCard()
  {
     if(!this.deckOfCards.isEmpty()&& beenShuffled == "yes")
      {
        return this.deckOfCards.remove(0);
      }
     else if (beenShuffled == "no")
      {
        return "Please shuffle the deck before dealing";
      }
     else
      {
        return "Cant deal from an empty deck";
      }
   }
  
  /** 
   * A method to return the deck of cards.
   */
  private List<String> getDeckOfCards()
  {
     return this.deckOfCards;
   }
   
   /**
    * Returns a string representation of the object receiver.
    */
  @Override
  public String toString()
   {
     String message = "An instance of Class " + this.getClass().getName()
     + " it has " + this.getSizeOfDeck() + " cards ";
     if (beenShuffled == "no")
     {
        message = message + "\nThe deck has not been shuffled ";
      }
     else if (beenShuffled == "yes")
     {
        message = message + "\nThe deck has been shuffled ";
      }
     else
      {
         message = message + "\nThe deck has not been set ";
      }
      return message;
   }
}
