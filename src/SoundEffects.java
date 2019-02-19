import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SoundEffects implements ActionListener{
	JButton button=new JButton();
	JButton button1=new JButton();
	JButton button2=new JButton();
	JFrame frame=new JFrame();
	JPanel panel=new JPanel();
public static void main(String[] args) {
	SoundEffects se= new SoundEffects();
}
public SoundEffects() {
	frame.add(panel);
	panel.add(button);
	panel.add(button1);
	panel.add(button2);
	button.addActionListener(this);
	button1.addActionListener(this);
	button2.addActionListener(this);
	frame.pack();
	frame.setVisible(true);
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource()==button) {
		playSound("Button.wav");
	}
	if(e.getSource()==button1) {
		playSound("Button1.wav");
	}
	if(e.getSource()==button2) {
		playSound("Button3.wav");
	}
}
private void playSound(String fileName) {
    AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName)); 
    sound.play();
}


}
