package prototipo.modelos.table;

import Clases.FilaResumen;
import javax.swing.table.AbstractTableModel;
import java.util.List;

public class ResumenUnidadTableModel extends AbstractTableModel {

    private final List<FilaResumen> filas;

    private final String[] columnas = {"Semana", "Conocimiento", "Actividad", "Habilidades", "Evidencias"};

    public ResumenUnidadTableModel(List<FilaResumen> filas) {
        this.filas = filas;
    }

    @Override
    public int getRowCount() {
        return filas.size();
    }

    @Override
    public int getColumnCount() {
        return columnas.length;
    }

    @Override
    public String getColumnName(int column) {
        return columnas[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        FilaResumen fila = filas.get(rowIndex);
        return switch (columnIndex) {
            case 0 ->
                fila.getNumeroSemana();
            case 1 ->
                fila.getConocimiento();
            case 2 ->
                fila.getActividad();
            case 3 ->
                String.join(", ", fila.getHabilidades());
            case 4 ->
                String.join(", ", fila.getEvidencias());
            default ->
                "";
        };
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;

    }

    public void setFilas(List<FilaResumen> nuevasFilas) {
        this.filas.clear();              // Limpiar la lista interna
        this.filas.addAll(nuevasFilas);  // Copiar los nuevos datos
        fireTableDataChanged();          // Notificar a la tabla que los datos cambiaron
    }
}
