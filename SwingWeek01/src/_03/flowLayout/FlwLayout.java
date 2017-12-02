package _03.flowLayout;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
//JFrame s�n�f�ndan t�retiyoruz ve ona ait �zellikleri kullanabiliyoruz
public class FlwLayout extends JFrame{

	public FlwLayout() {
		//layout nesnesinin constructor'unda ilk parametre komponentlerin sola biti�ik dizilimde olacag�n�
		//2. parametre yatayda 10pixel 3. parametre dikeyde 20pixel bosluk olacag�n� belirtir.
		FlowLayout layout=new FlowLayout(FlowLayout.LEFT,10,20);
		
		//penceremizin sola bitiri�ik dizilimde oldugunu belirtmek i�in setLayout() metoduna layout nesnesini at�yoruz
		setLayout(layout);
		add(new JLabel("isim"));
		add(new JTextField(35)); //alan�n 25 karaktere kadar alabilece�ini belirtir
		add(new JLabel("soyisim"));
		add(new JTextField(35));
		add(new JLabel("yas"));
		add(new JTextField(3));
		
	}
}

//pencere s�n�f�na herhangi bir layout atanmaz ise flowlayout java taraf�ndan otomatik olarak atan�r