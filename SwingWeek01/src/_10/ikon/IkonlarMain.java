package _10.ikon;

import javax.swing.JFrame;

public class IkonlarMain {

	public static void main(String[] args) {
		Ikonlar pencere=new Ikonlar();
		pencere.setSize(400,300);
		pencere.setTitle("Pencere Ikon");
		pencere.setLocationRelativeTo(null);
		pencere.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pencere.setVisible(true);

	}

}
