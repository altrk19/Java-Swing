package _10.ikon;

import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ikonlar extends JFrame{
	private ImageIcon ikon=new ImageIcon(getClass().getResource("java-logo.jpeg"));
	//getClass ile ilk olarak ikonumuzun class'ýný buluyoruz.
	//getResource ile resim pkaeti altýndaki ikonumuzu bukur ve ona ait bir url döner.
	
	public Ikonlar() {
		setLayout(new GridLayout(2, 2,10,20));          //10=yataydaki componentler arasýndaki uzaklýk      20=düþeydeki
		add(new JLabel(ikon));
		add(new JLabel(ikon));
	}

}
