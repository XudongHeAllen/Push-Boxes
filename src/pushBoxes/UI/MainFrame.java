package pushBoxes.UI;

import java.awt.Frame;

//for main frame to show out
//need to extend frame class
public class MainFrame extends Frame {
	//1.set the most base info of the frame
	//1.1 weather to show the frame
	//constructor
	public MainFrame(){
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
