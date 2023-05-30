package view;

import javax.swing.table.AbstractTableModel;

public class TarefaTableModel extends AbstractTableModel {
    // TODO posso injetar o TarefaStorage aqui, não fica mais fácil? resp posso mais talvez não seja a melhor forma
    private String[] colunas = new String[]{"Id", "Nome", "Descrição"};

    @Override
    public int getRowCount() {
        return 0;
    }

    @Override
    public int getColumnCount() {
        return 0;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return null;
    }

    @Override
    public String getColumnName(int column) {
        return (column >= 0 && column <= colunas.length) ? colunas[column] : null;
    }
}
