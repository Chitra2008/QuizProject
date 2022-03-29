import java.awt.Color;
import java.awt.Font;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class ThankUScreen extends JFrame  {

	JLabel l1 = new JLabel(new ImageIcon("images/quiz.jpg"));
	JLabel b1 = new JLabel();
	
	
	public ThankUScreen(String nm) {
		setTitle("Quiz Time");
		setSize(400, 400);
		setVisible(true);
		
		add("South",b1);
		b1.setText("           Thank You "+nm);
		b1.setFont(new Font("Dialog", Font.BOLD, 24));
		b1.setForeground(Color.RED);
		add(l1);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setLocation(250, 100);
	}
	
	

	

}
