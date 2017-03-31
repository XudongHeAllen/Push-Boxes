package pushBoxes.UI;

import java.awt.Frame;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

//for main frame to show out
//need to extend frame class
public class MainFrame extends Frame {
	//1.set the most base info of the frame
	//weather to show the frame
	//constructor
	public MainFrame(){
		//background init
		backgroundInit();
		//set main frame
		setMainFrameUI();
		
		
		
	}
	
	//background init function
	private void backgroundInit() {
		// TODO Auto-generated method stub
		//use JLabel make background
		Icon i = new ImageIcon("bg.png");
		JLabel lab_bg = new JLabel(i);
		lab_bg.setBounds(9, 32, 800, 600);
		//add imagie inte the frame
		this.add(lab_bg);
		
	}

	
	//function to set the frame;
	private void setMainFrameUI(){
		this.setLayout(null);
		//show the frame
		this.setVisible(true);
		//set the size of the frame,400,300
		this.setSize(800, 600);
		//set the postion of the frame
		this.setLocation(150, 100);
		//set title
		this.setTitle("Push Boxes : My First Project v1.0");
	}
}
