package Clases;

import java.util.*;

public class Curso {

    private String codigo;
    private String nombre;
    private int creditos;
    private List<String> prerrequisitos;
    private int hPracticas;
    private int hTeoricas;
    private String sumilla;

    public Curso(String codigo, String nombre, int creditos,List<String> prerrequisitos,Integer hPracticas, Integer hTeoricas, String sumilla) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.creditos = creditos;
        this.prerrequisitos = new ArrayList<>();
        this.prerrequisitos.addAll(prerrequisitos);
        this.hPracticas = hPracticas;
        this.hTeoricas = hTeoricas;
        this.sumilla = sumilla;
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

    public int gethPracticas() {
        return hPracticas;
    }

    public int gethTeoricas() {
        return hTeoricas;
    }

    public int getCreditos() {
        return creditos;
    }

    public List<String> getPrerrequisitos() {
        return prerrequisitos;
    }

    @Override
    public String toString() {
        return nombre;
    }

}
