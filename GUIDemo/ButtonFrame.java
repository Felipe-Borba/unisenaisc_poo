import javax.swing.JButton;

public class ButtonFrame extends PrincipalFrame {
	
	public ButtonFrame() {
		super("Demo ButtonFrame");
		
		initialize();
	}
	
	private void initialize() {
		JButton botao = new JButton("Botão 1");
		add(botao);
	}
	
} // fim da classe ButtonFrame
