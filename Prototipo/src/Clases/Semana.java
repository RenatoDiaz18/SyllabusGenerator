package Clases;

public class Semana {

    private int numeroSemana;

    private String conocimientos;
    private String actividades;

    public Semana() {
    }

    public Semana(int numeroSemana, String conocimientos, String actividades) {
        this.numeroSemana = numeroSemana;

        this.conocimientos = conocimientos;
        this.actividades = actividades;
    }

    public int getNumeroSemana() {
        return numeroSemana;
    }

    public String getConocimientos() {
        return conocimientos;
    }

    public String getActividades() {
        return actividades;
    }

    public void setNumeroSemana(int numeroSemana) {
        this.numeroSemana = numeroSemana;
    }

    public void setConocimientos(String conocimientos) {
        this.conocimientos = conocimientos;
    }

    public void setActividades(String actividades) {
        this.actividades = actividades;
    }

}
