package prototipo.modelos.table;

import java.util.List;
import javax.swing.table.AbstractTableModel;

public class FacultadBuscarTableModel extends AbstractTableModel {

    private List<String> facultades;

    private final String[] columnas = {"Facultad"};

    public List<String> getFacultades() {
        return facultades;
    }

    public void setFacultades(List<String> facultades) {
        this.facultades = facultades;
        this.fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        int cantidad =  0;
        
        if(this.facultades != null){
            cantidad = this.facultades.size();
        }
        return cantidad;
    }

    @Override
    public int getColumnCount() {
        return this.columnas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if (this.facultades != null && columnIndex == 0) {
            return this.facultades.get(rowIndex);
        }
        return "";
    }

    @Override
    public String getColumnName(int column) {
        return this.columnas[column];
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return switch (columnIndex) {
            case 0 ->
                String.class;
            default ->
                Object.class;
        };
    }

}
