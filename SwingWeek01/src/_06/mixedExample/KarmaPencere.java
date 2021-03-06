package _06.mixedExample;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class KarmaPencere extends JFrame{

	public KarmaPencere() {
		
		//butonları oluşturalım ve butonları barındıracak bir panel olusturalım
		JButton buton1=new JButton("buton1");
		JButton buton2=new JButton("buton2");
		JButton buton3=new JButton("buton3");
		JButton buton4=new JButton("buton4");
		JPanel butonPaneli=new JPanel();
		
		//butonPanelinin layout yöneticisini belirleyelim ve butonları panele ekleyim.
		butonPaneli.setLayout(new GridLayout(1, 4));
		butonPaneli.add(buton1);
		butonPaneli.add(buton2);
		butonPaneli.add(buton3);
		butonPaneli.add(buton4);
		
		
		//etiket olusturalım ,text alanı olusturalım ve etiketi içinde barındıran paneli olusturalım
		JLabel etiket=new JLabel("Etiket");
		JTextField metin=new JTextField(15);
		JPanel ikinciPanel=new JPanel();
		ikinciPanel.add(etiket);
		ikinciPanel.add(metin);
		
		
		//her iki panelin konumunu belirleyecek layout yoneticisini atayalım
		setLayout(new BorderLayout());
		add(ikinciPanel,BorderLayout.SOUTH);
		add(butonPaneli,BorderLayout.NORTH);
		
	}
}
