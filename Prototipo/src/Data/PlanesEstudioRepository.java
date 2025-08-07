/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;
import java.util.*;

/**
 *
 * @author USUARIO
 */
public class PlanesEstudioRepository {
    
    // Mapa: "SIGLAS - Nombre" -> (Escuela -> Lista de Planes)
    private static final Map<String, Map<String, List<String>>> planesPorFacultadEscuela = new HashMap<>();

    static {
        // FA - Facultad de Agronomía
        planesPorFacultadEscuela.put("FA - Facultad de Agronomía", Map.of(
            "Agronomía", List.of("Agronomía")
        ));

        // FCBB - Facultad de Ciencias Biológicas
        planesPorFacultadEscuela.put("FCBB - Facultad de Ciencias Biológicas", Map.of(
            "Biología", List.of(
                "Biología - Biología",
                "Biología - Botánica",
                "Biología - Microbiología - Parasitología",
                "Biología - Pesquería"
            )
        ));

        // FACEAC - Facultad de Ciencias Económicas, Administrativas y Contables
        planesPorFacultadEscuela.put("FACEAC - Facultad de Ciencias Económicas, Administrativas y Contables", Map.of(
            "Administración", List.of("Administración"),
            "Comercio y Negocios Internacionales", List.of("Comercio y Negocios Internacionales"),
            "Contabilidad", List.of("Contabilidad"),
            "Economía", List.of("Economía")
        ));

        // FACFYM - Facultad de Ciencias Físicas y Matemáticas
        planesPorFacultadEscuela.put("FACFYM - Facultad de Ciencias Físicas y Matemáticas", Map.of(
            "Estadística", List.of("Estadística"),
            "Física", List.of("Física"),
            "Matemática", List.of("Matemática"),
            "Ingeniería en Computación e Informática", List.of("Ingeniería en Computación e Informática"),
            "Ingeniería Electrónica", List.of("Ingeniería Electrónica")
        ));

        // FACHSE - Facultad de Ciencias Histórico Sociales y Educación
        planesPorFacultadEscuela.put("FACHSE - Facultad de Ciencias Histórico Sociales y Educación", Map.of(
            "Arqueología", List.of("Arqueología"),
            "Arte", List.of(
                "Arte con especialidad en Artes Plásticas",
                "Arte con especialidad en Danzas",
                "Arte con especialidad en Música",
                "Arte con especialidad en Pedagogía Artística",
                "Arte con especialidad en Teatro"
            ),
            "Ciencias de la Comunicación", List.of("Ciencias de la Comunicación"),
            "Educación", List.of(
                "Educación Especialidad Ciencias Histórico Sociales y Filosofía",
                "Educación Especialidad Ciencias Naturales",
                "Educación Especialidad Educación Física",
                "Educación Especialidad Educación Inicial",
                "Educación Especialidad Educación Primaria",
                "Educación Especialidad Idiomas extranjeros",
                "Educación Especialidad Lengua y Literatura",
                "Educación Especialidad Matemática y Computación"
            ),
            "Psicología", List.of("Psicología"),
            "Sociología", List.of("Sociología")
        ));

        // FE - Facultad de Enfermería
        planesPorFacultadEscuela.put("FE - Facultad de Enfermería", Map.of(
            "Enfermería", List.of("Enfermería")
        ));

        // FDCP - Facultad de Derecho y Ciencias Políticas
        planesPorFacultadEscuela.put("FDCP - Facultad de Derecho y Ciencias Políticas", Map.of(
            "Derecho", List.of("Derecho"),
            "Ciencias Políticas", List.of("Ciencias Políticas")
        ));

        // FIA - Facultad de Ingeniería Agrícola
        planesPorFacultadEscuela.put("FIA - Facultad de Ingeniería Agrícola", Map.of(
            "Ingeniería Agrícola", List.of("Ingeniería Agrícola")
        ));

        // FIME - Facultad de Ingeniería Mecánica y Eléctrica
        planesPorFacultadEscuela.put("FIME - Facultad de Ingeniería Mecánica y Eléctrica", Map.of(
            "Ingeniería Mecánica Eléctrica", List.of("Ingeniería Mecánica Eléctrica")
        ));

        // FIZ - Facultad de Ingeniería Zootecnia
        planesPorFacultadEscuela.put("FIZ - Facultad de Ingeniería Zootecnia", Map.of(
            "Ingeniería Zootecnia", List.of("Ingeniería Zootecnia")
        ));

        // FMH - Facultad de Medicina Humana
        planesPorFacultadEscuela.put("FMH - Facultad de Medicina Humana", Map.of(
            "Medicina Humana", List.of("Medicina Humana")
        ));

        // FMV - Facultad de Medicina Veterinaria
        planesPorFacultadEscuela.put("FMV - Facultad de Medicina Veterinaria", Map.of(
            "Medicina Veterinaria", List.of("Medicina Veterinaria")
        ));

        // FICSA - Facultad de Ingeniería Civil, de Sistemas y de Arquitectura
        planesPorFacultadEscuela.put("FICSA - Facultad de Ingeniería Civil, de Sistemas y de Arquitectura", Map.of(
            "Arquitectura", List.of("Arquitectura"),
            "Ingeniería Civil", List.of("Ingeniería Civil"),
            "Igeniería de Sistemas", List.of("Igeniería de Sistemas")
        ));

        // FIQIA - Facultad de Ingeniería Química e Industrias Alimentarias
        planesPorFacultadEscuela.put("FIQIA - Facultad de Ingeniería Química e Industrias Alimentarias", Map.of(
            "Ingeniería de Industrias Alimentarias", List.of("Ingeniería de Industrias Alimentarias"),
            "Ingeniería Química", List.of("Ingeniería Química")
        ));
    }

    // Obtener lista de planes dado facultad y escuela
    public static List<String> obtenerPlanes(String facultadConNombre, String escuela) {
        Map<String, List<String>> escuelas = planesPorFacultadEscuela.get(facultadConNombre);
        if (escuelas != null) {
            return escuelas.getOrDefault(escuela, List.of());
        }
        return List.of();
    }

    // Obtener lista de facultades (con nombres completos)
    public static Set<String> obtenerFacultades() {
        return planesPorFacultadEscuela.keySet();
    }

    // Obtener lista de escuelas dado el nombre completo de la facultad
    public static Set<String> obtenerEscuelas(String facultadConNombre) {
        Map<String, List<String>> escuelas = planesPorFacultadEscuela.get(facultadConNombre);
        if (escuelas != null) {
            return escuelas.keySet();
        }
        return Set.of();
    }
}
