package com.WorkShopDeckOfCards;

import java.util.Scanner;

public class DeckOfCards 
{
	Scanner sc = new Scanner(System.in);
	String[] suits = { "Spades", "Hearts", "Diamonds", "Clubs" };
	String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King",  "Ace" };
	String deck[] = new String[52];
	String player1[] = new String[9];
	String player2[] = new String[9];
	String player3[] = new String[9];
	String player4[] = new String[9];	
	int k=0;
	int j=0;
	int i=0;
	int index;
	String temp;
	public void deck()
	{
		for(int i=0; i<suits.length; i++)
		{
			for(int j=0; j<ranks.length; j++)
			{
				deck[k]=suits[i].concat(ranks[j]);
				k++;
			}
		}
		for (int i=0; i<deck.length; i++)
		{
			System.out.println(deck[i]);
		}
		shuffle(deck);
	}
	
	public void shuffle(String deck1[])
	{
		for (int i = 0; i < deck1.length; i++) 
		{
			index = (int) (Math.random() * deck1.length);
			temp = deck1[i];
			deck1[i] = deck1[index];
			deck1[index] = temp;
		}
		System.out.println(" ");
		System.out.println("Shuffled Deck Is: ");
		for (int i=0; i<deck1.length; i++)
		{
			System.out.println(deck1[i]);
		}	
	}
	
	public void sequence(int n)
	{
		int choice[] = new int[n]; 
		for(int i=0; i<n; i++)
		{
			System.out.println("Choose "+(i+1)+" player to play");
			choice[i] = sc.nextInt();
			System.out.println(choice[i]+" Player Plays at Postition "+(i+1));
			distribute(choice[i]);
		}
	} 
	
	public void distribute(int n)
	{
		
		if(n==1)
		{
			for(int j=0; j<9; j++)
			{
				player1[j] = deck[i];
				System.out.println(player1[j]);
				i++;
			}				
		}
		if(n==2)
		{
			for(int j=0; j<9; j++)
			{
				player2[j] = deck[i];
				System.out.println(player2[j]);
				i++;
			}
		}
		if(n==3)
		{
			for(int j=0; j<9; j++)
			{
				player3[j] = deck[i];
				System.out.println(player3[j]);
				i++;
			}
		}
		if(n==4)
		{
			for(int j=0; j<9; j++)
			{
				player4[j] = deck[i];
				System.out.println(player4[j]);
				i++;
			}
		}
	}
	
	public void cardCount(int n)
	{
		for(int k=0; k<n; k++)
		{
			if(k==0)
			{
				int s=0;
				int h=0;
				int d=0;
				int c=0;
				for(int l=0; l<9; l++)
				{
					for(int i=0; i<suits.length; i++)
					{					
						for(int j=0; j<ranks.length; j++)
						{
							String comparingCard = suits[i].concat(ranks[j]);
							String playerCard = player1[l];
							int temp = playerCard.compareTo(comparingCard);
							if(temp == 0)
							{
								if(i==0)
								{
									s=s+1;
								}
								else if(i==1)
								{
									h=h+1;									
								}
								else if(i==2)
								{
									d=d+1;									
								}
								else if(i==3)
								{
									c=c+1;									
								}
							}			
						}
					}
				}
				System.out.println("Player 1 has::");
				System.out.println("Clubs: "+c);
				System.out.println("Diamonds: "+d);
				System.out.println("Hearts: "+h);
				System.out.println("Spaded: "+s);
			}
			if(k==1)
			{
				int s=0;
				int h=0;
				int d=0;
				int c=0;
				for(int l=0; l<9; l++)
				{
					for(int i=0; i<suits.length; i++)
					{						
						for(int j=0; j<ranks.length; j++)
						{
							String comparingCard = suits[i].concat(ranks[j]);
							String playerCard = player1[l];
							int temp = playerCard.compareTo(comparingCard);
							if(temp == 0)
							{
								if(i==0)
								{
									s=s+1;
								}
								if(i==1)
								{
									h=h+1;
								}
								if(i==2)
								{
									d=d+1;
								}
								if(i==3)
								{
									c=c+1;
								}
							}			
						}
					}
				}
				System.out.println("Player 2 has::");
				System.out.println("Clubs: "+c);
				System.out.println("Diamonds: "+d);
				System.out.println("Hearts: "+h);
				System.out.println("Spaded: "+s);
			}
			if(k==2)
			{
				int s=0;
				int h=0;
				int d=0;
				int c=0;
				for(int l=0; l<9; l++)
				{
					for(int i=0; i<suits.length; i++)
					{						
						for(int j=0; j<ranks.length; j++)
						{
							String comparingCard = suits[i].concat(ranks[j]);
							String playerCard = player1[l];
							int temp = playerCard.compareTo(comparingCard);
							if(temp == 0)
							{
								if(i==0)
								{
									s=s+1;
								}
								if(i==1)
								{
									h=h+1;
								}
								if(i==2)
								{
									d=d+1;
								}
								if(i==3)
								{
									c=c+1;
								}
							}			
						}
					}
				}
				System.out.println("Player 3 has::");
				System.out.println("Clubs: "+c);
				System.out.println("Diamonds: "+d);
				System.out.println("Hearts: "+h);
				System.out.println("Spaded: "+s);
			}
			if(k==3)
			{
				int s=0;
				int h=0;
				int d=0;
				int c=0;
				for(int l=0; l<9; l++)
				{
					for(int i=0; i<suits.length; i++)
					{						
						for(int j=0; j<ranks.length; j++)
						{
							String comparingCard = suits[i].concat(ranks[j]);
							String playerCard = player1[l];
							int temp = playerCard.compareTo(comparingCard);
							if(temp == 0)
							{
								if(i==0)
								{
									s=s+1;
								}
								if(i==1)
								{
									h=h+1;
								}
								if(i==2)
								{
									d=d+1;
								}
								if(i==3)
								{
									c=c+1;
								}
							}			
						}
					}
				}
				System.out.println("Player 4 has::");
				System.out.println("Clubs: "+c);
				System.out.println("Diamonds: "+d);
				System.out.println("Hearts: "+h);
				System.out.println("Spaded: "+s);
			}
		}
		
	}
	
	public static void main(String[] args) 
	{
		DeckOfCards doc = new DeckOfCards();
		doc.deck();
		System.out.println("Enter Number of Players");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Player pl = new Player();
		pl.numOfPlayers(n);
		doc.sequence(n);
		doc.cardCount(n);
	}
}














