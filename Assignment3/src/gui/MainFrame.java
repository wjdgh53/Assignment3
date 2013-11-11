package gui;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;

import support.CirQueue;
import support.Customer;


/**
* This code was edited or generated using CloudGarden's Jigloo
* SWT/Swing GUI Builder, which is free for non-commercial
* use. If Jigloo is being used commercially (ie, by a corporation,
* company or business for any purpose whatever) then you
* should purchase a license for each developer using Jigloo.
* Please visit www.cloudgarden.com for details.
* Use of Jigloo implies acceptance of these licensing terms.
* A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR
* THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED
* LEGALLY FOR ANY CORPORATE OR COMMERCIAL PURPOSE.
*/
public class MainFrame extends JFrame {
	private static JPanel mainPanel = new JPanel();
	/**
	* Auto-generated main method to display this JFrame
	*/
	public static CirQueue<Customer> reserveQ = new CirQueue<Customer>();
	public static CirQueue<Customer> waitingQ = new CirQueue<Customer>();
	
	
	public static void main(String[] args) 
	{
		MainFrame mf = new MainFrame();				
		mf.setVisible(true);
		Customer c1 = new Customer("Jeongho","123","Bar 2",930);
		Customer c2 = new Customer("jinlan","1234","Bar 1",1000);
		Customer c3 = new Customer("chaewon","12345","Bar 1",1300);
		
		waitingQ.offer(c1);
		waitingQ.offer(c2);
		waitingQ.offer(c3);
		
	}
	MainFrame(){
		try {
		//	setExtendedState(MAXIMIZED_BOTH);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			{
				//setExtendedState(MAXIMIZED_BOTH);
				setDefaultCloseOperation(EXIT_ON_CLOSE);
				getContentPane().add(mainPanel);
				welcomepanel();
			}
			pack();
			
			this.setSize(1000, 800);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
		
	}
	static void welcomepanel(){
		mainPanel.removeAll();
		mainPanel.add(new WelcomePanel());
		refresh(mainPanel);
		
	}
	static void reservepanel(){
		mainPanel.removeAll();
		mainPanel.add(new ReservePanel());
		refresh(mainPanel);
	}
	static void newreservepanel(){
		mainPanel.removeAll();
		mainPanel.add(new NewReservePanel());
		refresh(mainPanel);
	}
	static void removepanel(){
		mainPanel.removeAll();
		mainPanel.add(new RemovePanel());
		refresh(mainPanel);
	}
	static void finalpanel(){
		mainPanel.removeAll();
		mainPanel.add(new FinalPanel());
		refresh(mainPanel);
	}
	static void simulpanel() throws InterruptedException{
		mainPanel.removeAll();
		mainPanel.add(new SimulPanel());
		
		refresh(mainPanel);
	}
	static void refresh(Container contentPane){
		contentPane.setVisible(false);
		contentPane.setVisible(true);
	}
	
}
