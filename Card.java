/**
 * A class that can be used to create cards.
 * 
 * @author Stuart Thomson pi C6660723
 * @date 09/12/15
 * @version 1.0
 */
import java.util.ArrayList;
import java.util.List;
public class Card
{
   private List <String> ranks;
   private List <String> suits;
   /**
    * Constructers of class Card
    */
   public Card ()
   {
       ranks = new ArrayList<String> ();
       suits = new ArrayList<String> ();
   }
   
   /** 
    * Method to create ranks as a List of Strings.
    */
   private void setRanks()
   {
      this.ranks.add ("Ace");
      this.ranks.add ("Two");
      this.ranks.add ("Three");
      this.ranks.add ("Four");
      this.ranks.add ("Five");
      this.ranks.add ("Six");
      this.ranks.add ("Seven");
      this.ranks.add ("Eight");
      this.ranks.add ("Nine");
      this.ranks.add ("Ten");
      this.ranks.add ("Jack");
      this.ranks.add ("Queen");
      this.ranks.add ("King");
   }
   
   /** 
    *Method to create suits as a List of Strings.
    */
   private void setSuits ()
   {
      this.suits.add ("Spades");
      this.suits.add ("Diamonds");
      this.suits.add ("Clubs");
      this.suits.add ("Hearts");
   }
   
   /** 
    * This will return a string representation of the rank
    * at a given point in the List
    * the list remains unchanged.
    */
   public String getRank (int x)
   {
     return this.ranks.get(x); 
   }
  
   /** 
    * This will return a string representation of the suit,
    * at a given point in the list.
    * The list remains unchanged.
    */
   public String getSuit (int x)
   {
      return this.suits.get(x); 
   }
   
   /**
    * Returns the size of the ranks list as an integer.
    */
   public int getSizeOfRanks()
   {
      return this.ranks.size();
   }
   
    /**
    * Returns the size of the suits list as an integer.
    */
   public int getSizeOfSuits()
   {
      return this.suits.size();
   }
   
   /**
    * Initializes the card with ranks and suits.
    */
   public void makeCards()
   {
     setSuits ();
     setRanks ();
   }
   
   /**
    * Returns a string representation of the receiver.
    */
   @Override
   public String toString()
   {
      String message = "An instance of Class " + this.getClass().getName()
      + " it has " + this.getSizeOfRanks() + " ranks"
      + " and " + getSizeOfSuits() + " suits ";
      if (this.getSizeOfRanks() > 0 && this.getSizeOfSuits() > 0)
      {
         message = message + "\n" + this.getClass().getName() + " class has been set";
      }
      else
      {
         message = message + "\n" + this.getClass().getName() + " class is not set";
      }
      return message;
   }  
}
