import java.awt.Color;
import java.awt.Component;
import javax.swing.JFrame;

public class TwoDSnake {
	public static void main(String args[]) {
		
		JFrame obj=new JFrame();
		MainGame maingame=new MainGame();
		
		obj.setBounds(10, 10, 905, 700);
		obj.setBackground(Color.DARK_GRAY);
		obj.setResizable(false);
		obj.setVisible(true);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		obj.add(maingame);
		
	
	}

}
