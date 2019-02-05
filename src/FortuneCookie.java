import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class FortuneCookie implements  ActionListener{
	JButton button=new JButton();
public static void main(String[] args) {
	FortuneCookie fc=new FortuneCookie();
	fc.showButton();
	int r= new Random().nextInt(5);
	if(r==0) {
		JOptionPane.showMessageDialog(null, "Your mom will let you have your favorite dessert");
	}
	if(r==1) {
		JOptionPane.showMessageDialog(null, "You will win $1,000,000");
	}
	if(r==2) {
		JOptionPane.showMessageDialog(null, "You will get an A+ on a test");
	}
	if(r==3) {
		JOptionPane.showMessageDialog(null, "Your parents will surprise you with a vacation to Disneyland!");
	}
	if(r==4) {
		JOptionPane.showMessageDialog(null, "You will recieve your favorite gift");
	}
}
public void showButton()	{
	JFrame frame=new JFrame();
	frame.setVisible(true);
	JPanel panel=new JPanel();
	frame.add(panel);
	panel.add(button);
	button.addActionListener(this);
	System.out.println("Button Clicked");
	frame.pack();
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	JOptionPane.showMessageDialog(null, "Woohoo!");
	if(e.getSource()==button) {
		
	}
}
}
