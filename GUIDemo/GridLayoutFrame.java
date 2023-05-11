import java.awt.GridLayout;

import javax.swing.JButton;

public class GridLayoutFrame extends PrincipalFrame {

	public GridLayoutFrame() {
		super("Demo GridLayout");

		this.setLayout(new GridLayout(2, 3, 5, 5));

		initialize();
	}

	private void initialize() {
		final int NUM_BOTOES = 5;

		for (int i = 1; i <= NUM_BOTOES; i++) {
			add(new JButton("Botão " + i));
		}
	}

} // fim da classe GridLayoutFrame
