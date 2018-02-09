import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.Font;

public class FlowFrame extends JFrame {
	
	//PRIVATE INSTANCE VARIABLES
	private Font _georgia;
	private JLabel _firstNameLabel;

	//CONSTRUCTOR ++++++++++++++++++++++++++
	public FlowFrame() {
		
		this._initialize();
		
		this._firstNameLabel = new JLabel("First Name: ");
		this._firstNameLabel.setFont(this._georgia);
		getContentPane().add(this._firstNameLabel);
	}
	
	// PRIVATE METHODS ++++++++++++++++++++++++++++
	private void _initialize() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 300);
		getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		this._georgia = new Font("Georgia", Font.PLAIN, 16);
		
	}

}
