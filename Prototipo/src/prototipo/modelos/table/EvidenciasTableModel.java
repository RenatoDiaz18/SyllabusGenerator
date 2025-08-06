package prototipo.modelos.table;

import ClasesSoporte.Evidencia;
import javax.swing.table.AbstractTableModel;
import java.util.List;

public class EvidenciasTableModel extends AbstractTableModel {

    private List<Evidencia> evidencias;
    private final String[] columnas = {"Evidencias de Aprendizaje", "Instrumento de Evaluacion"};

    public EvidenciasTableModel(List<Evidencia> evidencias) {
        this.evidencias = evidencias;
    }

    public List<Evidencia> getEvidencias() {
        return evidencias;
    }

    @Override
    public int getRowCount() {
        return evidencias.size();
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
        Evidencia evidencia = evidencias.get(rowIndex);
        return switch (columnIndex) {
            case 0 ->
                evidencia.getDescripcion();
            case 1 ->
                evidencia.getInstrumento() != null ? evidencia.getInstrumento() : "";
            default ->
                "";
        };
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    public void setEvidencias(List<Evidencia> evidencias) {
        this.evidencias = evidencias;
        fireTableDataChanged();
    }

    public void actualizarInstrumento(int rowIndex, String instrumento) {
        if (rowIndex >= 0 && rowIndex < evidencias.size()) {
            evidencias.get(rowIndex).setInstrumento(instrumento);
            fireTableRowsUpdated(rowIndex, rowIndex);
        }
    }

    public Evidencia getEvidenciaAt(int rowIndex) {
        return evidencias.get(rowIndex);
    }
}
