/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.List;
import prototipo.modelos.table.FilaSistemaEvaluacion;

/**
 *
 * @author junio
 */
public class Silabo {

    private String curso;
    private String docente;
    private String facultad;
    private String escuelaProfesional;
    private String modalidad;
    private int ciclo;
    private String codigoCurso;
    private int creditos;
    private int horasSemanales;
    private int horasTeoricas;
    private int horasPracticas;
    private String duracion;
    private String inicioDuracion;
    private String finalDuracion;
    private String sumilla;
    private String competenciasProf;
    private String capacidadCurso;
    private List<Desempeño> desempeños;
    private List<Unidad> unidades;
    
    //Sistema de evaluación
    private List<FilaSistemaEvaluacion> sistemaEvaluacion;
    private String promedioSistemaEvaluacion;

    public Silabo() {
    }

    public Silabo(String curso, String docente, String facultad, String escuelaProfesional, String modalidad, int ciclo, String codigoCurso, int creditos, int horasSemanales, int horasTeoricas, int horasPracticas, String duracion, String inicioDuracion, String finalDuracion, String sumilla, String competenciasProf, String capacidadCurso, List<Desempeño> desempeños, List<Unidad> unidades) {
        this.curso = curso;
        this.docente = docente;
        this.facultad = facultad;
        this.escuelaProfesional = escuelaProfesional;
        this.modalidad = modalidad;
        this.ciclo = ciclo;
        this.codigoCurso = codigoCurso;
        this.creditos = creditos;
        this.horasSemanales = horasSemanales;
        this.horasTeoricas = horasTeoricas;
        this.horasPracticas = horasPracticas;
        this.duracion = duracion;
        this.inicioDuracion = inicioDuracion;
        this.finalDuracion = finalDuracion;
        this.sumilla = sumilla;
        this.competenciasProf = competenciasProf;
        this.capacidadCurso = capacidadCurso;
        this.desempeños = desempeños;
        this.unidades = unidades;
    }

    public String getCurso() {
        return curso;
    }

    public String getDocente() {
        return docente;
    }

    public String getFacultad() {
        return facultad;
    }

    public String getEscuelaProfesional() {
        return escuelaProfesional;
    }

    public String getCompetenciasProf() {
        return competenciasProf;
    }

    public void setCompetenciasProf(String competenciasProf) {
        this.competenciasProf = competenciasProf;
    }

    public String getCapacidadCurso() {
        return capacidadCurso;
    }

    public void setCapacidadCurso(String capacidadCurso) {
        this.capacidadCurso = capacidadCurso;
    }

    public String getModalidad() {
        return modalidad;
    }

    public int getCiclo() {
        return ciclo;
    }

    public String getCodigoCurso() {
        return codigoCurso;
    }

    public int getCreditos() {
        return creditos;
    }

    public int getHorasSemanales() {
        return horasSemanales;
    }

    public int getHorasTeoricas() {
        return horasTeoricas;
    }

    public void setHorasTeoricas(int horasTeoricas) {
        this.horasTeoricas = horasTeoricas;
    }

    public int getHorasPracticas() {
        return horasPracticas;
    }

    public void setHorasPracticas(int horasPracticas) {
        this.horasPracticas = horasPracticas;
    }

    public String getInicioDuracion() {
        return inicioDuracion;
    }

    public void setInicioDuracion(String inicioDuracion) {
        this.inicioDuracion = inicioDuracion;
    }

    public String getFinalDuracion() {
        return finalDuracion;
    }

    public void setFinalDuracion(String finalDuracion) {
        this.finalDuracion = finalDuracion;
    }

    public List<Desempeño> getDesempeños() {
        return desempeños;
    }

    public void setDesempeños(List<Desempeño> desempeños) {
        this.desempeños = desempeños;
    }

    public String getDuracion() {
        return duracion;
    }

    public String getSumilla() {
        return sumilla;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setDocente(String docente) {
        this.docente = docente;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public void setEscuelaProfesional(String escuelaProfesional) {
        this.escuelaProfesional = escuelaProfesional;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }

    public void setCiclo(int ciclo) {
        this.ciclo = ciclo;
    }

    public void setCodigoCurso(String codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public void setHorasSemanales(int horasSemanales) {
        this.horasSemanales = horasSemanales;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public void setSumilla(String sumilla) {
        this.sumilla = sumilla;
    }

    public List<Unidad> getUnidades() {
        return unidades;
    }

    public void setUnidades(List<Unidad> unidades) {
        this.unidades = unidades;
    }

    public List<FilaSistemaEvaluacion> getSistemaEvaluacion() {
        return sistemaEvaluacion;
    }

    public void setSistemaEvaluacion(List<FilaSistemaEvaluacion> sistemaEvaluacion) {
        this.sistemaEvaluacion = sistemaEvaluacion;
    }

    public String getPromedioSistemaEvaluacion() {
        return promedioSistemaEvaluacion;
    }

    public void setPromedioSistemaEvaluacion(String promedioSistemaEvaluacion) {
        this.promedioSistemaEvaluacion = promedioSistemaEvaluacion;
    }

    
}
