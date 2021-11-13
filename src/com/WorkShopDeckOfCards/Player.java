package com.WorkShopDeckOfCards;

import java.util.Scanner;

public class Player 
{
	public void numOfPlayers(int n)
	{
		if(n>2 && n<4)
		{
			if(n==3)
			{
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter Player Name");
				String player1 = sc.nextLine();
				System.out.println("Enter Player Name");
				String player2 = sc.nextLine();
				System.out.println("Enter Player Name");
				String player3 = sc.nextLine();
			}
			if(n==4)
			{
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter Player Name");
				String player1 = sc.nextLine();
				System.out.println("Enter Player Name");
				String player2 = sc.nextLine();
				System.out.println("Enter Player Name");
				String player3 = sc.nextLine();
				System.out.println("Enter Player Name");
				String player4 = sc.nextLine();
			}
		}
	}
}
