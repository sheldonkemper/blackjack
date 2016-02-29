/*
 * Copyright (c) 2016, Stuart Thomson 
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * * Redistributions of source code must retain the above copyright notice, this
 *   list of conditions and the following disclaimer.
 * * Redistributions in binary form must reproduce the above copyright notice,
 *   this list of conditions and the following disclaimer in the documentation
 *   and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */


/**
 * A class that can be used to create cards.
 * 
 * @author Stuart Thomson 
 * @date 26/02/16
 * @version 2.1
 */
package blackjack;

public class Card
{
   private int ranks = 0;
   private int suits = 0;
   /**
    * Constructor of class Card 
    * takes an int as a value for ranks and suit
    * @param int aRank a value for the rank
    * @param int aSuit a value for the suit
    */
   public Card (int aRank , int aSuit)
   {
       this.ranks = aRank;
       this.suits = aSuit;
   }
   
    /** 
    * This will return the rank f the receiver as value
    * @return int the value for the rank 
    */
   public int getRank ()
   {
     return this.ranks; 
   }
   
    /** 
    * This will return the suit of the receiver as a value
    * @return int returns the value of the Suit.
    */
   public int getSuit ()
   {
      return this.suits; 
   }
   
   /** 
    * Method to set rank as value
    * @param int aRank a value for the rank
    */
   public void setRank(int aRank)
   {
      this.ranks = aRank;
   }
   
   /** 
    *Method to set suit as a value
    * @param int aSuit a value for the suit
    */
   public void setSuit (int aSuit)
   {
      this.suits = aSuit;
   }
   
   /** 
    * This will return the rank as a string
    * @return  String string representation of the Rank
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
    * This will return the suit of the receiver as a string
    * @return  String returns the suit as a string
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
