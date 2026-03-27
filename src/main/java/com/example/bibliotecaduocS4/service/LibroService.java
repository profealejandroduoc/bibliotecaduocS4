package com.example.bibliotecaduocS4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bibliotecaduocS4.model.Libro;
import com.example.bibliotecaduocS4.repository.LibroRepository;

@Service
public class LibroService {
    @Autowired
    private LibroRepository libroRepository;

    public List<Libro> readAll() {
        return libroRepository.obteneLibros();

    }

    public Libro create(Libro libro) {
        return libroRepository.guardarLibro(libro);

    }

    public void seed() {
        libroRepository.seed();
    }

    public Libro readbyId(int id) {
        return libroRepository.obtenerPorId(id);
    }

    public Libro readbyIsbn(String isbn) {

        return libroRepository.buscarporIsbn(isbn);
    }

}
