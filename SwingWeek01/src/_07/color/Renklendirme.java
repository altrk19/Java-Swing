package _07.color;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Renklendirme extends JFrame{

	public Renklendirme() {
		JButton merkezButon = new JButton("CENTER");
		Color renk =new Color(100, 150, 250);
		
		//belirledigimiz rengi setBackground() ile butona atayalým
		merkezButon.setBackground(renk);
		BorderLayout layout=new BorderLayout(40,40);
		setLayout(layout);
		
		add(new JButton("BATI"),BorderLayout.WEST);
		add(new JButton("KUZEY"),BorderLayout.NORTH);
		add(new JButton("GUNEY"),BorderLayout.SOUTH);
		add(merkezButon,BorderLayout.CENTER);
		
		//color nesnesi kullanmadan da renk verilebilir
		//EAST butonunu color nesnesi kullanmadan olusturalým
		
		JButton dogu=new JButton("DOGU");
		dogu.setBackground(Color.RED);
		add(dogu,BorderLayout.EAST);
	}
	
	
}
