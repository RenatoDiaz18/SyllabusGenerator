/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.List;

/**
 *
 * @author junio
 */
public class FilaResumen {

    private int numeroSemana;
    private String conocimiento;
    private String actividad;
    private List<String> habilidades;
    private List<String> evidencias;

    public FilaResumen(int numeroSemana, String conocimiento, String actividad,
            List<String> habilidades, List<String> evidencias) {
        this.numeroSemana = numeroSemana;
        this.conocimiento = conocimiento;
        this.actividad = actividad;
        this.habilidades = habilidades;
        this.evidencias = evidencias;
    }

    public int getNumeroSemana() {
        return numeroSemana;
    }

    public String getConocimiento() {
        return conocimiento;
    }

    public String getActividad() {
        return actividad;
    }

    public List<String> getHabilidades() {
        return habilidades;
    }

    public List<String> getEvidencias() {
        return evidencias;
    }

}
