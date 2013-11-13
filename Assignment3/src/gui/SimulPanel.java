package gui;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

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




	/**
	 * Auto-generated main method to display this 
	 * JPanel inside a new JFrame.
	 * @throws InterruptedException 
	 */

	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		this.minute = minute;
	}
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	public SimulPanel()  {
		super();
		initGUI();
	}
	public void resetList(){
		//waitList = new JList(new DefaultListModel());

		this.add(waitList);
		DefaultListModel waitListModel = (DefaultListModel) waitList.getModel();
		for (int i = 0; i < MainFrame.waitingQ.read().length; i++) {
			waitListModel.addElement(MainFrame.waitingQ.read()[i]);
		}

		this.add(reserveList);
		DefaultListModel reserveListModel = (DefaultListModel) reserveList.getModel();
		for (int i = 0; i < MainFrame.reserveQ.read().length; i++) {
			reserveListModel.addElement(MainFrame.reserveQ.read()[i]);
		}

	}
	public void resetWaitList(){
		waitList.setVisible(false);
		DefaultListModel waitListModel = (DefaultListModel) waitList.getModel();
		waitListModel.removeAllElements();
		this.add(waitList);
		if(MainFrame.waitingQ.size() == 0)
		{
			waitListModel.addElement("Empty");
		}else{
			for (int i = 0; i < MainFrame.waitingQ.read().length; i++) {
				waitListModel.addElement(MainFrame.waitingQ.read()[i]);

			}
		}

		waitList.setVisible(true);
	}
	public void resetReserveList(){
		reserveList.setVisible(false);
		DefaultListModel reserveListModel = (DefaultListModel) reserveList.getModel();
		reserveListModel.removeAllElements();
		this.add(reserveList);
		if(MainFrame.reserveQ.size() == 0)
		{
			reserveListModel.addElement("Empty");
		}else{
			for (int i = 0; i < MainFrame.reserveQ.read().length; i++) {
				reserveListModel.addElement(MainFrame.reserveQ.read()[i]);

			}
		}
		reserveList.setVisible(true);
	}
	private void initGUI(){

		try {
			setPreferredSize(new Dimension(1000, 800));
			this.setLayout(null);
			waitList = new JList(new DefaultListModel());
			reserveList = new JList(new DefaultListModel());

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
				stoolLabel.setText("Bar 1");
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
				stoolLabel2.setText("Bar 2");
				stoolLabel2.setBounds(587, 107, 74, 45);
				stoolLabel2.setFont(new java.awt.Font("¸¼Àº °íµñ",0,20));
			}
			{
				stoolLabel3 = new JLabel();
				this.add(stoolLabel3);
				stoolLabel3.setText("Bar 3");
				stoolLabel3.setBounds(716, 106, 78, 47);
				stoolLabel3.setFont(new java.awt.Font("¸¼Àº °íµñ",0,20));
			}
			{
				stoolLabel4 = new JLabel();
				this.add(stoolLabel4);
				stoolLabel4.setText("Bar 4");
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
				startButton.setBounds(786, 672, 157, 68);
				startButton.setFont(new java.awt.Font("¸¼Àº °íµñ",0,24));
				startButton.addActionListener(this);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void actionPerformed(ActionEvent event)
	{
		if(event.getActionCommand().equals("Start")){
			ThreadDemo123 th1 = new ThreadDemo123();			
			th1.start();
			for(int i = 0; i <MainFrame.reserveQ.size(); i++){
				Thread2 th2 = new Thread2();
				th2.start();			
			}
			for(int i = 0; i <MainFrame.waitingQ.size(); i++){
				Thread3 th3 = new Thread3();
				th3.start();
			}
			//System.out.println(MainFrame.reserveQ);

			startButton.setVisible(false);

		}
	}
	public class Thread3 extends Thread
	{

		public String checkIn()
		{

			if(stoolLabel.getText().equals("Bar 1"))
			{
				stoolLabel.setText("occupied");
				return "Bar 1";
				//return true;
			}else if(stoolLabel2.getText().equals("Bar 2"))
			{
				stoolLabel2.setText("occupied");
				return "Bar 2";
				//return true;
			}else if(stoolLabel3.getText().equals("Bar 3"))
			{
				stoolLabel3.setText("occupied");
				return "Bar 3";
				//return true;
			}else if(stoolLabel4.getText().equals("Bar 4"))
			{
				stoolLabel4.setText("occupied");
				return "Bar 4";
				//return true;
			}else if(wsLabel1.getText().equals("Window 1"))
			{
				wsLabel1.setText("occupied");
				return "Window 1";
				//return true;
			}else if(wsLabel2.getText().equals("Window 2"))
			{
				wsLabel2.setText("occupied");
				return "Window 2";
				//return true;
			}else if(wsLabel3.getText().equals("Window 3"))
			{
				wsLabel3.setText("occupied");
				return "Window 3";
				//return true;
			}else if(wsLabel4.getText().equals("Window 4"))
			{
				wsLabel4.setText("occupied");
				return "Window 4";
				//return true;
			}else if(boothLabel1.getText().equals("Booth 1"))
			{
				boothLabel1.setText("occupied");
				return "Booth 1";
				//return true;
			}else if(boothLabel2.getText().equals("Booth 2"))
			{
				boothLabel2.setText("occupied");
				return "Booth 2";
				//return true;
			}else if(boothLabel3.getText().equals("Booth 3"))
			{
				boothLabel3.setText("occupied");
				return "Booth 3";
				//return true;
			}else if(boothLabel4.getText().equals("Booth 4"))
			{
				boothLabel4.setText("occupied");
				return "Booth 4";
				//return true;
			}else{
				return null;
			}

		}
		public void run(){
			Customer urTurn = MainFrame.reserveQ.next();
			String seat = checkIn();
			for(int i = 0; i<720; i++)
			{
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				if(seat.equals("Bar 1"))
				{
					MainFrame.waitingQ.dequeue();						
					resetWaitList();
					for(int j = 0; j < 15; j++){
						try {
							Thread.sleep(500);

						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					stoolLabel.setText("Bar 1");

					break;
				}
				if(seat.equals("Bar 2"))
				{

					MainFrame.waitingQ.dequeue();						
					resetWaitList();			
					for(int j = 0; j <15; j++){
						try {
							Thread.sleep(500);

						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}			
					}				
					stoolLabel2.setText("Bar 2");						
					break;
				}
				if(seat.equals("Bar 3"))
				{
					MainFrame.waitingQ.dequeue();						
					resetWaitList();			
					for(int j = 0; j <15; j++){
						try {
							Thread.sleep(500);

						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}			
					}				
					stoolLabel3.setText("Bar 3");

				}
				if(seat.equals("Bar 4"))
				{
					MainFrame.waitingQ.dequeue();						
					resetWaitList();			
					for(int j = 0; j <15; j++){
						try {
							Thread.sleep(500);

						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}			
					}				
					stoolLabel4.setText("Bar 4");

				}
				if(seat.equals("Window 1"))
				{
					MainFrame.waitingQ.dequeue();						
					resetWaitList();			
					for(int j = 0; j <15; j++){
						try {
							Thread.sleep(500);

						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}			
					}				
					wsLabel1.setText("Window 1");
				}
				if(seat.equals("Window 2"))
				{

					MainFrame.waitingQ.dequeue();						
					resetWaitList();			
					for(int j = 0; j <15; j++){
						try {
							Thread.sleep(500);

						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}			
					}		
					wsLabel2.setText("Window 2");

				}
				if(seat.equals("Window 3"))
				{
					MainFrame.waitingQ.dequeue();						
					resetWaitList();			
					for(int j = 0; j <15; j++){
						try {
							Thread.sleep(500);

						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}			
					}			
					wsLabel3.setText("Window 3");

				}
				if(seat.equals("Window 4"))
				{
					MainFrame.waitingQ.dequeue();						
					resetWaitList();			
					for(int j = 0; j <15; j++){
						try {
							Thread.sleep(500);

						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}			
					}				
					wsLabel4.setText("Window 4");
				}
				if(seat.equals("Booth 1"))
				{
					MainFrame.waitingQ.dequeue();						
					resetWaitList();			
					for(int j = 0; j <15; j++){
						try {
							Thread.sleep(500);

						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}			
					}				
					boothLabel1.setText("Booth 1");
				}
				if(seat.equals("Booth 2"))
				{
					MainFrame.waitingQ.dequeue();						
					resetWaitList();			
					for(int j = 0; j <15; j++){
						try {
							Thread.sleep(500);

						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}			
					}			
					boothLabel2.setText("Booth 2");
				}
				if(seat.equals("Booth 3"))
				{
					MainFrame.waitingQ.dequeue();						
					resetWaitList();			
					for(int j = 0; j <15; j++){
						try {
							Thread.sleep(500);

						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}			
					}			
					boothLabel3.setText("Booth 3");
				}
				if(seat.equals("Booth 4"))
				{
					MainFrame.waitingQ.dequeue();						
					resetWaitList();			
					for(int j = 0; j <15; j++){
						try {
							Thread.sleep(500);

						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}			
					}				
					boothLabel4.setText("Booth 4");
				}
			}
		}
	}
	public class Thread2 extends Thread
	{
		public void run(){
			Customer urTurn = MainFrame.reserveQ.next();
			for(int i = 0; i<720; i++)
			{

				minute++;
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if(minute == 60)
				{
					hour++;
					minute = 0;
				}
				int transferTime = urTurn.getHour()-900;
				int totalTime = ((transferTime/100)*60)+(transferTime%100);
				if(totalTime == i)
				{

					if(urTurn.getSeat().equals("Bar 1"))
					{
						stoolLabel.setText("occupied");
						MainFrame.reserveQ.dequeue();						
						resetReserveList();
						for(int j = 0; j < 15; j++){
							try {
								Thread.sleep(500);

							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
						stoolLabel.setText("Bar 1");

						break;
					}
					if(urTurn.getSeat().equals("Bar 2"))
					{
						stoolLabel2.setText("occupied");
						MainFrame.reserveQ.dequeue();						
						resetReserveList();			
						for(int j = 0; j <15; j++){
							try {
								Thread.sleep(500);

							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}			
						}				
						stoolLabel2.setText("Bar 2");						
						break;
					}
					if(urTurn.getSeat().equals("Bar 3"))
					{
						stoolLabel3.setText("occupied");				
						MainFrame.reserveQ.dequeue();						
						resetReserveList();			
						for(int j = 0; j <15; j++){
							try {
								Thread.sleep(500);

							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}			
						}				
						stoolLabel3.setText("Bar 3");

					}
					if(urTurn.getSeat().equals("Bar 4"))
					{

						stoolLabel4.setText("occupied");
						MainFrame.reserveQ.dequeue();						
						resetReserveList();			
						for(int j = 0; j <15; j++){
							try {
								Thread.sleep(500);

							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}			
						}				
						stoolLabel4.setText("Bar 4");

					}
					if(urTurn.getSeat().equals("Window 1"))
					{
						wsLabel1.setText("occupied");
						MainFrame.reserveQ.dequeue();						
						resetReserveList();			
						for(int j = 0; j <15; j++){
							try {
								Thread.sleep(500);

							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}			
						}				
						wsLabel1.setText("Window 1");
					}
					if(urTurn.getSeat().equals("Window 2"))
					{

						wsLabel2.setText("occupied");
						MainFrame.reserveQ.dequeue();						
						resetReserveList();			
						for(int j = 0; j <15; j++){
							try {
								Thread.sleep(500);

							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}			
						}				
						wsLabel2.setText("Window 2");

					}
					if(urTurn.getSeat().equals("Window 3"))
					{

						wsLabel3.setText("occupied");
						MainFrame.reserveQ.dequeue();						
						resetReserveList();			
						for(int j = 0; j <15; j++){
							try {
								Thread.sleep(500);

							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}			
						}				
						wsLabel3.setText("Window 3");

					}
					if(urTurn.getSeat().equals("Window 4"))
					{

						wsLabel4.setText("occupied");
						MainFrame.reserveQ.dequeue();						
						resetReserveList();			
						for(int j = 0; j <15; j++){
							try {
								Thread.sleep(500);

							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}			
						}				
						wsLabel4.setText("Window 4");
					}
					if(urTurn.getSeat().equals("Booth 1"))
					{
						boothLabel1.setText("occupied");
						MainFrame.reserveQ.dequeue();						
						resetReserveList();			
						for(int j = 0; j <15; j++){
							try {
								Thread.sleep(500);

							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}			
						}				
						boothLabel1.setText("Booth 1");
					}
					if(urTurn.getSeat().equals("Booth 2"))
					{
						boothLabel2.setText("occupied");
						MainFrame.reserveQ.dequeue();						
						resetReserveList();			
						for(int j = 0; j <15; j++){
							try {
								Thread.sleep(500);

							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}			
						}				
						boothLabel2.setText("Booth 2");
					}
					if(urTurn.getSeat().equals("Booth 3"))
					{
						boothLabel3.setText("occupied");
						MainFrame.reserveQ.dequeue();						
						resetReserveList();			
						for(int j = 0; j <15; j++){
							try {
								Thread.sleep(500);

							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}			
						}				
						boothLabel3.setText("Booth 3");
					}
					if(urTurn.getSeat().equals("Booth 4"))
					{
						boothLabel4.setText("occupied");
						MainFrame.reserveQ.dequeue();						
						resetReserveList();			
						for(int j = 0; j <15; j++){
							try {
								Thread.sleep(500);

							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}			
						}				
						boothLabel4.setText("Booth 4");
					}
				}
			}
		}


	}
	public class ThreadDemo123 extends Thread 
	{
		int minute = 0;
		int hour = 9;

		public void run()
		{
			for(int i = 0; i<720; i++)
			{
				minute++;
				try {
					Thread.sleep(500);
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

			}
		}

	}

}
