import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class WelcomeScreen extends JFrame implements ActionListener {

	JLabel l1 = new JLabel(new ImageIcon("images/quiz.jpg"));
	JButton b1 = new JButton("Start >>>");
	JPanel p1 = new JPanel();
	
	public WelcomeScreen() {
		setTitle("Quiz Time");
		setSize(400, 400);
		setVisible(true);
		p1.add(b1);
		add(l1);
		add("South",p1);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		b1.addActionListener(this);
		setLocation(250, 100);
	}
	
	public static void main(String[] args) 
	{
		WelcomeScreen f = new WelcomeScreen();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		ParticipantScreen f = new ParticipantScreen();
		this.setVisible(false);
		
		
	}

}
