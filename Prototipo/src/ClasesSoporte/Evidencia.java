package ClasesSoporte;

public class Evidencia {

    private String descripcion;
    private RangoSemana rango;
    private String instrumento;

    public Evidencia(String descripcion, RangoSemana rango) {
        this.descripcion = descripcion;
        this.rango = rango;
    }

    public Evidencia() {
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public RangoSemana getRango() {
        return rango;
    }

    public void setRango(RangoSemana rango) {
        this.rango = rango;
    }

    public String getInstrumento() {
        return instrumento;
    }

    public void setInstrumento(String instrumento) {
        this.instrumento = instrumento;
    }
}
