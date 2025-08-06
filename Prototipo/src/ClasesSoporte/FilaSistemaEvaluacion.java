package ClasesSoporte;

public class FilaSistemaEvaluacion {
    private String evidencia;
    private String sigla;
    private double peso;
    private String cronograma;

    public FilaSistemaEvaluacion(String evidencia, String sigla, double peso, String cronograma) {
        this.evidencia = evidencia;
        this.sigla = sigla;
        this.peso = peso;
        this.cronograma = cronograma;
    }

    public String getEvidencia() {
        return evidencia;
    }

    public void setEvidencia(String evidencia) {
        this.evidencia = evidencia;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getCronograma() {
        return cronograma;
    }

    public void setCronograma(String cronograma) {
        this.cronograma = cronograma;
    }
}