package _10.ikon;

import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ikonlar extends JFrame{
	private ImageIcon ikon=new ImageIcon(getClass().getResource("java-logo.jpeg"));
	//getClass ile ilk olarak ikonumuzun class'�n� buluyoruz.
	//getResource ile resim pkaeti alt�ndaki ikonumuzu bukur ve ona ait bir url d�ner.
	
	public Ikonlar() {
		setLayout(new GridLayout(2, 2,10,20));          //10=yataydaki componentler aras�ndaki uzakl�k      20=d��eydeki
		add(new JLabel(ikon));
		add(new JLabel(ikon));
	}

}
