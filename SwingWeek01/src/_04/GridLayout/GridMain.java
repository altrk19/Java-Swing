package _04.GridLayout;

import javax.swing.JFrame;

public class GridMain {

	public static void main(String[] args) {
		GrdLayout pencere=new GrdLayout();
		pencere.setSize(440,300);
		pencere.setTitle("Pencere");
		pencere.setLocationRelativeTo(null);
		pencere.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pencere.setVisible(true);

	}

}
