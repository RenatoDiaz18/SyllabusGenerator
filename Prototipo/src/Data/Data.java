package Data;

import Clases.Curso;
import Clases.Docente;
import Clases.Escuela;
import Clases.Facultades;
import Clases.ProgramaEstudios;
import Clases.Silabo;
import Clases.Unidad;
import enums.EnumPaths;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.text.Normalizer;
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
    public static ProgramaEstudios programaCargado;
    
    public static final String[] PREGUNTAS_SEGURIDAD = {
    "¿Cuál es el segundo nombre de tu madre?",
    "¿Cómo se llamaba tu primera mascota?",
    "¿En qué ciudad naciste?",
    "¿Cuál fue el nombre de tu primer maestro o maestra?",
    "¿Cuál es tu comida favorita de la infancia?"
    };
    
    private static final String PATH_DATA_DOCENTES = EnumPaths.DATA_DOCENTES.getRuta();
    private static final String SEPARADOR = "\\|\\|\\|";

    public static void cargarDataDocentes() {
        try {
            List<String> lineas =  Files.readAllLines(Paths.get(PATH_DATA_DOCENTES));
            
            lineas.forEach(linea -> {
                String [] datos = linea.split(SEPARADOR);
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
    public static void cargarDataPrograma(String facultad, String escuela, String programa) {
        programaCargado = new ProgramaEstudios(escuela, programa);
        
        try {
            List<String> lineas =  Files.readAllLines(Paths.get(obetenerRutaPrograma(facultad, escuela, programa)));
            
            lineas.forEach(linea -> {
                String [] datos = linea.split(SEPARADOR);
                
                if (datos.length >= 8 && datos.length <= 10){
                    int ciclo = convertirCiclosRomanos(datos[0]);
                    String codigoCurso = datos[1];
                    int creditos = Integer.parseInt(datos[2]);
                    String nombreCurso = datos[3];
                    List<String> prerrequisitos = new ArrayList<>();
                    
                    int horasTeoricas, horasPracticas;
                    String sumilla;
                    
                    switch (datos.length) {
                        case 8 ->                             {
                                String prerrequisito = datos[4];
                                horasTeoricas = Integer.parseInt(datos[5]);
                                horasPracticas = Integer.parseInt(datos[6]);
                                sumilla = datos[7].replaceAll("\\|\\|", "\n");
                                prerrequisitos.add(prerrequisito);
                            }
                        case 9 ->                             {
                                String prerrequisito1 = datos[4];
                                String prerrequisito2 = datos[5];
                                
                                horasTeoricas = Integer.parseInt(datos[6]);
                                horasPracticas = Integer.parseInt(datos[7]);
                                sumilla = datos[8].replaceAll("\\|\\|", "\n");
                                
                                prerrequisitos.add(prerrequisito1);
                                prerrequisitos.add(prerrequisito2);
                            }
                        default ->                             {
                                String prerrequisito1 = datos[4];
                                String prerrequisito2 = datos[5];
                                String prerrequisito3 = datos[6];
                                
                                horasTeoricas = Integer.parseInt(datos[7]);
                                horasPracticas = Integer.parseInt(datos[8]);
                                sumilla = datos[9].replaceAll("\\|\\|", "\n");
                                
                                prerrequisitos.add(prerrequisito1);
                                prerrequisitos.add(prerrequisito2);
                                prerrequisitos.add(prerrequisito3);
                            }
                    }
                    
                    
                    programaCargado.agregarCursoACiclo(
                            ciclo,
                            new Curso(
                                    codigoCurso,
                                    nombreCurso,
                                    creditos,
                                    prerrequisitos,
                                    horasPracticas,
                                    horasTeoricas,
                                    sumilla
                            )
                    );
                }
            });
            
        } catch (IOException ex) {
            System.out.println("Error en la carga de data" + ex.getMessage());
        }
    }
    public static String obetenerRutaPrograma(String facultad, String escuela, String programa){
        String nombreCarpetaFacultad = facultad.substring(0, facultad.indexOf(" "));
        String pathCarpetaFacultad = "src/Data/ProgramasEstudios/" + nombreCarpetaFacultad;
        
        escuela = limpiarTexto(escuela);
        String pathCarpetaEscuela = pathCarpetaFacultad + "/" + escuela;;
        
        programa = limpiarTexto(programa);
        return pathCarpetaEscuela + "/" + programa + ".txt";
        
    }
    
    public static String limpiarTexto(String texto){
        texto = Normalizer.normalize(texto, Normalizer.Form.NFD);
        texto = texto.replaceAll("\\p{InCombiningDiacriticalMarks}+", "");
        texto = texto.replaceAll(" ", "_");
        return texto;
    }

    private static int convertirCiclosRomanos(String dato) {
        return switch (dato){
            case "I" -> 1;
            case "II" -> 2;
            case "III" -> 3;
            case "IV" -> 4;
            case "V" -> 5;
            case "VI" -> 6;
            case "VII" -> 7;
            case "VIII" -> 8;
            case "IX" -> 9;
            case "X" -> 10;
            default -> throw new IllegalArgumentException("Ciclo romano inválido: " + dato);
        };
                
    }
}
