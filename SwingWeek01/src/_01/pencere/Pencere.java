package _01.pencere;

import javax.swing.JFrame;

public class Pencere {

	public static void main(String[] args) {
		//JFrame sýnýfýndan pencere isimli bir nesne oluþturalým. Ekrana hangi isimle geleceðini constructor'da belirtelim
		JFrame pencere=new JFrame("penceremiz");
		
		//pencerimizin boyutlarýný setSize() ile belirleyelim.
		//ilk verilen deðer en, ikinci verilen deðer boy'a ait pixel cinsinden boyutlardýr.
		pencere.setSize(400,400);
		
		//penceremizin ekranda nerede görüntüleneceðini setLocationRelativeTo() ile belirleyelim
		//bu metoda deðer olarak null verilirse pencere ortada yer alacaktýr
		pencere.setLocationRelativeTo(null);
		
		//penceremiz kapatýldýgýnda yapýlacak iþlemi setDefaultCloseOperation() ile belirleyelim
		//pencere kapatýldýgýnda uygulamadan çýksýn
		pencere.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//penceremizin ekranda görüntülenmesi için setVisible() metodunu kullanalým
		//bu metot çaðrýlmazsa pencerelerimiz ekranda görülmez.(false yaparsan da görülmez)
		pencere.setVisible(true);

	}

}
