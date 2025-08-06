/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasesSoporte;

/**
 *
 * @author junio
 */
public class RangoSemana {

    int semanaInicio;
    int semanaFin;

    public RangoSemana() {
    }

    public RangoSemana(int semanaInicio, int semanaFin) {
        this.semanaInicio = semanaInicio;
        this.semanaFin = semanaFin;
    }

    public int getSemanaInicio() {
        return semanaInicio;
    }

    public void setSemanaInicio(int semanaInicio) {
        this.semanaInicio = semanaInicio;
    }

    public int getSemanaFin() {
        return semanaFin;
    }

    public void setSemanaFin(int semanaFin) {
        this.semanaFin = semanaFin;
    }

    public boolean contieneSemana(int semana) {
        return semana >= semanaInicio && semana <= semanaFin;
    }

}
