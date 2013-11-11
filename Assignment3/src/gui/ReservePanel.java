package gui;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.JFrame;
import javax.swing.JLabel;

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
public class ReservePanel extends JPanel implements ActionListener {
	private JLabel titleLabel;
	private JLabel logLabel;
	private JLabel newLabel;
	private JTextField passwordField;
	private JTextField nameField;
	private JButton cancelButton;
	private JButton addButton;

	/**
	* Auto-generated main method to display this 
	* JPanel inside a new JFrame.
	*/
		
	public ReservePanel() {
		try {
			this.setPreferredSize(new java.awt.Dimension(1000, 800));
			this.setLayout(null);
			{
				titleLabel = new JLabel();
				this.add(titleLabel);
				titleLabel.setText("Reserve");
				titleLabel.setBounds(424, 26, 137, 58);
				titleLabel.setFont(new java.awt.Font("¸¼Àº °íµñ",0,36));
			}
			{
				addButton = new JButton();
				this.add(addButton);
				addButton.setText("New Reserve");
				addButton.setBounds(664, 274, 295, 114);
				addButton.setFont(new java.awt.Font("¸¼Àº °íµñ",0,28));
				addButton.addActionListener(this);
			}
			{
				cancelButton = new JButton();
				this.add(cancelButton);
				cancelButton.setText("Log In");
				cancelButton.setBounds(370, 263, 148, 61);
				cancelButton.setFont(new java.awt.Font("¸¼Àº °íµñ",0,28));
				cancelButton.addActionListener(this);
			}
			{
				nameField = new JTextField();
				this.add(nameField);
				nameField.setBounds(51, 263, 305, 49);
			}
			{
				passwordField = new JTextField();
				this.add(passwordField);
				passwordField.setBounds(51, 357, 305, 49);
				//passwordField.setEditable(false);
			}
			{
				logLabel = new JLabel();
				this.add(logLabel);
				logLabel.setText("Do You have appointment already?");
				logLabel.setBounds(63, 175, 439, 70);
				logLabel.setFont(new java.awt.Font("¸¼Àº °íµñ",0,22));
			}
			{
				newLabel = new JLabel();
				this.add(newLabel);
				newLabel.setText("Make a new Appointment?");
				newLabel.setBounds(664, 197, 290, 60);
				newLabel.setFont(new java.awt.Font("¸¼Àº °íµñ",0,20));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public String getNameField() {
		return nameField.getText();
	}
	
	public String getPasswordField() {
		return passwordField.getText();
	}
	public void actionPerformed(ActionEvent event)
	{
		if (event.getActionCommand().equals("New Reserve")){	
			MainFrame.newreservepanel();
		}
		if (event.getActionCommand().equals("Log In")){			
			//Customer check = new Customer(getNameField(),getPasswordField());
			if (MainFrame.reserveQ.contains(getNameField(),getPasswordField()))
			{			
					MainFrame.removepanel();
					System.out.println(MainFrame.reserveQ.contains(getNameField(),getPasswordField()));
			}else{
				logLabel.setText("Wrong ID or Password please retype");
				nameField.setText("");
				passwordField.setText("");
				
			}
					//MainFrame.getreserveQ().remove(c);
				//System.out.println("succed"+c);
		}
		}
	
		
	
}
