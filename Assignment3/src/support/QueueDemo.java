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
		//q.read();
		for(int i = 0 ; i < q.read().length; i++)
		{
			System.out.println(q.read()[i]);
			
		}
		//System.out.println(q.next());
		//System.out.println(q.next());
		/*System.out.println("input the data");
		String name = keyboard.nextLine();
		String password = keyboard.nextLine();
		String seat = keyboard.nextLine();
		int time = keyboard.nextInt();
		keyboard.nextLine();
		
		System.out.println("please input the id");
		String check = keyboard.nextLine();
		Customer input = new Customer(name,password,seat,time);
		q.offer(input);
		System.out.println(q);
		System.out.println(check);
		System.out.println(name);
		if(check.equals(name)){
			System.out.println("moya jinjja");
		}
		System.out.println(q.contains(name));
		System.out.println(q.contains(check));*/
		//System.out.println(q.contains("Jinlan"));
		//System.out.println(q.contains("Jeongho"));
		//System.out.println(q.contains("jinlan"));
		
		//System.out.println("please input the id");
		//String check = keyboard.nextLine();
		//System.out.println(q.contains(check));
		//System.out.println(q.contains("jinlan"));
		//System.out.println(q.contains("lulu"));
		//System.out.println(q.contains("chaewon"));
		
	}
	/*public static boolean check(CirQueue cq, Customer c2){
		
		while(!cq.isEmpty())
		{
			Customer c = (Customer) cq.next();
			
			if(c2.getSeat()==c.getSeat())
			{
				if((c2.getHour()-c.getHour())<=100)
				System.out.println(c2.getHour()-c.getHour());
				return false;
				
			}
				if((c2.getHour()-c.getHour())<=100)
				{
					System.out.println("Please this");
					return false;
					
				}
				
				cq.remove(c);
			
		}*/
		//System.out.println(
	

}
