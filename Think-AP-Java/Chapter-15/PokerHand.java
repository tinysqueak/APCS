
/* 
 * Example code for Think Java (http://thinkapjava.com)
 *
 * Copyright(c) 2011 Allen B. Downey
 * GNU General Public License v3.0 (http://www.gnu.org/copyleft/gpl.html)
 *
 * @author Allen B. Downey
 */

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;

public class PokerHand extends Deck {

	Card[] hand = new Card[5];

	public PokerHand(Card[] hand) {

		this.hand = hand;

	}

	public boolean hasFlush() {

		for(int i = 1; i < hand.length; i++) {

			if(hand[0].suit != hand[i].suit) {

				return false;

			}
		}
		
		return true;

	}
	
	public boolean hasThreeKind() {
		
		int count = 0;
		
		ArrayList<Card> handList = new ArrayList<Card>(Arrays.asList(hand));
		
		for(int i = 0; i < handList.size(); i++) {
			
			count = 0;
			
			for(int j = 0; j < handList.size(); j++) {
								
				if(handList.get(i).rank == handList.get(j).rank) {
					
					count++;
					
				}
				
				if(count == 3) {
					
					for(int k = 0; k < handList.size(); k++) {
						
						if(handList.get(i).rank == handList.get(k).rank) {
							
							handList.remove(k);
							
						}
						
					}
					
					break;
					
				}
				
				
			}
			
			if(count == 3) {
				
				break;
				
			}
						
			
		}
		
		if(count == 3 && handList.get(0) != handList.get(1)) {
			
			return true;
			
		}
		
		return false;
		
	}

}

