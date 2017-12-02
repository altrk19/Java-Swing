package _05.borderLayout;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BrdrLayout extends JFrame{
	public BrdrLayout() {
		BorderLayout layout=new BorderLayout(40,40);//komponentler arasýndakiyatay ve dikey uzaklýklarý pixel cinsinden belirledik
		setLayout(layout);
		add(new JButton("BATI"),BorderLayout.WEST);
		add(new JButton("DOGU"),BorderLayout.EAST);
		add(new JButton("KUZEY"),BorderLayout.NORTH);
		add(new JButton("GUNEY"),BorderLayout.SOUTH);
		add(new JButton("MERKEZ"),BorderLayout.CENTER);
	}
}
