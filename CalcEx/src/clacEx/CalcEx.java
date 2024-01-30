package clacEx;

import javax.swing.JFrame;

public class CalcEx extends JFrame {
	
	public CalcEx() {
		setLayout(null);
		
		setTitle("계산기");
		setVisible(true);
		setSize(300,370);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new CalcEx();
		
		
	}
}
