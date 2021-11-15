package com.WorkShopDeckOfCards;

import java.util.Scanner;

public class DeckOfCards 
{
	Scanner sc = new Scanner(System.in);
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
		String[] suits = { "Spades", "Hearts", "Diamonds", "Clubs" };
		String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King",  "Ace" };
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
		int choice; 
		for(int i=0; i<n; i++)
		{
			System.out.println("Choose "+(i+1)+" player to play");
			choice = sc.nextInt();
			System.out.println(choice+" Player Plays at Postition "+(i+1));
			distribute(choice);
		}
	} 
	
	public void distribute(int choice)
	{
		
		if(choice==1)
		{
			for(int j=0; j<9; j++)
			{
				player1[j] = deck[i];
				System.out.println(player1[j]);
				i++;
			}				
		}
		if(choice==2)
		{
			for(int j=0; j<9; j++)
			{
				player2[j] = deck[i];
				System.out.println(player2[j]);
				i++;
			}
		}
		if(choice==3)
		{
			for(int j=0; j<9; j++)
			{
				player3[j] = deck[i];
				System.out.println(player3[j]);
				i++;
			}
		}
		if(choice==4)
		{
			for(int j=0; j<9; j++)
			{
				player4[j] = deck[i];
				System.out.println(player4[j]);
				i++;
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
	}
}














