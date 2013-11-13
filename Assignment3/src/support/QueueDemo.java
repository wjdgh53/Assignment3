package support;


import java.util.LinkedList;
import java.util.Scanner;

public class QueueDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		CirQueue<Customer> q = new CirQueue<Customer>();
		Customer c1 = new Customer("Jeongho","123","Bar 2",300);
		Customer c2 = new Customer("jinlan","1234","Bar 1",450);
		Customer c3 = new Customer("chaewon","12345","Bar 1",500);
		//Customer searchCust = new Customer("jinlan","1234","Bar 1",450); 
		q.offer(c1);
		q.offer(c2);
		q.offer(c3);
		q.offer(new Customer("hul","1232","Bar 3",200));
		q.offer(new Customer("check","1244","Window 4", 30));
		q.dequeue();
		System.out.println(q);
		q.dequeue();
		System.out.println(q);
		q.dequeue();
		System.out.println(q);
		q.dequeue();
		System.out.println(q);
		
		
		
	}

	

}
