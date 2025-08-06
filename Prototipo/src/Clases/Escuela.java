/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Rodrigo Aguirre
 */
public class Escuela {

    private String[][] escuelas = {
        {"Agronomía"},
        {"Biología"},
        {"Contabilidad", "Economia", "Administración", "Comercio y Negocios Internacionales"},
        {"Fisica", "Matematica", "Estadistica", "Ingenieria de Computacion e Informatica",
            "Ingeniería Electronica"},
        {"Educacion", "Sociologia", "Ciencia de la Comunicacion", "Psiologia", "Arte",
            "Arqueologia"},
        {"Derecho", "Ciencias Políticas"},
        {"Enfermeria"},
        {"Ingeniería Agricola"},
        {"Ingeniería Civil", "Ingenieria de Sistemas", "Arquitectura"},
        {"Ingeniería Mecanica y Electrica"},
        {"Ingeniería Química", "Ingeniería en Industrias Alimentarias"},
        {"Ingeniería Zootecnia"},
        {"Medicina Humana"},
        {"Medicina Veterinaria"},};

    public String[] getEscuelas(int indiceFacultad) {
        if (indiceFacultad >= 0 && indiceFacultad < this.escuelas.length) {
            return this.escuelas[indiceFacultad];
        }
        return new String[0];
    }

    public void setEscuelas(String[][] escuelas) {
        this.escuelas = escuelas;
    }

}
