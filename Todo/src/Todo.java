import view.AppFrame;
import view.TarefaListPanel;

import javax.swing.*;

public class Todo {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                criarMostrarGUI();
            }
        });
    }

    private static void criarMostrarGUI() {
        AppFrame frame = new AppFrame();

        frame.mostrar();
    }
}
