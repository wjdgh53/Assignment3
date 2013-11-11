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
public class FinalPanel extends JPanel implements ActionListener{
	private JLabel titleLabel;
	private JButton returnButton;
	private JLabel jLabel1;
	private JLabel waitLabel;

	/**
	* Auto-generated main method to display this 
	* JPanel inside a new JFrame.
	*/
	
	public FinalPanel() {
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
				titleLabel.setText("Waiting Time");
				titleLabel.setBounds(379, 5, 235, 126);
				titleLabel.setFont(new java.awt.Font("¸¼Àº °íµñ",0,36));
			}
			{
				
				waitLabel = new JLabel();
				this.add(waitLabel);
				waitLabel.setText("Your expecting Waiting time is");
				waitLabel.setBounds(12, 177, 442, 126);
				waitLabel.setFont(new java.awt.Font("¸¼Àº °íµñ",0,28));
			}
			{
				jLabel1 = new JLabel();
				this.add(jLabel1);
				jLabel1.setText(calculate());
				jLabel1.setBounds(267, 342, 499, 133);
				jLabel1.setFont(new java.awt.Font("¸¼Àº °íµñ",0,28));
			}
			{
				returnButton = new JButton();
				this.add(returnButton);
				returnButton.setText("Main Page");
				returnButton.setBounds(699, 606, 214, 86);
				returnButton.setFont(new java.awt.Font("¸¼Àº °íµñ",0,28));
				returnButton.addActionListener(this);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public String calculate(){
		
		return "0minute";
	}
	public void actionPerformed(ActionEvent event)
	{
		if (event.getActionCommand().equals("Main Page")){
			MainFrame.welcomepanel();
		}
	}
}
