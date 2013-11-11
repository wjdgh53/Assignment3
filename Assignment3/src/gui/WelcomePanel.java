package gui;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.*;

import javax.swing.*;

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
public class WelcomePanel extends JPanel implements ActionListener{
	private JLabel titleLabel;
	private JButton waitButton;
	private JLabel timeLabel;
	private JButton reserveButton;
	private JLabel optionLabel;
	
	/**
	* Auto-generated main method to display this 
	* JPanel inside a new JFrame.
	*/
		
	public WelcomePanel() {
		try {
			this.setLayout(null);
			this.setPreferredSize(new java.awt.Dimension(1000, 800));
			{
				titleLabel = new JLabel();
				this.add(titleLabel);
				titleLabel.setText("Welcome to Basta Pasta");
				titleLabel.setFont(new java.awt.Font("¸¼Àº °íµñ",0,36));
				titleLabel.setBounds(309, 38, 498, 117);
			}
			{
				optionLabel = new JLabel();
				this.add(optionLabel);
				optionLabel.setText("Please choose the option");
				optionLabel.setFont(new java.awt.Font("¸¼Àº °íµñ",0,28));
				optionLabel.setBounds(309, 227, 492, 104);
			}
			{
				reserveButton = new JButton();
				this.add(reserveButton);
				reserveButton.setText("Reserve");
				reserveButton.setFont(new java.awt.Font("¸¼Àº °íµñ",0,24));
				reserveButton.setBounds(87, 486, 286, 109);
				reserveButton.addActionListener(this);
			}
			{
				waitButton = new JButton();
				this.add(waitButton);
				waitButton.setText("Start");
				waitButton.setFont(new java.awt.Font("¸¼Àº °íµñ",0,24));
				waitButton.setBounds(584, 486, 286, 109);
				waitButton.addActionListener(this);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void actionPerformed(ActionEvent event)
	{
		if (event.getActionCommand().equals("Reserve")){	
			
			MainFrame.reservepanel();
			
		}
		if (event.getActionCommand().equals("Start")){	
			try {
				MainFrame.simulpanel();
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
