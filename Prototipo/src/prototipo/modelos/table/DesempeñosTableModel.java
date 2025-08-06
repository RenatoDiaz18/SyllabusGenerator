package prototipo.modelos.table;

import Clases.Desempeño;
import java.util.List;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class DesempeñosTableModel extends AbstractTableModel {

    private List<Desempeño> desempeños;

    private final String[] columnas = {"N°", "Descripción"};

    public List<Desempeño> getDesempeños() {
        return desempeños;
    }

    public void setDesempeños(List<Desempeño> desempeños) {
        this.desempeños = desempeños;
        this.fireTableDataChanged();
    }

    public void ajustarCantidadFilas(int cantidad) {
        if (desempeños == null) {
            desempeños = new ArrayList<>();
        }

        int actual = desempeños.size();

        if (cantidad > actual) {
            for (int i = actual; i < cantidad; i++) {
                desempeños.add(new Desempeño("D" + (i + 1), ""));
            }
        } else if (cantidad < actual) {
            desempeños = desempeños.subList(0, cantidad);
        }

        // Asegurarse que los códigos D1, D2,... se mantengan bien
        for (int i = 0; i < desempeños.size(); i++) {
            desempeños.get(i).setDesempeño("D" + (i + 1));
        }

        fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        return desempeños != null ? desempeños.size() : 0;
    }

    @Override
    public int getColumnCount() {
        return columnas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if (desempeños == null || rowIndex >= desempeños.size()) {
            return "";
        }

        Desempeño d = desempeños.get(rowIndex);
        return switch (columnIndex) {
            case 0 ->
                d.getDesempeño(); // D1, D2...
            case 1 ->
                d.getDescripcion();
            default ->
                "";
        };
    }

    @Override
    public String getColumnName(int column) {
        return columnas[column];
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return String.class;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return columnIndex == 1; // Solo editable "Descripción"
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        if (desempeños == null || rowIndex >= desempeños.size()) {
            return;
        }

        Desempeño d = desempeños.get(rowIndex);
        if (columnIndex == 1) {
            d.setDescripcion(aValue.toString());
        }

        fireTableCellUpdated(rowIndex, columnIndex);
    }
}
