/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasesSoporte;

/**
 *
 * @author junio
 */
public class HabilidadRequerida {

    private String descripcion;
    private RangoSemana rango;

    public HabilidadRequerida(String descripcion, RangoSemana rango) {
        this.descripcion = descripcion;
        this.rango = rango;
    }

    public HabilidadRequerida() {
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

}
