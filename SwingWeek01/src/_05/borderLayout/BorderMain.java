package _05.borderLayout;

import javax.swing.JFrame;

public class BorderMain {

	public static void main(String[] args) {
		BrdrLayout pencere=new BrdrLayout();
		pencere.setSize(400,300);
		pencere.setTitle("Pencere");
		pencere.setLocationRelativeTo(null);
		pencere.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pencere.setVisible(true);

	}

}
