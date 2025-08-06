package Clases;

import java.util.List;

public class Curso {

    private String codigo;
    private String nombre;
    private int creditos;
    private String prerequisito;
    private String hPracticas;
    private String hTeoricas;
    private String sumilla;
    private String competencia;
    private String capacidad;
    private List<Desempeño> desempeño;

    public Curso(String codigo, String nombre, int creditos,String prerequisito,String hPracticas, String hTeoricas, String sumilla, String competencia, String capacidad, List<Desempeño> desempeño) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.creditos = creditos;
        this.prerequisito = prerequisito;
        this.hPracticas = hPracticas;
        this.hTeoricas = hTeoricas;
        this.sumilla = sumilla;
        this.competencia = competencia;
        this.capacidad = capacidad;
        this.desempeño = desempeño;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getSumilla() {
        return sumilla;
    }

    public String gethPracticas() {
        return hPracticas;
    }

    public String gethTeoricas() {
        return hTeoricas;
    }

    public int getCreditos() {
        return creditos;
    }

    public String getCompetencia() {
        return competencia;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public List<Desempeño> getDesempeño() {
        return desempeño;
    }

    public String getPrerequisito() {
        return prerequisito;
    }

    @Override
    public String toString() {
        return nombre;
    }

}
