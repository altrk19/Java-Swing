package _03.flowLayout;

import javax.swing.JFrame;

public class FlowMain {

	public static void main(String[] args) {
		FlwLayout pencere=new FlwLayout();
		pencere.setSize(440,300);
		pencere.setTitle("Pencere");
		pencere.setLocationRelativeTo(null);
		pencere.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pencere.setVisible(true);

	}

}
