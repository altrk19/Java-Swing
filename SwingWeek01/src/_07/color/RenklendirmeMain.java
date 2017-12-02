package _07.color;

import javax.swing.JFrame;

import _06.mixedExample.KarmaPencere;

public class RenklendirmeMain {

	public static void main(String[] args) {
		Renklendirme pencere=new Renklendirme();
		pencere.setSize(400,300);
		pencere.setTitle("Pencere Renk");
		pencere.setLocationRelativeTo(null);
		pencere.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pencere.setVisible(true);

	}

}
