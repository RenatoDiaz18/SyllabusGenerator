package prototipo.modelos.table;

import ClasesSoporte.Evidencia;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class Evidencias2TableModel extends AbstractTableModel {

    private List<Evidencia> evidencias;
    private String[] columnas = {"Evidencia", "Inicio", "Final"};

    public Evidencias2TableModel(List<Evidencia> evidencias) {
        this.evidencias = evidencias;
    }

    public List<Evidencia> getEvidencias() {
        return evidencias;
    }

    public void setEvidencias(List<Evidencia> evidencias) {
        this.evidencias = evidencias;
        fireTableDataChanged();
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
                evidencia.getRango().getSemanaInicio();
            case 2 ->
                evidencia.getRango().getSemanaFin();
            default ->
                "";
        };
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    public void agregarEvidencia(Evidencia evidencia) {
        evidencias.add(evidencia);
        fireTableDataChanged();
    }

    public Evidencia getEvidencia(int index) {
        if (index >= 0 && index < evidencias.size()) {
            return evidencias.get(index);
        }
        return null;
    }

    public void modificarEvidencia(int index, Evidencia modificada) {
        evidencias.set(index, modificada);
        fireTableRowsUpdated(index, index);
    }
}
