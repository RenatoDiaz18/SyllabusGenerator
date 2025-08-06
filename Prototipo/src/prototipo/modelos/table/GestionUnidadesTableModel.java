package prototipo.modelos.table;

import Clases.Desempeño;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Rodrigo Aguirre
 */
public class GestionUnidadesTableModel extends AbstractTableModel {

    private final List<String> nombres;  // Nombre de unidad (editable)
    private final List<Desempeño> desempeños;  // Desempeños asociados
    private final boolean[] fueAgregado;

    public GestionUnidadesTableModel(List<Desempeño> desempeños) {
        this.desempeños = desempeños;
        this.nombres = new ArrayList<>();
        this.fueAgregado = new boolean[desempeños.size()];
        for (int i = 0; i < desempeños.size(); i++) {
            nombres.add("");  // Inicializas los nombres vacíos
        }
    }

    @Override
    public int getRowCount() {
        return desempeños.size();
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return rowIndex + 1;  // N° Unidad
            case 1:
                return desempeños.get(rowIndex).getDescripcion();  // Nombre del desempeño
            case 2:
                return nombres.get(rowIndex);  // Nombre de la unidad (editable)
            default:
                return null;
        }
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return columnIndex == 2;  // Solo la columna del nombre de la unidad es editable
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        if (columnIndex == 2) {
            nombres.set(rowIndex, aValue.toString());
            fireTableCellUpdated(rowIndex, columnIndex);
        }
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public String getColumnName(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return "N°U";
            case 1:
                return "Desempeño";
            case 2:
                return "Nombre Unidad";
            default:
                return "";
        }
    }

    public List<String> getNombresUnidades() {
        return nombres;
    }

    public Desempeño getDesempeño(int fila) {
        return desempeños.get(fila);
    }

    public void setNombreUnidad(int fila, String nombre) {
        nombres.set(fila, nombre);
        fireTableCellUpdated(fila, 2);
    }

    public String getNombreUnidad(int fila) {
        return nombres.get(fila);
    }

    public boolean yaFueAgregado(int fila) {
        return fueAgregado[fila];
    }

    public void marcarComoAgregado(int fila) {
        fueAgregado[fila] = true;
    }

}
