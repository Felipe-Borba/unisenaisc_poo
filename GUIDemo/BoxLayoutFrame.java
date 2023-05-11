import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;

public class BoxLayoutFrame extends PrincipalFrame {

	public BoxLayoutFrame() {
		super("Demo BoxLayout");

		setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));

		initialize();
	}

	private void initialize() {
		Box box;

		final int NUM_BOTOES = 5;

		// horizontal
//		box = Box.createHorizontalBox();

		// vertical
		box = Box.createVerticalBox();

		for (int i = 1; i <= NUM_BOTOES; i++) {
			// componente de cola
//			box.add(Box.createVerticalGlue());

			// componente de estrutura
//			box.add(Box.createVerticalStrut(25));
			
			// componente de área rígida
			box.add(Box.createRigidArea(new Dimension(20, 5)));

			box.add(new JButton("Botão " + i));
		}

		add(box);
	}

} // fim da classe BoxLayoutFrame
