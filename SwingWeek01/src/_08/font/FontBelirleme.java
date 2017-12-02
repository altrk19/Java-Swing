package _08.font;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FontBelirleme extends JFrame {

	public FontBelirleme() {
		
		BorderLayout layout=new BorderLayout(40,40);
		setLayout(layout);
		
		add(new JButton("BATI"),BorderLayout.WEST);
		add(new JButton("DOGU"),BorderLayout.EAST);
		add(new JButton("KUZEY"),BorderLayout.NORTH);
		add(new JButton("GUNEY"),BorderLayout.SOUTH);
		
		//merkez butonumuz renkli olsun
		JButton merkez=new JButton("CENTER");
		merkez.setBackground(Color.YELLOW);
		add(merkez,BorderLayout.CENTER);
		
		//font objesi olustural�m
		//ilk arg�man yaz� karakterini,ikincisi karakterlerin g�r�n�m�n�,���nc�s� ise b�y�kl���n� ifade edder
		Font font=new Font("Verdana", Font.ITALIC, 30);
		merkez.setFont(font);
		
	}
}
