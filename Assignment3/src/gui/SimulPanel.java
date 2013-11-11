package gui;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import support.ThreadDemo;

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
public class SimulPanel extends JPanel implements ActionListener  {
	private JList waitList;
	private JLabel stoolLabel;
	private JLabel barLabel;
	private JLabel stoolLabel2;
	private JLabel stoolLabel3;
	private JLabel timeLabel;
	private JLabel wsLabel2;
	private JLabel boothLabel;
	private JButton startButton;
	private JList reserveList;
	private JButton removeButton;
	private JButton returnButton;
	private JLabel boothLabel4;
	private JLabel boothLabel3;
	private JLabel boothLabel2;
	private JLabel boothLabel1;
	private JLabel wsLabel4;
	private JLabel wsLabel3;
	private JLabel wsLabel1;
	private JLabel windowLabel;
	private JLabel stoolLabel4;
	private JLabel waitlistLabel;
	int hour = 9;
	int minute = 0;
	int totalTime;
	Thread th2 = new Thread();
	/**
	* Auto-generated main method to display this 
	* JPanel inside a new JFrame.
	 * @throws InterruptedException 
	*/

	
	public SimulPanel()  {
		super();
		initGUI();
		th2.start();
	}
	public void resetList(){
		waitList = new JList(new DefaultListModel());
		DefaultListModel waitListModel = (DefaultListModel) waitList.getModel();
		this.add(waitList);
		
	     for (int i = 0; i < MainFrame.waitingQ.read().length; i++) {
	            waitListModel.addElement(MainFrame.waitingQ.read()[i]);
	     }
	     reserveList = new JList(new DefaultListModel());
			DefaultListModel reserveListModel = (DefaultListModel) reserveList.getModel();
			this.add(reserveList);
			/*String[] bar = {
		            "Bar 1", "Bar 2", "Bar 3", "Bar 4"};*/
		     for (int i = 0; i < MainFrame.reserveQ.read().length; i++) {
		            reserveListModel.addElement(MainFrame.reserveQ.read()[i]);
		     }
	     
	}
	private void initGUI(){
		
		try {
			setPreferredSize(new Dimension(1000, 800));
			this.setLayout(null);
			{
				resetList();
				waitList.setBounds(14, 74, 439, 285);
				waitList.setFont(new java.awt.Font("¸¼Àº °íµñ",0,20));
			}
			{
				waitlistLabel = new JLabel();
				this.add(waitlistLabel);
				waitlistLabel.setText("         Wait List");
				waitlistLabel.setBounds(0, 0, 248, 74);
				waitlistLabel.setFont(new java.awt.Font("¸¼Àº °íµñ",0,22));
			}
			{
				stoolLabel = new JLabel();
				this.add(stoolLabel);
				stoolLabel.setText("Stool 1");
				stoolLabel.setBounds(459, 107, 74, 44);
				stoolLabel.setFont(new java.awt.Font("¸¼Àº °íµñ",0,20));
			}
			{
				barLabel = new JLabel();
				this.add(barLabel);
				barLabel.setText("Bar");
				barLabel.setBounds(459, 37, 123, 44);
				barLabel.setFont(new java.awt.Font("¸¼Àº °íµñ",0,36));
			}
			{
				stoolLabel2 = new JLabel();
				this.add(stoolLabel2);
				stoolLabel2.setText("Stool 2");
				stoolLabel2.setBounds(587, 107, 74, 45);
				stoolLabel2.setFont(new java.awt.Font("¸¼Àº °íµñ",0,20));
			}
			{
				stoolLabel3 = new JLabel();
				this.add(stoolLabel3);
				stoolLabel3.setText("Stool 3");
				stoolLabel3.setBounds(716, 106, 78, 47);
				stoolLabel3.setFont(new java.awt.Font("¸¼Àº °íµñ",0,20));
			}
			{
				stoolLabel4 = new JLabel();
				this.add(stoolLabel4);
				stoolLabel4.setText("Stool 4");
				stoolLabel4.setBounds(845, 107, 78, 43);
				stoolLabel4.setFont(new java.awt.Font("¸¼Àº °íµñ",0,20));
			}
			{
				windowLabel = new JLabel();
				this.add(windowLabel);
				windowLabel.setText("Window");
				windowLabel.setBounds(459, 238, 185, 44);
				windowLabel.setFont(new java.awt.Font("¸¼Àº °íµñ",0,36));
			}
			{
				wsLabel1 = new JLabel();
				this.add(wsLabel1);
				wsLabel1.setText("Window 1");
				wsLabel1.setBounds(459, 327, 117, 44);
				wsLabel1.setFont(new java.awt.Font("¸¼Àº °íµñ",0,20));
			}
			{
				wsLabel2 = new JLabel();
				this.add(wsLabel2);
				wsLabel2.setText("Window 2");
				wsLabel2.setBounds(587, 327, 117, 44);
				wsLabel2.setFont(new java.awt.Font("¸¼Àº °íµñ",0,20));
			}
			{
				wsLabel3 = new JLabel();
				this.add(wsLabel3);
				wsLabel3.setText("Window 3");
				wsLabel3.setBounds(716, 327, 117, 44);
				wsLabel3.setFont(new java.awt.Font("¸¼Àº °íµñ",0,20));
			}
			{
				wsLabel4 = new JLabel();
				this.add(wsLabel4);
				wsLabel4.setText("Window 4");
				wsLabel4.setBounds(845, 327, 117, 44);
				wsLabel4.setFont(new java.awt.Font("¸¼Àº °íµñ",0,20));
			}
			{
				boothLabel = new JLabel();
				this.add(boothLabel);
				boothLabel.setText("Booth");
				boothLabel.setBounds(459, 518, 117, 42);
				boothLabel.setFont(new java.awt.Font("¸¼Àº °íµñ",0,36));
			}
			{
				boothLabel1 = new JLabel();
				this.add(boothLabel1);
				boothLabel1.setText("Booth 1");
				boothLabel1.setBounds(459, 562, 117, 45);
				boothLabel1.setFont(new java.awt.Font("¸¼Àº °íµñ",0,20));
			}
			{
				boothLabel2 = new JLabel();
				this.add(boothLabel2);
				boothLabel2.setText("Booth 2");
				boothLabel2.setBounds(587, 562, 117, 44);
				boothLabel2.setFont(new java.awt.Font("¸¼Àº °íµñ",0,20));
			}
			{
				boothLabel3 = new JLabel();
				this.add(boothLabel3);
				boothLabel3.setText("Booth 3");
				boothLabel3.setBounds(716, 562, 113, 44);
				boothLabel3.setFont(new java.awt.Font("¸¼Àº °íµñ",0,20));
			}
			{
				boothLabel4 = new JLabel();
				this.add(boothLabel4);
				boothLabel4.setText("Booth 4");
				boothLabel4.setBounds(845, 562, 113, 43);
				boothLabel4.setFont(new java.awt.Font("¸¼Àº °íµñ",0,20));
			}
			{
				returnButton = new JButton();
				this.add(returnButton);
				returnButton.setText("Reserve");
				returnButton.setBounds(768, 672, 181, 70);
				returnButton.setFont(new java.awt.Font("¸¼Àº °íµñ",0,28));
				returnButton.addActionListener(this);
			}
			{
				removeButton = new JButton();
				this.add(removeButton);
				removeButton.setText("Remove");
				removeButton.setBounds(85, 672, 185, 68);
				removeButton.setFont(new java.awt.Font("¸¼Àº °íµñ",0,28));
			}
			{
				
			    resetList();
				reserveList.setBounds(14, 365, 439, 265);
				reserveList.setFont(new java.awt.Font("¸¼Àº °íµñ",0,18));
			}
			{
				//timeLabel.setText(hour + " : "+minute);
				
				
				timeLabel = new JLabel();
				this.add(timeLabel);
				
				//timeLabel.setText(hour + " : " +minute);
				
				timeLabel.setBounds(819, 12, 159, 89);
				timeLabel.setFont(new java.awt.Font("¸¼Àº °íµñ",0,36));
			}
			{
				startButton = new JButton();
				this.add(startButton);
				startButton.setText("Start");
				startButton.setBounds(290, 672, 39, 24);
				startButton.addActionListener(this);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void actionPerformed(ActionEvent event)
	{
		if (event.getActionCommand().equals("Reserve")){	
			MainFrame.newreservepanel();
		}
		if(event.getActionCommand().equals("Start")){
			ThreadDemo th1 = new ThreadDemo();
			th1.start();
			startButton.setVisible(false);
			/*int totalTime = (((MainFrame.reserveQ.next().getHour()-900)/100)*60)+
					((MainFrame.reserveQ.next().getHour()-900)-((MainFrame.reserveQ.next().getHour()-900)/100)*100);
			System.out.println(totalTime);*/
		}
	}

	public class Thread2 extends Thread
	{
		public void run(){
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
	public class ThreadDemo extends Thread 
	{
		int minute = 0;
		int hour = 9;
		Thread2 th3 = new Thread2();
		public void run()
		{
			for(int i = 0; i<720; i++)
			{
				minute++;
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if(minute == 60)
				{
					hour++;
					minute = 0;
				}
				timeLabel.setText(hour+ " : "+minute);
				
				
				int totalTime = (((MainFrame.reserveQ.next().getHour()-900)/100)*60)+
						((MainFrame.reserveQ.next().getHour()-900)-((MainFrame.reserveQ.next().getHour()-900)/100)*100);
				if(totalTime == i)
				{

					if(MainFrame.reserveQ.next().getSeat().equals("Bar 1"))
					{
						stoolLabel.setText("occupied");
						MainFrame.reserveQ.remove(MainFrame.reserveQ.next());
						resetList();

					}
					if(MainFrame.reserveQ.next().getSeat().equals("Bar 2"))
					{
						stoolLabel2.setText("occupied");
						MainFrame.reserveQ.remove();
						resetList();

					}
					if(MainFrame.reserveQ.next().getSeat().equals("Bar 3"))
					{
						stoolLabel3.setText("occupied");
						MainFrame.reserveQ.remove();
						resetList();

					}
					if(MainFrame.reserveQ.next().getSeat().equals("Bar 4"))
					{
						stoolLabel4.setText("occupied");
						MainFrame.reserveQ.remove();
						resetList();

					}
					if(MainFrame.reserveQ.next().getSeat().equals("Window 1"))
					{
						wsLabel1.setText("occupied");
						MainFrame.reserveQ.remove();
						resetList();

					}
					if(MainFrame.reserveQ.next().getSeat().equals("Window 2"))
					{
						wsLabel2.setText("occupied");
						MainFrame.reserveQ.remove();
						resetList();

					}
					if(MainFrame.reserveQ.next().getSeat().equals("Window 3"))
					{
						//System.out.println("check");
						wsLabel3.setText("occupied");
						MainFrame.reserveQ.remove();
						resetList();

					}
					if(MainFrame.reserveQ.next().getSeat().equals("Window 4"))
					{
						wsLabel4.setText("occupied");
						MainFrame.reserveQ.remove();
						resetList();


					}
					if(MainFrame.reserveQ.next().getSeat().equals("Booth 1"))
					{
						boothLabel1.setText("occupied");
						MainFrame.reserveQ.remove();
						resetList();

					}
					if(MainFrame.reserveQ.next().getSeat().equals("Booth 2"))
					{
						boothLabel2.setText("occupied");
						MainFrame.reserveQ.remove();
						resetList();

					}
					if(MainFrame.reserveQ.next().getSeat().equals("Booth 3"))
					{
						boothLabel3.setText("occupied");
						MainFrame.reserveQ.remove();
						resetList();

					}
					if(MainFrame.reserveQ.next().getSeat().equals("Booth 4"))
					{
						boothLabel4.setText("occupied");
						MainFrame.reserveQ.remove();
						resetList();

					}
					if(totalTime +15 == i)
					{
						stoolLabel.setText("Stool 1");
						stoolLabel2.setText("Stool 2");
						stoolLabel3.setText("Stool 3");
						stoolLabel4.setText("Stool 4");
						wsLabel1.setText("Window 1");
						wsLabel2.setText("Window 2");
						wsLabel3.setText("Window 3");
						wsLabel4.setText("Window 4");
						boothLabel1.setText("Booth 1");
						boothLabel2.setText("Booth 2");
						boothLabel3.setText("Booth 3");
						boothLabel4.setText("Booth 4");

					}
				}

			}

		}

	}

}
