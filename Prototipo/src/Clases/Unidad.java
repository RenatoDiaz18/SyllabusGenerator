package Clases;

import ClasesSoporte.Evidencia;
import ClasesSoporte.HabilidadRequerida;
import java.util.List;

public class Unidad {

    private int numeroUnidad;
    private String nombreUnidad;
    private String desempeño;
    private List<Semana> semanas;
    private List<HabilidadRequerida> habilidades;
    private List<Evidencia> evidencias;
    private List<FilaResumen> resumen;

    public Unidad(int numeroUnidad, String nombreUnidad, String desempeño,
            List<Semana> semanas, List<HabilidadRequerida> habilidades,
            List<Evidencia> evidencias, List<FilaResumen> resumen) {
        this.numeroUnidad = numeroUnidad;
        this.nombreUnidad = nombreUnidad;
        this.desempeño = desempeño;
        this.semanas = semanas;
        this.habilidades = habilidades;
        this.evidencias = evidencias;
        this.resumen = resumen;
    }

    // Getters y Setters
    public int getNumeroUnidad() {
        return numeroUnidad;
    }

    public void setNumeroUnidad(int numeroUnidad) {
        this.numeroUnidad = numeroUnidad;
    }

    public String getNombreUnidad() {
        return nombreUnidad;
    }

    public void setNombreUnidad(String nombreUnidad) {
        this.nombreUnidad = nombreUnidad;
    }

    public String getDesempeño() {
        return desempeño;
    }

    public void setDesempeño(String desempeño) {
        this.desempeño = desempeño;
    }

    public List<Semana> getSemanas() {
        return semanas;
    }

    public void setSemanas(List<Semana> semanas) {
        this.semanas = semanas;
    }

    public List<HabilidadRequerida> getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(List<HabilidadRequerida> habilidades) {
        this.habilidades = habilidades;
    }

    public List<Evidencia> getEvidencias() {
        return evidencias;
    }

    public void setEvidencias(List<Evidencia> evidencias) {
        this.evidencias = evidencias;
    }

    public List<FilaResumen> getResumen() {
        return resumen;
    }

    public void setResumen(List<FilaResumen> resumen) {
        this.resumen = resumen;
    }
}
