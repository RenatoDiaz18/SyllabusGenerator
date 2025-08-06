    package Clases;

    import java.util.ArrayList;
    import java.util.List;

    public class ListaEscuela {

        public static final List<ProgramaEstudios> escuelas = new ArrayList<>();

        static {
            ProgramaEstudios infor = new ProgramaEstudios("Ingenieria de Computacion e Informatica");
            
            List<Desempeño> desempeñosIG = new ArrayList<>();
            desempeñosIG.add(new Desempeño("1", "Diseña interfaces gráficas, bajo los paradigmas orientado a objetos (POO) y eventos."));
            desempeñosIG.add(new Desempeño("2", "Utiliza colecciones y memoria secundaria, bajo el paradigma orientado a objetos."));
            desempeñosIG.add(new Desempeño("3", "Construye entornos bidimensionales, utilizando figuras geométricas 2D y su expresión creativa."));
            infor.agregarCursoACiclo(3, new Curso("CYEE1011", "Desarrollo de Aplicaciones con Interfaces Graficas", 4,"Programación Orientada a Objetos" ,"4", "2", "La asignatura “Desarrollo de aplicaciones con interfaz gráfica” tiene como resultado de aprendizaje el desarrollo de la capacidad “Crea interfaces gráficas considerando los paradigmas de orientación a objetos y basado en eventos, que contribuye al desarrollo de la competencia específica “Construye software multiplataforma que generen valor al negocio y satisfagan las necesidades de las organizaciones y sociedad en general, aplicando procesos de desarrollo”, del perfil de egreso. Es una asignatura de naturaleza teórico práctica, enmarcada en el enfoque por competencias que posibilita una metodología activa en un entorno real de enseñanza aprendizaje situando al estudiante como protagonista de su aprendizaje y al docente como facilitador del proceso formativo. Propone actividades como: presentación de video motivador, presentación de propósito de la sesión, movilizarlossaberes previos a través de una actividad diagnóstica, el desarrollo de actividades de aprendizaje a través del planteamiento y resolución de casos, trabajos individuales y/o en equipos; que posibiliten el conocimiento de lasinterfaces gráficas, los controles de usuario, manejo de eventos, las colecciones de datos y su clasificación, colecciones genéricas; igualmente, archivos y flujos de datos, contextos y objetos gráficos, colores y fuentes y las figuras geométricas 2D. Así mismo, las habilidades relacionadas con la utilización de la POO en interfaces gráficas, la identificación y el uso de eventos y la utilización de eventos en la definición interacción en interfaces gráficas; de igual manera, la identificación de colecciones de datos y sus operaciones, la definición de colecciones de objetos y el almacenamiento de colecciones de objetos en memoria secundaria; finalmente, la identificación de objetos y contextos del entorno gráfico, la utilización de objetos gráficos y expresión creativa, así como la composición de entornos bidimensionales y la construcción de funcionalidades de juegos básicos.", "Construye software multiplataforma que generen valor al negocio y satisfagan las necesidades de "
                    + "las organizaciones y sociedad en general, aplicando procesos de desarrollo.", "Crea interfaces gráficas considerando los paradigmas de orientación a objetos y basado en eventos.",desempeñosIG ));


            escuelas.add(infor);
        }

    public static List<Curso> obtenerCursos(String escuela, int ciclo) {
        if (escuelas == null) {
            return new ArrayList<>();
        }
        for (ProgramaEstudios esc : escuelas) {
            if (esc.getNombreEscuela().equalsIgnoreCase(escuela)) {
                return esc.getCursosDelCiclo(ciclo);
            }
        }
        return new ArrayList<>();
    }

}
