package support;

import gui.MainFrame;

import java.util.Random;
import java.util.Scanner;

public class RandomList
{

	public static void waitingRandom()
	{
		Random rand = new Random();
		Customer aCust;
		String [] name = {"Jeongho", "Bill", "Dennis","Peter","Jinlan","Chaewon","Irene","Sophia","Misong","Mike","Ara"};
		Scanner keyboard = new Scanner(System.in);
		System.out.println("How busy or famouse this restaurant is? scale 1-5");
		int level = keyboard.nextInt();
		int numOfCustomer = (level*100)+(int)(Math.random()*100);
		
		for (int i = 0; i < numOfCustomer; i++) 
		{			
			int nameIndex =(int)(Math.random()*(name.length));
			if (rand.nextInt(2) == 1) {
				aCust = new Customer(name[nameIndex], "Seat Info", 0);
				MainFrame.waitingQ.offer(aCust);
			} else {
				// waiting list =1
				int seat = (int)(Math.random()*3+1);
				int numSeat = (int)(Math.random()*4+1);
				int time = (int)((Math.random()*1160)+900);
				if(time %100 >=60 )
				{
					time =(((time/100)+1)*100)+((time%100)-60);
				}
				String seatInfo = null;
				if(seat == 1)
				{
					if(numSeat == 1)
					{
						seatInfo = "Bar 1";
					}if(numSeat == 2)
					{
						seatInfo = "Bar 2";
					}if(numSeat == 3)
					{
						seatInfo = "Bar 3";
					}if(numSeat == 4)
					{
						seatInfo = "Bar 4";
					}
					
				}if(seat == 2)
				{
					if(numSeat == 1)
					{
						seatInfo = "Window 1";
					}if(numSeat == 2)
					{
						seatInfo = "Window 2";
					}if(numSeat == 3)
					{
						seatInfo = "Window 3";
					}if(numSeat == 4)
					{
						seatInfo = "Window 4";
					}
					
				}if(seat == 3)
				{
					if(numSeat == 1)
					{
						seatInfo = "Booth 1";
					}if(numSeat == 2)
					{
						seatInfo = "Booth";
					}if(numSeat == 3)
					{
						seatInfo = "Booth 3";
					}if(numSeat == 4)
					{
						seatInfo = "Booth 4";
					}
					
				}
				aCust = new Customer(name[nameIndex], "1234", seatInfo, time);
				MainFrame.reserveQ.offer(aCust);
			}
		}
		
	}

}