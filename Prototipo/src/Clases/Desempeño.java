package Clases;

public class Desempeño {

    private String desempeño; // 1,2,3.....
    private String descripcion;

    public Desempeño() {
    }

    public Desempeño(String desempeño, String descripcion) {
        this.desempeño = desempeño;
        this.descripcion = descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getDesempeño() {
        return desempeño;
    }

    public void setDesempeño(String desempeño) {
        this.desempeño = desempeño;
    }

}
