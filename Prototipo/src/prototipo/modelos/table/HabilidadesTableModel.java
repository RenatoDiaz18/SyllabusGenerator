package prototipo.modelos.table;

import ClasesSoporte.HabilidadRequerida;
import javax.swing.table.AbstractTableModel;
import java.util.List;

public class HabilidadesTableModel extends AbstractTableModel {

    private List<HabilidadRequerida> habilidades;
    private String[] columnas = {"Habilidad", "Inicio", "Final"};

    public HabilidadesTableModel(List<HabilidadRequerida> habilidades) {
        this.habilidades = habilidades;
    }

    public List<HabilidadRequerida> getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(List<HabilidadRequerida> habilidades) {
        this.habilidades = habilidades;
        fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        return habilidades.size();
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
        HabilidadRequerida habilidad = habilidades.get(rowIndex);
        return switch (columnIndex) {
            case 0 ->
                habilidad.getDescripcion();
            case 1 ->
                habilidad.getRango().getSemanaInicio();
            case 2 ->
                habilidad.getRango().getSemanaFin();
            default ->
                "";
        };
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false; // No editable por ahora
    }

    public void agregarHabilidad(HabilidadRequerida habilidad) {
        habilidades.add(habilidad);
        fireTableDataChanged();
    }

    public HabilidadRequerida getHabilidad(int index) {
        if (index >= 0 && index < habilidades.size()) {
            return habilidades.get(index);
        }
        return null;
    }

    public void modificarHabilidad(int index, HabilidadRequerida modificada) {
        habilidades.set(index, modificada);
        fireTableRowsUpdated(index, index);
    }
}
