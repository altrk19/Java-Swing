package _03.flowLayout;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
//JFrame sýnýfýndan türetiyoruz ve ona ait özellikleri kullanabiliyoruz
public class FlwLayout extends JFrame{

	public FlwLayout() {
		//layout nesnesinin constructor'unda ilk parametre komponentlerin sola bitiþik dizilimde olacagýný
		//2. parametre yatayda 10pixel 3. parametre dikeyde 20pixel bosluk olacagýný belirtir.
		FlowLayout layout=new FlowLayout(FlowLayout.LEFT,10,20);
		
		//penceremizin sola bitiriþik dizilimde oldugunu belirtmek için setLayout() metoduna layout nesnesini atýyoruz
		setLayout(layout);
		add(new JLabel("isim"));
		add(new JTextField(35)); //alanýn 25 karaktere kadar alabileceðini belirtir
		add(new JLabel("soyisim"));
		add(new JTextField(35));
		add(new JLabel("yas"));
		add(new JTextField(3));
		
	}
}

//pencere sýnýfýna herhangi bir layout atanmaz ise flowlayout java tarafýndan otomatik olarak atanýr