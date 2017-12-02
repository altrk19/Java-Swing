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
		
		//ikinci paneli olustural�m ve ilk paneli ikinci panele ekleyelim
		JPanel panel2=new JPanel();
		panel2.setLayout(new BorderLayout());
		panel2.add(sagPanel,BorderLayout.CENTER);
		
		//sol tarafa(bat�ya) bir buton ekleyelim
		panel2.add(new JButton("WEST"),BorderLayout.WEST);
		
		//paneli �enceremize ekleyelim
		add(panel2);
	}
}


//sadece add(...) metodunu kulland�g�m�zda ana pencereye ekler.