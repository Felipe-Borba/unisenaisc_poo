package view;

import javax.swing.*;
import java.awt.*;

public class TarefaListPanel extends JPanel {
    private final JButton novaTarefaBtn = new JButton("Criar Tarefa");
    private final JButton editarTarefaBtn = new JButton("Editar Tarefa");
    private final JButton removerTarefaBtn = new JButton("Remover Tarefa");

    private JTable tabela;

    public TarefaListPanel() {
        setLayout(new BorderLayout(10, 10));

        criarComandosPanel();
        criarTabelaPanel();
    }

    private void criarComandosPanel() {
        JPanel panel = new JPanel();
        FlowLayout layout = (FlowLayout) panel.getLayout();
        layout.setAlignment(FlowLayout.RIGHT);

        panel.add(novaTarefaBtn);
        panel.add(editarTarefaBtn);
        panel.add(removerTarefaBtn);

        add(panel, BorderLayout.NORTH);
    }

    private void criarTabelaPanel() {
        JPanel panel = new JPanel();

        tabela = new JTable();
        tabela.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        panel.add(tabela);

        JScrollPane scrollPane = new JScrollPane(tabela);
        panel.add(scrollPane);

        add(panel, BorderLayout.CENTER);
    }
}
