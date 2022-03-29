import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class ParticipantScreen extends JFrame implements ActionListener {

	JLabel lbLogo = new JLabel(new ImageIcon("images/quizlogo.jpg"));
	JLabel lbTitle = new JLabel("Participant Entry");
	JLabel lbName = new JLabel("Name: ");
	JTextField txtName = new JTextField(30);
	JLabel lbCity = new JLabel("City: ");
	JTextField txtCity = new JTextField(30);
	
	JButton b1 = new JButton("Proceed ");
	JPanel p1 = new JPanel();
	
	Font fo1=new Font("Dialog",Font.BOLD,14);
	Font foTitle=new Font("Dialog",Font.BOLD,16);
	public ParticipantScreen() {
		setTitle("Quiz Time");
		setSize(400, 400);
		setVisible(true);
		setLayout(null);
		lbLogo.setBounds(140,20,100,70);
		lbTitle.setBounds(140,80,270,70);
		lbTitle.setFont(foTitle);
		lbTitle.setForeground(Color.BLUE);
		add(lbLogo);
		add(lbTitle);
		
		lbName.setBounds(60,160,70,30);
		lbName.setFont(fo1);
		lbName.setForeground(Color.BLUE);
		add(lbName);
		
		txtName.setBounds(150,160,120,30);
		txtName.setFont(fo1);
		add(txtName);
		
		
		lbCity.setBounds(60,220,70,30);
		lbCity.setFont(fo1);
		lbCity.setForeground(Color.BLUE);
		add(lbCity);
		
		txtCity.setBounds(150,220,120,30);
		txtCity.setFont(fo1);
		add(txtCity);
		
		b1.setBounds(150,270,120,30);
		add(b1);
		b1.addActionListener(this);
		b1.setForeground(Color.BLUE);
		setLocation(250, 100);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) 
	{
		ParticipantScreen f = new ParticipantScreen();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Participant p = new Participant(txtName.getText(), txtCity.getText());
		QuizScreen f = new QuizScreen(p);
		this.setVisible(false);
		
	}

}
