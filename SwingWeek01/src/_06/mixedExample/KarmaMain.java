package _06.mixedExample;

import javax.swing.JFrame;

public class KarmaMain {

	public static void main(String[] args) {
		
		KarmaPencere pencere=new KarmaPencere();
		pencere.setSize(400,300);
		pencere.setTitle("Layout Yoneticileri Birarada");
		pencere.setLocationRelativeTo(null);
		pencere.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pencere.setVisible(true);


	}

}
