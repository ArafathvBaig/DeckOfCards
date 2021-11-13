package com.WorkShopDeckOfCards;

import java.util.Scanner;

public class DeckOfCards 
{
	public static void main(String[] args) 
	{
		String deck[] = new String[52];
		int k=0;
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
		System.out.println("Enter Number of Players");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Player pl = new Player();
		pl.numOfPlayers(n);
	}
}
