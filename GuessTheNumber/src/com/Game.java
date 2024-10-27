package com;

	import java.util.Scanner;
	import java.lang.Math;
	public class Game
	{
		public static void main(String[] args)
		{
			Scanner scan = new Scanner(System.in);
			System.out.println("Do you want to realx but you are concerning about time");
			Play.delay();
			System.out.println("Don't worry");
			Play.delay();
			System.out.println("We provide you a game to relax");
			Play.delay();
			System.out.println("You just need to spend 5 minutes");
			System.out.println("Shall we start");
			String opinion = scan.next();
			if (opinion.equalsIgnoreCase("yes"))
			{
				Play.game();
			}
			else
			{
				System.out.println("You gonna miss one of the interesting game");
			}
		}
	}
	class Play
	{
		public static void delay()
		{
			try
			{
				Thread.sleep(1200);
			}
			catch (Exception e)
			{
			}
		}
		public static void game()
		{
		    System.out.println("Welcome to the luck game....");
			int n=(int)(Math.random()*100)+1;
			int i;
			int score=600;
			Scanner scan=new Scanner(System.in);
			for (i=1;i<=6 ;i++ )
			{
				System.out.println("Guess the number....");
				int m=scan.nextInt();
				delay();
				if (n==m)
				{
					System.out.println("You got it....");
					System.out.println("Congratulations....");
					System.out.println("Calculating your score......");
					delay();
					System.out.println("Your score is: "+score);
					break;
				}
				else if (i<6)
				{
					if (n<m)
					{
						System.out.println("your number is overflowing....");
					}
					else
					{
						System.out.println("your number is underneath to the required number");
					}
				}
				if (i==4)
				{
					System.out.println("You are running out of chances....");
				}
				score-=100;
			}
			if (i==7)
			{
				System.out.println("All your chances are exhausted....");
				System.out.println("The number is : ");
				delay();
				System.out.println("@@@@@ "+n+" @@@@@");
				System.out.println("Better luck next time....");
			}
			System.out.println("Do you want to play again....");
			String response=scan.next();
			if (response.equals("yes")){
				delay();
			    game();
			}
			else
			{
				delay();
				System.out.println("I hope to see you again");
				System.out.println("Have a good day");
			}
		}
	}
	

