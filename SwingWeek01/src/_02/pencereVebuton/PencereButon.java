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
		
		//jbutton s�n�f�ndan bir buton nesnesi olu�turual�m ve butona isim verelim
		JButton buton=new JButton("TAMAM");
		
		//butonumuzun add() metodu ile penceremize ekleyelim.(��karmak i�in remove() metodunu kullanabiliriz)
		pencere.add(buton);

	}

}
