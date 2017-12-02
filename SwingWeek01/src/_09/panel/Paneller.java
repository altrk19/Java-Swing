package _09.panel;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Paneller extends JFrame{

	public Paneller() {
		JPanel sagPanel=new JPanel();
		sagPanel.setLayout(new GridLayout(2, 2));
		
		sagPanel.add(new JButton("sag1"));
		sagPanel.add(new JButton("sag2"));
		sagPanel.add(new JButton("sag3"));
		sagPanel.add(new JButton("sag4"));
		
		//ikinci paneli olusturalým ve ilk paneli ikinci panele ekleyelim
		JPanel panel2=new JPanel();
		panel2.setLayout(new BorderLayout());
		panel2.add(sagPanel,BorderLayout.CENTER);
		
		//sol tarafa(batýya) bir buton ekleyelim
		panel2.add(new JButton("WEST"),BorderLayout.WEST);
		
		//paneli ðenceremize ekleyelim
		add(panel2);
	}
}


//sadece add(...) metodunu kullandýgýmýzda ana pencereye ekler.