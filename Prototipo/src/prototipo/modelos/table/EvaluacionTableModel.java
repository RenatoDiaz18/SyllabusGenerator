package prototipo.modelos.table;

import Clases.Desempeño;
import javax.swing.table.AbstractTableModel;
import java.util.List;

public class EvaluacionTableModel extends AbstractTableModel {

    private final String[] columnas = {"Unidad", "Desempeño"};
    private final List<Desempeño> desempeños;

    public EvaluacionTableModel(List<Desempeño> desempeños) {
        this.desempeños = desempeños;
    }

    public List<Desempeño> getDesempeños() {
        return desempeños;
    }

    @Override
    public int getRowCount() {
        return desempeños.size();
    }

    @Override
    public int getColumnCount() {
        return columnas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return rowIndex + 1;
            case 1:
                return desempeños.get(rowIndex).getDescripcion();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return columnas[column];
    }

    public Desempeño getDesempeño(int fila) {
        return desempeños.get(fila);
    }

}
