package _08.font;

import javax.swing.JFrame;

public class FontMain {

	public static void main(String[] args) {
		
		FontBelirleme pencere=new FontBelirleme();
		pencere.setSize(400,300);
		pencere.setTitle("Pencere Renk");
		pencere.setLocationRelativeTo(null);
		pencere.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pencere.setVisible(true);
	}

}
