package _09.panel;

import javax.swing.JFrame;

public class PanellerMain {

	public static void main(String[] args) {
		Paneller pencere=new Paneller();
		pencere.setSize(400,300);
		pencere.setTitle("Pencere Panel");
		pencere.setLocationRelativeTo(null);
		pencere.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pencere.setVisible(true);

	}

}
