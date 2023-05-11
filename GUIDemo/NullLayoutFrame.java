import javax.swing.JButton;

public class NullLayoutFrame extends PrincipalFrame {

	public NullLayoutFrame() {
		super("Demo Null Layout");

		this.setLayout(null);

		initialize();
	}

	private void initialize() {
		JButton botao;

		botao = new JButton("Botão 1");
		botao.setBounds(10, 20, 200, 30);
		add(botao);

		botao = new JButton("Botão 2");
		botao.setBounds(150, 180, botao.getPreferredSize().width, botao.getPreferredSize().height);
		add(botao);
	}

} // fim da classe NullLayoutFrame
