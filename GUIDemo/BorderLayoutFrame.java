import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JButton;

public class BorderLayoutFrame extends PrincipalFrame {

    public BorderLayoutFrame() {
        super("Demo BorderLayout");

        this.setLayout(new BorderLayout(50, 100));

        initialize();
    }

    private void initialize() {
        JButton botao;

        botao = new JButton("Botão 1");
        add(botao, BorderLayout.NORTH);

//        botao = new JButton("Botão 2");
//        add(botao, BorderLayout.SOUTH);

        botao = new JButton("Botão 3");
//		botao.setPreferredSize(new Dimension(200, 100));
        add(botao, BorderLayout.EAST);

//        botao = new JButton("Botão 4");
//        add(botao, BorderLayout.WEST);

        botao = new JButton("Botão 5");
        add(botao, BorderLayout.CENTER);
    }

} // fim da classe BorderLayoutFrame
