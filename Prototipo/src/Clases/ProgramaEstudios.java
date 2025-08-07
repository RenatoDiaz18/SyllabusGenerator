package Clases;

import java.util.ArrayList;
import java.util.List;

public class ProgramaEstudios {

    private String nombrePrograma;
    private String nombreEscuela;
    private List<List<Curso>> cursosCiclo;

    public ProgramaEstudios(String nombreEscuela, String nombrePrograma) {
        this.nombrePrograma = nombrePrograma;
        this.nombreEscuela = nombreEscuela;
        this.cursosCiclo = new ArrayList<>();

        for (int i = 0; i < 10; i++) { // 10 ciclos
            cursosCiclo.add(new ArrayList<>());
        }
    }

    public String getNombrePrograma() {
        return nombrePrograma;
    }

    public List<List<Curso>> getCursosCiclo() {
        return cursosCiclo;
    }

    public void setCursosCiclo(List<List<Curso>> cursosCiclo) {
        this.cursosCiclo = cursosCiclo;
    }

    
    public String getNombreEscuela() {
        return nombreEscuela;
    }

    public void agregarCursoACiclo(int ciclo, Curso curso) {
        if (ciclo >= 1 && ciclo <= 10) {
            cursosCiclo.get(ciclo - 1).add(curso);
        }
    }

    public List<Curso> getCursosDelCiclo(int ciclo) {
        if (ciclo >= 1 && ciclo <= 10) {
            return cursosCiclo.get(ciclo - 1);
        }
        return new ArrayList<>();
    }
}
