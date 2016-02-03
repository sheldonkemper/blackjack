/**
 * A class that can be used to create cards.
 * 
 * @author Stuart Thomson 
 * @date 03/02/16
 * @version 2.0
 */
public class Card
{
   private int ranks = 0;
   private int suits = 0;
   /**
    * Constructor of class Card 
    * takes an int for ranks and suit
    * @param int aRank a value for the rank
    * @param int aSuit a value for the suit
    */
   public Card (int aRank , int aSuit)
   {
       this.ranks = aRank;
       this.suits = aSuit;
   }
   
   /** 
    * Method to set rank as value
    * @param int aRank a value for the rank
    */
   public void setRanks(int aRank)
   {
      this.ranks = aRank;
   }
   
   /** 
    *Method to set suit as a value
    * @param int aSuit a value for the suit
    */
   public void setSuits (int aSuit)
   {
      this.suits = aSuit;
   }
   
   /** 
    * This will return the rank as a number
    * @return the value for the rank 
    */
   public int getRank ()
   {
     return this.ranks; 
   }
   
   /** 
    * This will return the rank as a string
    * @return a string representation of the Rank
    */
   public String getRankAsString (int aRank)
   {
      switch (aRank)
      {
         case 1:return("Ace");
         case 2:return("Two");
         case 3:return("Three");
         case 4:return("Four");
         case 5:return("Five");
         case 6:return("Six");
         case 7:return("Seven");
         case 8:return("Eight");
         case 9:return("Nine");
         case 10:return("Ten");
         case 11:return("Jack");
         case 12:return("Queen");
         case 13:return("King");
         default: return("Invalid Rank");
      }
   }
  
   /** 
    * This will return the suit of the receiver as an int
    * @return the value of the Suit.
    */
   public int getSuit ()
   {
      return this.suits; 
   }
   
    /** 
    * This will return the suit of the receiver as an int
    * @return a string representation of the Suit
    */
   public String getSuitAsString (int aSuit)
   {
      switch (aSuit)
      {
         case 1:return("Spades");
         case 2:return("Diamonds");
         case 3:return("Clubs");
         case 4:return("Hearts");
         default:return("Invalid Rank");
      }
   }
   
   /**
    * Returns a string representation of the receiver.
    * @return String representation of the card with rank and suit
    */
   @Override
   public String toString()
   {
      return (this.getRankAsString(this.getRank()) +" of "
               + this.getSuitAsString(this.getSuit()));
   }
}
