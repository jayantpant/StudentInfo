import javax.swing.*;

public class Welcome {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		
		//frame.setSize(700,500);
		//frame.setLocation(100, 50);
		frame.setBounds(100,100,1000,500);
		frame.setTitle("Welcome to StudentInfo");
	}
}