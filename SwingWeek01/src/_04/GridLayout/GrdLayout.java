package _04.GridLayout;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GrdLayout extends JFrame{
	//constructorda verilen degerler sat�r ve sutun say�lar�, sat�r ve sutunlar aras�ndaki bosluklar�n pixel cinsinden degeri
	public GrdLayout() {
		GridLayout layout =new GridLayout(3, 2,3,3);
		
		//penceremizin sola biti�ik oldugunu belirtmek i�in setLayout() metoduna layout nesnemizi at�yoruz.
		setLayout(layout);
		add(new JLabel("isim"));
		add(new JTextField(25));
		add(new JLabel("soyisim"));
		add(new JTextField(25));
		add(new JLabel("yas"));
		add(new JTextField(3));
	}
	
	
	
}
