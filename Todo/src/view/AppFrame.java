package view;

import javax.swing.*;

public class AppFrame extends JFrame {
    public static final String TITULO = "Todo App";

    public AppFrame() {
        super(TITULO);

        add(new TarefaListPanel());

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void mostrar() {
        setVisible(true);
    }
}
