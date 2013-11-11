package gui;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import javax.swing.JFrame;
import javax.swing.JLabel;


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
public class RemovePanel extends JPanel implements ActionListener{
	private JLabel titleLabel;
	private JLabel seatLabel;
	private JButton returnButton;
	private JButton removeButton;
	private JLabel status;

	/**
	* Auto-generated main method to display this 
	* JPanel inside a new JFrame.
	*/
	
	public RemovePanel() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			setPreferredSize(new Dimension(1000, 800));
			this.setLayout(null);
			{
				titleLabel = new JLabel();
				this.add(titleLabel);
				titleLabel.setText("Remove");
				titleLabel.setBounds(417, 12, 140, 74);
				titleLabel.setFont(new java.awt.Font("¸¼Àº °íµñ",0,36));
			}
			{
				status = new JLabel();
				this.add(status);
				status.setText("You're currently registered at :");
				status.setBounds(185, 181, 505, 89);
				status.setFont(new java.awt.Font("¸¼Àº °íµñ",0,26));
			}
			{
				removeButton = new JButton();
				this.add(removeButton);
				removeButton.setText("Remove");
				removeButton.setBounds(624, 591, 145, 74);
				removeButton.setFont(new java.awt.Font("¸¼Àº °íµñ",0,20));
				removeButton.addActionListener(this);
			}
			{
				returnButton = new JButton();
				this.add(returnButton);
				returnButton.setText("Main Page");
				returnButton.setBounds(822, 591, 145, 74);
				returnButton.setFont(new java.awt.Font("¸¼Àº °íµñ",0,20));
				returnButton.addActionListener(this);
			}
			{
				seatLabel = new JLabel();
				this.add(seatLabel);
				seatLabel.setBounds(287, 321, 337, 107);
				seatLabel.setFont(new java.awt.Font("¸¼Àº °íµñ",0,24));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void actionPerformed(ActionEvent event)
	{
		if (event.getActionCommand().equals("Remove")){	
			seatLabel.setVisible(false);
			status.setText("Your appointment removed from our list");
		}
		if (event.getActionCommand().equals("Main Page")){	
			MainFrame.welcomepanel();
		}
	}
}
