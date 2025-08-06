package prototipo.modelos.table;

import Clases.Semana;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import java.util.List;

public class SemanaTableModel extends AbstractTableModel {

    private List<Semana> semanas;
    private final String[] columnas = {"Semana", "Conocimientos", "Actividades"};

    public SemanaTableModel() {
        this.semanas = new ArrayList<>();
    }

    public List<Semana> getSemanas() {
        return semanas;
    }

    public void setSemanas(List<Semana> semanas) {
        this.semanas = semanas;
        fireTableDataChanged();
    }

    public void ajustarCantidadFilas(int cantidad) {
        int actual = semanas.size();

        if (cantidad > actual) {
            for (int i = actual; i < cantidad; i++) {
                semanas.add(new Semana(i + 1, "", ""));
            }
        } else if (cantidad < actual) {
            semanas = semanas.subList(0, cantidad);
        }

        // Actualizar los números de semana
        for (int i = 0; i < semanas.size(); i++) {
            semanas.get(i).setNumeroSemana(i + 1);
        }

        fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        return semanas.size();
    }

    @Override
    public int getColumnCount() {
        return columnas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Semana s = semanas.get(rowIndex);
        return switch (columnIndex) {
            case 0 ->
                s.getNumeroSemana();
            case 1 ->
                s.getConocimientos();
            case 2 ->
                s.getActividades();
            default ->
                "";
        };
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        Semana s = semanas.get(rowIndex);
        switch (columnIndex) {
            case 1 ->
                s.setConocimientos(aValue.toString());
            case 2 ->
                s.setActividades(aValue.toString());
        }
        fireTableCellUpdated(rowIndex, columnIndex);
    }

    @Override
    public String getColumnName(int column) {
        return columnas[column];
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        // Solo las columnas de fecha, conocimientos, actividades y evidencias son editables
        return columnIndex != 0;
    }

    public String getConocimiento(int fila) {
        return semanas.get(fila).getConocimientos();
    }

    public String getActividad(int fila) {
        return semanas.get(fila).getActividades();
    }

    public void agregarSemana(Semana semana) {
        this.semanas.add(semana);
        fireTableRowsInserted(semanas.size() - 1, semanas.size() - 1);
    }

    public Semana getSemana(int fila) {
        return semanas.get(fila);
    }

    @Override
    public void fireTableRowsUpdated(int filaInicio, int filaFin) {
        super.fireTableRowsUpdated(filaInicio, filaFin);
    }
}
