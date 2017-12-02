package _02.pencereVebuton;

import javax.swing.JButton;
import javax.swing.JFrame;

public class PencereButon {

	public static void main(String[] args) {
		JFrame pencere=new JFrame("penceremizin name");
		pencere.setSize(400,400);
		pencere.setLocationRelativeTo(null);
		pencere.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pencere.setVisible(true);
		
		//jbutton sýnýfýndan bir buton nesnesi oluþturualým ve butona isim verelim
		JButton buton=new JButton("TAMAM");
		
		//butonumuzun add() metodu ile penceremize ekleyelim.(çýkarmak için remove() metodunu kullanabiliriz)
		pencere.add(buton);

	}

}
