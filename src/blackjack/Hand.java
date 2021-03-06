/*
 * Copyright (c) 2016, Author
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
package blackjack;

import java.util.*;
/**
 *
 * @author 
 */
public class Hand {
    
    private List<Card> cardsInHand;
   
    
    /**
     * 
     */
    public Hand()
    {
        this.cardsInHand = new ArrayList<>();
    }
    
    /**
     * 
     * @return Card cards in hand
     */
    public List getHand()
    {
        return this.cardsInHand;
    }
    
    /**
     * 
     * @param newCard
     */
    public void setHand(Card newCard)
    {
        this.cardsInHand.add(newCard);
    }
    
    /**
     * 
     */
    public void clearHand()
    {
        this.cardsInHand.clear();
    }
    
    /**
    * Returns a string representation of the receiver.
    * @return String representation of the hand with each card in it
    */
   @Override
   public String toString()
   {
      return ("An instance of Class " + this.getClass().getName()
     + " it has " + this.cardsInHand.size() + " cards ")
              + this.cardsInHand ;
   }
    
}
