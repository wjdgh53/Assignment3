package gui;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.ListModel;
import javax.swing.event.ListSelectionListener;

import support.*;

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
public class NewReservePanel extends JPanel implements ActionListener{
	private JTextField firstNameField;
	private JLabel firstNameLabel;
	private JLabel seatLabel;
	private JTextField timeField;
	private JLabel timeLabel;
	private JButton doneButton;
	private JLabel titleLabel;
	private JButton finishButton;
	private JLabel errorLabel;
	private JButton selectButton;
	private JList categoryList;
	private JList seatList;
	private JTextField passwordField;
	private JLabel passwordLabel;
	private DefaultListModel seatListModel;
	//ublic CirQueue<Customer> q = new CirQueue<Customer>();
	/**
	* Auto-generated main method to display this 
	* JPanel inside a new JFrame.
	*/
		
	public NewReservePanel() {
		try {
			setPreferredSize(new Dimension(1000, 800));
			this.setLayout(null);
			{
				firstNameField = new JTextField();
				this.add(firstNameField);
				firstNameField.setBounds(344, 153, 130, 44);
			}
			{
				firstNameLabel = new JLabel();
				this.add(firstNameLabel);
				firstNameLabel.setText("First Name");
				firstNameLabel.setBounds(170, 139, 223, 57);
				firstNameLabel.setFont(new java.awt.Font("¸¼Àº °íµñ",0,24));
			}
			{
				passwordLabel = new JLabel();
				this.add(passwordLabel);
				passwordLabel.setText("password");
				passwordLabel.setBounds(170, 203, 223, 57);
				passwordLabel.setFont(new java.awt.Font("¸¼Àº °íµñ",0,24));
			}
			{
				seatLabel = new JLabel();
				this.add(seatLabel);
				seatLabel.setText("Which Seat do you prefer?");
				seatLabel.setBounds(74, 356, 595, 74);
				seatLabel.setFont(new java.awt.Font("¸¼Àº °íµñ",0,24));
			}
			{
				passwordField = new JTextField();
				this.add(passwordField);
				passwordField.setBounds(344, 215, 130, 35);
				passwordField.setSize(130, 44);
			}
			{
				seatList = new JList(new DefaultListModel());
				seatListModel = (DefaultListModel) seatList.getModel();
				this.add(seatList);
				
			seatList.setBounds(374, 477, 188, 186);
			}
			{
				ListModel categoryListModel = 
						new DefaultComboBoxModel(
								new String[] { "Bar Stool", "Window Seats", "Booth Seats"});
				categoryList = new JList();
				this.add(getcategoryList());
				categoryList.setModel(categoryListModel);
				categoryList.setBounds(118, 477, 183, 186);
				
			}
			{
				selectButton = new JButton();
				this.add(selectButton);
				selectButton.setText("Okay");
				selectButton.setBounds(596, 532, 111, 61);
				selectButton.addActionListener(this);
			}
			{
				errorLabel = new JLabel();
				this.add(errorLabel);
				errorLabel.setBounds(562, 265, 406, 85);
				errorLabel.setText("Error It is occupied");
				errorLabel.setFont(new java.awt.Font("¸¼Àº °íµñ",0,24));
				errorLabel.setVisible(false);
			}
			{
				finishButton = new JButton();
				this.add(finishButton);
				finishButton.setText("Finish");
				finishButton.setBounds(811, 697, 147, 69);
				finishButton.setFont(new java.awt.Font("¸¼Àº °íµñ",0,20));
				finishButton.addActionListener(this);
			}
			{
				titleLabel = new JLabel();
				this.add(titleLabel);
				titleLabel.setText("Please enter the information of customer");
				titleLabel.setBounds(142, 23, 726, 82);
				titleLabel.setFont(new java.awt.Font("¸¼Àº °íµñ",0,36));
			}
			{
				doneButton = new JButton();
				this.add(doneButton);
				doneButton.setText("Done");
				doneButton.setBounds(779, 610, 179, 60);
				doneButton.setFont(new java.awt.Font("¸¼Àº °íµñ",0,20));
				doneButton.addActionListener(this);
			}
			{
				timeLabel = new JLabel();
				this.add(timeLabel);
				timeLabel.setText("Please enter time");
				timeLabel.setBounds(130, 281, 168, 57);
				timeLabel.setFont(new java.awt.Font("¸¼Àº °íµñ",0,20));
			}
			{
				timeField = new JTextField();
				this.add(timeField);
				timeField.setBounds(344, 291, 130, 47);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public String getNameField() {
		return firstNameField.getText();
	}
	
	public String getPasswordField() {
		return passwordField.getText();
	}
	public int getTimeField()	{
		return Integer.parseInt(timeField.getText());
	}
	public void actionPerformed(ActionEvent event)
	{
		
		if (event.getActionCommand().equals("Okay")){	
			if(categoryList.getSelectedValue().equals("Bar Stool"))
			{
				seatListModel.removeAllElements();
				String[] bar = {
			            "Bar 1", "Bar 2", "Bar 3", "Bar 4"};
			     for (int i = 0; i < bar.length; i++) {
			            seatListModel.addElement(bar[i]);
			     }
			     //seatList.setModel(seatListModel);
				
			}
			
			if(categoryList.getSelectedValue().equals("Window Seats"))
			{
				seatListModel.removeAllElements();
				String[] window = {
			            "Window 1", "Window 2", "Window 3", "Window 4"};
			     for (int i = 0; i < window.length; i++) {
			            seatListModel.add(i, window[i]);
			     }
			     //seatList.setModel(seatListModel);
				
			}
			if(categoryList.getSelectedValue().equals("Booth Seats"))
			{
				seatListModel.removeAllElements();
				String[] booth = {
			            "Booth 1", "Booth 2", "Booth 3", "Booth 4"};
			     for (int i = 0; i < booth.length; i++) {
			            seatListModel.add(i, booth[i]);
			     }
			    // seatList.setModel(seatListModel);
				
			}
			
		}
		if(event.getActionCommand().equals("Done")){
			
			Customer c1 = new Customer(getNameField(),getPasswordField(),seatList.getSelectedValue().toString(),getTimeField());
			if(MainFrame.reserveQ.contains(getNameField(),getPasswordField())){
				errorLabel.setVisible(true);
				errorLabel.setText("Id and password are already exist");
			}else{
				if(MainFrame.reserveQ.check(seatList.getSelectedValue(),getTimeField()))
				{
					errorLabel.setVisible(true);
					errorLabel.setText("This seat is occupied at this time");
				}else{
					MainFrame.reserveQ.offer(c1);
					firstNameField.setText("");
					passwordField.setText("");
					timeField.setText("");
					errorLabel.setVisible(true);
					errorLabel.setText(c1+"successfully added");
				}
			}
				
		}
		if (event.getActionCommand().equals("Finish")){	
			MainFrame.welcomepanel();
			System.out.println(MainFrame.reserveQ.toString());
		}
		
	}
	public JList getcategoryList() {
		return categoryList;
	}

	

	
}
