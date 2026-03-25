package com.example.bibliotecaduocS4.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.bibliotecaduocS4.model.Libro;

@Repository
public class LibroRepository {
    private List<Libro> listaLibros=new ArrayList<>();

    public List<Libro> obteneLibros() {
        return listaLibros;
    }

    public Libro guardarLibro(Libro libro) {
        listaLibros.add(libro);
        return libro;   
    }
}
