package prototipo.modelos.table;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class SistemasEvaluacionTableModel extends AbstractTableModel {

    private final List<FilaSistemaEvaluacion> filas;
    private final String[] columnas = {"Evidencias", "Siglas", "Peso", "Cronograma"};

    public SistemasEvaluacionTableModel() {
        this.filas = new ArrayList<>();
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
        FilaSistemaEvaluacion fila = filas.get(rowIndex);
        return switch (columnIndex) {
            case 0 ->
                fila.getEvidencia();
            case 1 ->
                fila.getSigla();
            case 2 ->
                (int) (fila.getPeso() * 100) + "%";
            case 3 ->
                fila.getCronograma();
            default ->
                "";
        };
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    public void agregarFila(FilaSistemaEvaluacion fila) {
        this.filas.add(fila);
        fireTableRowsInserted(filas.size() - 1, filas.size() - 1);
    }

    public void removeRow(int filaSeleccionada) {
        if (filaSeleccionada >= 0 && filaSeleccionada < filas.size()) {
            filas.remove(filaSeleccionada);
            fireTableRowsDeleted(filaSeleccionada, filaSeleccionada);
        }
    }

    public FilaSistemaEvaluacion getFila(int fila) {
        return filas.get(fila);
    }

    public void setFila(int fila, FilaSistemaEvaluacion nuevaFila) {
        if (fila >= 0 && fila < filas.size()) {
            filas.set(fila, nuevaFila);
            fireTableRowsUpdated(fila, fila);
        }

    }

    public void eliminarFila(int filaSeleccionada) {
        removeRow(filaSeleccionada);
    }

    public List<FilaSistemaEvaluacion> getFilas() {
        return filas;
    }

}
