package Example.Cards;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PickCard 
{
	private final static int numberOfCardsInOneSuit = 13 ;
	static int heart = numberOfCardsInOneSuit;
	static int spade = numberOfCardsInOneSuit;
	static int club = numberOfCardsInOneSuit;
	static int diamond = numberOfCardsInOneSuit;
	
	public static List<Card> saveCards()
	{
		List<Card> cards = new ArrayList<Card>();
		getCards(cards, "Heart");
		getCards(cards, "Spade");
		getCards(cards, "Diamond");
		getCards(cards, "Club");
		return cards;
	}
	
	public static List<Card> getCards(List<Card> cards , String type)
	{
		for(int i =1 ; i <= numberOfCardsInOneSuit ; i++)
		{
			cards.add(new Card(i, type)); 
		}
		return cards;
	}
	
	public static void removeCard(List<Card> cards , String suit , int index)
	{
		if(suit.equalsIgnoreCase("Heart"))
		{
			System.out.println("Removing card from Hearts. Count of Hearts is now [ "+ --heart+" ] ");  
		}
		else if(suit.equalsIgnoreCase("Spade"))
		{
			System.out.println("Removing card from Spades. Count of Spades is now [ "+ --spade+" ] ");  
		}
		if(suit.equalsIgnoreCase("Diamond"))
		{
			System.out.println("Removing card from Diamonds. Count of Diamonds is now [ "+ --diamond+" ] ");  
		}
		if(suit.equalsIgnoreCase("Club"))
		{
			System.out.println("Removing card from Clubs. Count of Clubs is now [ "+ --club+" ] ");  
		}
		cards.remove(index);
	}
	
	public static void main(String args[])
	{
		List<Card> cards = saveCards();
		Random random = new Random();
		while(cards.size() > 1) 
		{
		 int randomPick = random.nextInt(cards.size() - 1);  
		 Card pickedCard = cards.get(randomPick); 
		 System.out.println("Picked card is [ "+pickedCard.getNumber()+" ] of [ "+pickedCard.getSuit()+" ] ");  
		 removeCard(  cards , pickedCard.getSuit() , randomPick);
		 System.out.println("Number of cards after removal [ "+cards.size()+" ] \n "); 
		}
		
	}

}
