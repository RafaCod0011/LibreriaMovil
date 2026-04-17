package com.universidad.libreramvil.repositorio;
import android.util.Log;

import com.universidad.libreramvil.modelo.Libro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LibroRepositorio {
    private List<Libro> listaLibros;

    public LibroRepositorio() {
        this.listaLibros = new ArrayList<>();
        cargarLibros();
        for (Libro nombre : listaLibros) {
            Log.d("LISTA", nombre.getTitulo());
        }
    }

    private void cargarLibros() {
        listaLibros = Arrays.asList(
                new Libro(0, "Don Quijote de la Mancha", "Miguel de Cervantes Saavedra", "9780000000001",
                        "Algar", 1605, 1568,
                        Arrays.asList("Novela de Aventuras", "sátira", "humor"),
                        "Don Quijote de la Mancha es una novela satírica que narra las aventuras de Alonso Quijano, un hidalgo que pierde la razón por su obsesión con los libros de caballería y decide recorrer el mundo como un caballero andante. Publicada con un éxito inmediato, la obra revolucionó la literatura, convirtiéndose en el libro más traducido después de la Biblia y en el pilar fundamental de la lengua castellana."),

                new Libro(1, "Harry Potter y la piedra filosofal", "J. K. Rowling", "9780000000002",
                        "Salamandra", 1997, 288,
                        Arrays.asList("Fantasía", "aventuras", "literatura juvenil"),
                        "Harry Potter y la piedra filosofal es una novela de fantasía que narra el descubrimiento del mundo mágico por parte de un niño huérfano que vive con sus tíos. Fue publicado originalmente en junio de 1997 con una tirada de apenas 500 ejemplares, pero rápidamente se convirtió en un fenómeno global, siendo galardonado con premios como el Nestlé Smarties Book Prize y el British Book Award al Libro Infantil del Año."),

                new Libro(2, "Cien años de soledad", "Gabriel García Márquez", "9780000000003",
                        "Sudamericana", 1967, 351,
                        Arrays.asList("Novela de realismo mágico", "saga familiar", "ficción"),
                        "Cien años de soledad es una novela fundamental que narra la historia de siete generaciones de la familia Buendía en el mítico pueblo de Macondo. Con un éxito arrollador, la obra se convirtió en el estandarte del boom latinoamericano, siendo galardonada con el Premio Rómulo Gallegos en 1972 y consolidando el camino para que su autor recibiera el Premio Nobel de Literatura en 1982."),

                new Libro(3, "1984", "George Orwell", "9780000000004",
                        "Secker & Warburg", 1949, 352,
                        Arrays.asList("Novela distópica", "Ciencia ficción"),
                        "1984 es una novela política de ficción que presenta una sociedad totalitaria vigilada permanentemente por el \"Gran Hermano\". Fue publicada en junio de 1949 con una recepción crítica excepcional, convirtiéndose rápidamente en un pilar del pensamiento moderno por su análisis del poder y la vigilancia, e influyendo tanto en la literatura que el adjetivo \"orwelliano\" pasó a formar parte del lenguaje común."),

                new Libro(4, "El Principito", "Antoine de Saint-Exupéry", "9780000000005",
                        "Reynal & Hitchcock", 1943, 120,
                        Arrays.asList("Novela", "literatura Infantil", "fabula", "ficción"),
                        "El Principito es una novela corta que narra el encuentro en el desierto del Sahara entre un piloto varado y un pequeño príncipe proveniente del asteroide B 612. Fue publicado en abril de 1943 con un éxito que lo llevó a ser el libro francés más traducido del mundo, recibiendo honores póstumos como el Retro Hugo Award y siendo elegido por el diario Le Monde como uno de los mejores libros del siglo XX."),

                new Libro(5, "El señor de los anillos: La comunidad del anillo", "J.R.R. Tolkien", "9780000000006",
                        "George Allen & Unwin", 1954, 500,
                        Arrays.asList("Fantasía", "Aventura", "Ciencia Ficción"),
                        "La Comunidad del Anillo es una novela de fantasía épica que narra el inicio del viaje de Frodo Bolsón para destruir el Anillo Único en el Monte del Destino. Publicada el 29 de julio de 1954, la obra se convirtió en un pilar fundamental del género, recibiendo elogios por su profunda mitología y siendo adaptada al cine en 2001 con un éxito masivo que le valió cuatro premios Óscar y múltiples galardones de la crítica literaria mundial."),

                new Libro(6, "Orgullo y prejuicio", "Jane Austen", "9780000000007",
                        "Alba", 1813, 536,
                        Arrays.asList("Novela", "sátira", "Romance"),
                        "Orgullo y prejuicio es una novela de costumbres que narra el choque y posterior enamoramiento entre la ingeniosa Elizabeth Bennet y el aristocrático Fitzwilliam Darcy en la Inglaterra de la Regencia. Fue publicada de forma anónima en enero de 1813 con una gran acogida, convirtiéndose en la obra maestra de Austen y en un referente cultural que ha sido adaptado en múltiples ocasiones al cine y la televisión, destacando la película de 2005 que recibió cuatro nominaciones a los premios Óscar."),

                new Libro(7, "Los juegos del hambre", "Suzanne Collins", "9780000000008",
                        "Molino", 2008, 400,
                        Arrays.asList("Novela Distopica", "Aventura", "Ciencia Ficción", "Literatura Juvenil"),
                        "Los juegos del hambre es una novela distópica que presenta un futuro donde jóvenes de distintos distritos son obligados a luchar a muerte en un evento televisado. Fue publicada en septiembre de 2008 con un éxito arrollador, permaneciendo más de 60 semanas consecutivas en la lista de best-sellers del New York Times y recibiendo elogios de autores como Stephen King por su ritmo adictivo y su cruda crítica social."),

                new Libro(8, "La Odisea", "Homero", "9780000000009",
                        "Gredos", -700, 450,
                        Arrays.asList("Epopeya", "poema épico", "mitología"),
                        "La Odisea es un poema épico que narra el accidentado viaje de regreso de Odiseo (Ulises) a su reino en Ítaca tras la caída de Troya. Compuesta hace más de 2,700 años, esta obra fundacional de la cultura occidental ha influido en incontables autores y artistas, destacando por su estructura narrativa de aventuras y su exploración de la astucia humana, lo que la ha mantenido como un texto esencial en la educación y la literatura universal."),

                new Libro(9, "El código Da Vinci", "Dan Brown", "9780000000010",
                        "Umbriel", 2003, 600,
                        Arrays.asList("Novela", "Misterio", "thriller", "suspenso", "ficción"),
                        "El código Da Vinci es un thriller conspirativo que sigue al simbologista Robert Langdon mientras investiga un asesinato en el Museo del Louvre. Se convirtió en uno de los libros más vendidos de la historia, alcanzando la lista de best-sellers del New York Times y generando intensos debates religiosos y académicos, además de una exitosa adaptación cinematográfica protagonizada por Tom Hanks.")
        );
    }
    public Libro buscarPorTitulo(String tituloBusqueda) {
        for (Libro libro : listaLibros) {
            Libro resultado = libro.buscar(tituloBusqueda);
            if (resultado != null) {
                return resultado;
            }
        }
        return null;
    }
}