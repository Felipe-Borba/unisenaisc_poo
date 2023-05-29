import java.awt.FlowLayout;

import javax.swing.JButton;

public class FlowLayoutFrame extends PrincipalFrame {

	public FlowLayoutFrame() {
		super("Demo FlowLayout");

		this.setLayout(new FlowLayout());

		initialize();
	}

	private void initialize() {
		final int NUM_BOTOES = 10;
		
		for (int i = 1; i <= NUM_BOTOES; i++) {
			add(new JButton("Botão " + i));
		}
	}

} // fim da classe FlowLayoutFrame
