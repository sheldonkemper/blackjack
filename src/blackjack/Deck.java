/**
 * A class to create a deck of cards.
 * The deck can be shuffled and cards can be dealt from the deck.
 * size of the deck will be reduced for every card dealt.
 * 
 * @author Stuart Thomson 
 * @version 2.1
 * 26/02/16
 */
package blackjack;

import java.util.*;

public final class Deck
{
  final private List<Card> cardsInDeck;
  private boolean beenShuffled;
  public Deck()
  {
    this.cardsInDeck = new ArrayList<> ();
    this.setDeckOfCards();
    beenShuffled = false;
   }
   
   /**
    * A method to get cards from the Card class to 
    * create an un-shuffled Deck
    */
  public void setDeckOfCards()
  {
      int lengthOfSuits = 4;
      int lengthOfRanks = 13;
      //Starts at one so the value matches 
      for (int i = 1;i <= lengthOfSuits; i++)
      {
         for(int x = 1;x <= lengthOfRanks; x++)
         {
            this.cardsInDeck.add(new Card (x ,i));
         }
      }
      beenShuffled = false;      
   }
  
   /**
    * Returns the current size of the deck
    * @return int
    */
  public int getSizeOfDeck()
  {
     return this.cardsInDeck.size();
   }
  
  /**
   * A method to shuffle the deck of cards.
   */
  public void shuffelDeck()
  { 
     Collections.shuffle(this.cardsInDeck);
     beenShuffled = true;
  }
  
  /** 
   * Method to deal a card from the deck returns a card.
   * The size of the deck is reduced by one.
   */
  private Card dealACard()
  {
    return this.cardsInDeck.remove(0);
  }
  
  /**
   * Method to deal a card from the deck it will not deal a card 
   * unless the deck has been shuffled.
   */
  public void dealCard()
  {
    if(!this.cardsInDeck.isEmpty()&& beenShuffled == true) 
    {
      this.dealACard();
    }
    else
    {
      System.out.println("Please shuffle the deck before dealing");
    }
  }
  
  /** 
   * A method to return the deck of cards.
   */
  private List<Card> getDeckOfCards()
  {
     return this.cardsInDeck;
   }
  
  /**
   * A method to print out the deck of cards.
   * the deck remains unchanged.
   */
  public void printDeck()
  {
      this.getDeckOfCards().stream().forEach((aCard) -> {
          System.out.println(aCard);
      });
   }
  
   /**
    * Returns a string representation of the object receiver.
    * @return String
    */
  @Override
  public String toString()
   {
     String message = "An instance of Class " + this.getClass().getName()
     + " it has " + this.getSizeOfDeck() + " cards ";
     if (beenShuffled == false)
     {
        message = message + "\nThe deck has not been shuffled ";
      }
     else if (beenShuffled == true)
     {
        message = message + "\nThe deck has been shuffled ";
      }
      return message;
   }
}
