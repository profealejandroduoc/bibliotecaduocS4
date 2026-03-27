package com.example.bibliotecaduocS4.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.bibliotecaduocS4.model.Libro;

@Repository
public class LibroRepository {
        private List<Libro> listaLibros = new ArrayList<>();

        /* SOLO PARA DATOS FAKE */
        public void seed() {
                // Asumiendo que tu lista se llama listaLibros
                listaLibros
                                .add(new Libro(1, "978-84-450-0069-4", "El Señor de los Anillos", "Minotauro", 1954,
                                                "J.R.R. Tolkien"));
                listaLibros.add(new Libro(2, "978-84-339-2016-4", "Ficciones", "Sur", 1944, "Jorge Luis Borges"));
                listaLibros.add(new Libro(3, "978-01-411-8776-1", "1984", "Secker & Warburg", 1949, "George Orwell"));
                listaLibros.add(new Libro(4, "978-84-975-9220-8", "Cien años de soledad", "Sudamericana", 1967,
                                "Gabriel García Márquez"));
                listaLibros.add(new Libro(5, "978-04-515-2493-5", "Don Quijote de la Mancha", "Juan de la Cuesta", 1605,
                                "Miguel de Cervantes"));
                listaLibros.add(new Libro(6, "978-84-206-5132-3", "El Aleph", "Losada", 1949, "Jorge Luis Borges"));
                listaLibros.add(new Libro(7, "978-06-186-4015-7", "El Hobbit", "George Allen & Unwin", 1937,
                                "J.R.R. Tolkien"));
                listaLibros.add(new Libro(8, "978-84-376-0494-7", "Rayuela", "Editorial Sudamericana", 1963,
                                "Julio Cortázar"));
                listaLibros.add(new Libro(9, "978-84-233-4271-6", "Nada", "Destino", 1945, "Carmen Laforet"));
                listaLibros.add(new Libro(10, "978-01-404-4913-6", "Crimen y castigo", "The Russian Messenger", 1866,
                                "Fiódor Dostoyevski"));
                listaLibros
                                .add(new Libro(11, "978-84-339-7324-5", "Los detectives salvajes", "Anagrama", 1998,
                                                "Roberto Bolaño"));
                listaLibros
                                .add(new Libro(12, "978-03-074-7472-8", "La sombra del viento", "Planeta", 2001,
                                                "Carlos Ruiz Zafón"));
                listaLibros.add(new Libro(13, "978-84-204-7183-9", "Travesuras de la niña mala", "Alfaguara", 2006,
                                "Mario Vargas Llosa"));
                listaLibros.add(
                                new Libro(14, "978-04-515-2634-2", "Rebelión en la granja", "Secker & Warburg", 1945,
                                                "George Orwell"));
                listaLibros.add(new Libro(15, "978-84-663-3303-0", "El código Da Vinci", "Umbriel", 2003, "Dan Brown"));
                listaLibros.add(new Libro(16, "978-84-339-1454-5", "Seda", "Anagrama", 1996, "Alessandro Baricco"));
                listaLibros.add(new Libro(17, "978-84-080-3111-6", "El alquimista", "HarperCollins", 1988,
                                "Paulo Coelho"));
                listaLibros.add(new Libro(18, "978-03-453-9180-3", "Guía del autoestopista galáctico", "Pan Books",
                                1979,
                                "Douglas Adams"));
                listaLibros.add(new Libro(19, "978-84-226-1586-6", "El nombre de la rosa", "Bompiani", 1980,
                                "Umberto Eco"));
                listaLibros.add(new Libro(20, "978-84-979-3821-1", "Crónica de una muerte anunciada", "La Oveja Negra",
                                1981,
                                "Gabriel García Márquez"));
                listaLibros.add(new Libro(21, "978-07-432-7356-5", "El gran Gatsby", "Charles Scribner's Sons", 1925,
                                "F. Scott Fitzgerald"));
                listaLibros
                                .add(new Libro(22, "978-84-206-7420-9", "La metamorfosis", "Kurt Wolff Verlag", 1915,
                                                "Franz Kafka"));
                listaLibros.add(
                                new Libro(23, "978-84-322-4813-9", "Pedro Páramo", "Fondo de Cultura Económica", 1955,
                                                "Juan Rulfo"));
                listaLibros.add(new Libro(24, "978-00-608-5052-4", "Un mundo feliz", "Chatto & Windus", 1932,
                                "Aldous Huxley"));
                listaLibros
                                .add(new Libro(25, "978-84-339-0239-9", "Ensayo sobre la ceguera", "Caminho", 1995,
                                                "José Saramago"));
                listaLibros.add(new Libro(26, "978-84-667-5173-5", "La ciudad y los perros", "Seix Barral", 1963,
                                "Mario Vargas Llosa"));
                listaLibros.add(new Libro(27, "978-84-322-0694-8", "Sobre héroes y tumbas",
                                "Compañía General Fabril Editora",
                                1961, "Ernesto Sabato"));
                listaLibros.add(new Libro(28, "978-01-411-8270-4", "El extranjero", "Gallimard", 1942, "Albert Camus"));
                listaLibros.add(new Libro(29, "978-84-376-0188-5", "Bodas de sangre", "Revista de Occidente", 1933,
                                "Federico García Lorca"));
                listaLibros.add(
                                new Libro(30, "978-84-450-7372-8", "Silmarillion", "George Allen & Unwin", 1977,
                                                "J.R.R. Tolkien"));
        }

        public List<Libro> obteneLibros() {
                return listaLibros;
        }

        public Libro guardarLibro(Libro libro) {
                listaLibros.add(libro);
                return libro;
        }

        public Libro obtenerPorId(int id) {
                for (Libro libro : listaLibros) {
                        if (libro.getId() == id) {
                                return libro;
                        }
                }
                return null;
        }

        public Libro buscarporIsbn(String isbn) {
                for (Libro libro : listaLibros) {
                        if (libro.getIsbn().equals(isbn)) {
                                return libro;
                        }
                }
                return null;
        }

}
