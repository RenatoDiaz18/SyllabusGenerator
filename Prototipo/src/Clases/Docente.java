/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;
/**
 *
 * @author admin
 */
public class Docente {

    private String nombres;
    private String apellidos;
    private String genero;
    private int facultad;
    private int escuela;
    private String gradoAcademico;
    private String correo;
    private String contraseña;
    private int preguntaSeguridad;
    private String respuestaSeguridad;
    // Lista silabos

    public Docente(String nombres, String apellidos, String genero, Integer facultad, Integer escuela, String gradoAcademico, String correo, String contraseña, int preguntaSeguridad, String respuestaSeguridad) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.genero = genero.substring(0, 1);
        this.facultad = facultad;
        this.escuela = escuela;
        this.gradoAcademico = gradoAcademico;
        this.correo = correo;
        this.contraseña = contraseña;
        this.preguntaSeguridad = preguntaSeguridad;
        this.respuestaSeguridad = respuestaSeguridad;
    }

    public Docente() {
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getGenero() {
        if(genero.equalsIgnoreCase("F")){
            return "Femenino";
        }if(genero.equalsIgnoreCase("M")){
            return "Masculino";
        }
        return "";
    }

    public void setGenero(String genero) {
        this.genero = genero.substring(0, 1);
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombreFacultad() {
        Facultades fac = new Facultades();
        String[] arregloFacultades = fac.getFacultades();
        return arregloFacultades[this.facultad];
    }
    
    public int getIndexFacultad() {
        return facultad;
    }
    
    public void setIndexFacultad(Integer facultad) {
        this.facultad = facultad;
    }

    public String getNombreEscuela() {
        Escuela esc = new Escuela();
        String[] arregloEscuelas = esc.getEscuelas(this.facultad);
        return arregloEscuelas[this.escuela];
    }

    public int getIndexEscuela() {
        return facultad;
    }
    
    public void setIndexEscuela(Integer escuela) {
        this.escuela = escuela;
    }

    public String getGradoAcademico() {
        return gradoAcademico;
    }

    public void setGradoAcademico(String gradoAcademico) {
        this.gradoAcademico = gradoAcademico;
    }
    
    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public int getIndexPreguntaSeguridad() {
        return preguntaSeguridad;
    }

    public void setPreguntaSeguridad(int preguntaSeguridad) {
        this.preguntaSeguridad = preguntaSeguridad;
    }
    
    public String getRespuestaSeguridad() {
        return respuestaSeguridad;
    }

    public void setRespuestaSeguridad(String respuestaSeguridad) {
        this.respuestaSeguridad = respuestaSeguridad;
    }
    public String getGradoAcadAbrev(){
        String gradoAcadAbrev;
        
        if(this.getGradoAcademico().equals("Bachiller")){
            gradoAcadAbrev = "Bach";
        } else if(this.getGradoAcademico().equals("Licenciado")){
            gradoAcadAbrev = "Lic";
        } else if(this.getGradoAcademico().equals("Magister")){
            gradoAcadAbrev = "Mag";
        }else{
            gradoAcadAbrev = "Dr";
        }
        
        return gradoAcadAbrev;
    }
    
    public String getUserName(){
            
        
        String firstName;
        String firstApellido;
        
        if(!this.nombres.contains(" ")){
            firstName = this.nombres;
        } else {
            firstName = this.getNombres().substring(0, this.getNombres().indexOf(" "));
        }
        
        if(!this.apellidos.contains(" ")){
            firstApellido = this.apellidos;
        } else {
            firstApellido = this.getApellidos().substring(0, this.getApellidos().indexOf(" "));
        }
        
        String userName = getGradoAcadAbrev() + ". " + firstName + " " + firstApellido;
        return userName;
    }

}
