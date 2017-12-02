package _01.pencere;

import javax.swing.JFrame;

public class Pencere {

	public static void main(String[] args) {
		//JFrame s�n�f�ndan pencere isimli bir nesne olu�tural�m. Ekrana hangi isimle gelece�ini constructor'da belirtelim
		JFrame pencere=new JFrame("penceremiz");
		
		//pencerimizin boyutlar�n� setSize() ile belirleyelim.
		//ilk verilen de�er en, ikinci verilen de�er boy'a ait pixel cinsinden boyutlard�r.
		pencere.setSize(400,400);
		
		//penceremizin ekranda nerede g�r�nt�lenece�ini setLocationRelativeTo() ile belirleyelim
		//bu metoda de�er olarak null verilirse pencere ortada yer alacakt�r
		pencere.setLocationRelativeTo(null);
		
		//penceremiz kapat�ld�g�nda yap�lacak i�lemi setDefaultCloseOperation() ile belirleyelim
		//pencere kapat�ld�g�nda uygulamadan ��ks�n
		pencere.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//penceremizin ekranda g�r�nt�lenmesi i�in setVisible() metodunu kullanal�m
		//bu metot �a�r�lmazsa pencerelerimiz ekranda g�r�lmez.(false yaparsan da g�r�lmez)
		pencere.setVisible(true);

	}

}
