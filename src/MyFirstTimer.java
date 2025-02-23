import acm.graphics.*;
import acm.program.*;
import javax.swing.*;
import java.awt.event.*;


public class MyFirstTimer extends GraphicsProgram implements ActionListener {
	public static final int PROGRAM_HEIGHT = 600;
	public static final int PROGRAM_WIDTH = 800;
	public static final int MAX_STEPS = 20;
	
	private GLabel myLabel;
	private Timer someTimeVar;
	private int count = 0;
	

	public void init() {
		setSize(PROGRAM_WIDTH, PROGRAM_HEIGHT);
		requestFocus();
	}
	
	public void run() {
		myLabel = new GLabel("times called? ", 1, 100);
		add(myLabel);
		
		//ball b = new ball();
		//add(b.getball());
		
		
		someTimeVar = new Timer(1000, this);
		someTimeVar.setInitialDelay(3000);
		someTimeVar.start();
		
	}
	
	public void actionPerformed(ActionEvent e) {
		//e.getActionCommand();
		myLabel.setLabel("times called? " + count);
		myLabel.move(5, 0);
		count++;
		if (count == 10) {
			someTimeVar.stop();
		}
	}
	
	public static void main(String[] args) {
		new MyFirstTimer().start();
	}
}