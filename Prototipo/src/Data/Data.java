package Data;

import Clases.Docente;
import Clases.Silabo;
import Clases.Unidad;
import enums.EnumPaths;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author USUARIO
 */
public class Data {
    public static List<Docente> docentes = new ArrayList<>();
    public static List<Silabo> silabos = new ArrayList<>();
    public static List<Unidad> unidades = new ArrayList<>();
    public static Docente docenteLogged;
    
    public static final String[] PREGUNTAS_SEGURIDAD = {
    "¿Cuál es el segundo nombre de tu madre?",
    "¿Cómo se llamaba tu primera mascota?",
    "¿En qué ciudad naciste?",
    "¿Cuál fue el nombre de tu primer maestro o maestra?",
    "¿Cuál es tu comida favorita de la infancia?"
    };
    
    private static final String PATH_DATA_DOCENTES = EnumPaths.DATA_DOCENTES.getRuta();
    private static final String SEPARADOR = "|";

    public static void cargarDataDocentes() {
        try {
            List<String> lineas =  Files.readAllLines(Paths.get(PATH_DATA_DOCENTES));
            
            lineas.forEach(linea -> {
                String [] datos = linea.split("\\" + SEPARADOR);
                if (datos.length == 10){
                    String nombre = datos[0];
                    String apellido = datos[1];
                    String genero = datos[2];
                    int indexFacultad = Integer.parseInt(datos[3]);
                    int indexEscuela = Integer.parseInt(datos[4]);
                    String gradoAcademico = datos[5];
                    String correo = datos[6];
                    String contraseña = datos[7];
                    int indexPreguntaSeguridad = Integer.parseInt(datos[8]);
                    String respuestaSeguridad = datos[9];
                    
                    Docente doc = new Docente(nombre, apellido, genero, indexFacultad, indexEscuela, gradoAcademico, correo, contraseña, indexPreguntaSeguridad, respuestaSeguridad);
                    
                    docentes.add(doc);
                }
            });
        } catch (IOException ex) {
            System.out.println("Error en la carga de data" + ex.getMessage());
        }
    }
    
    public static void actualizarDataDocentes(Docente docente){
        String linea = String.join(SEPARADOR,
                    docente.getNombres(),
                    docente.getApellidos(),
                    docente.getGenero().substring(0, 1),
                    String.valueOf(docente.getIndexFacultad()),
                    String.valueOf(docente.getIndexEscuela()),
                    docente.getGradoAcademico(),
                    docente.getCorreo(),
                    docente.getContraseña(),
                    String.valueOf(docente.getIndexPreguntaSeguridad()),
                    String.valueOf(docente.getRespuestaSeguridad())
                );
        
        try {
            Files.writeString(Paths.get(PATH_DATA_DOCENTES), linea + System.lineSeparator(), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
        } catch (IOException ex) {
            System.out.println("Error al actualizar la data" + ex.getMessage());
        }
    }
}
