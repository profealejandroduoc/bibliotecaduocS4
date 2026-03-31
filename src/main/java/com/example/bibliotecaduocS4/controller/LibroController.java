package com.example.bibliotecaduocS4.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bibliotecaduocS4.model.Libro;
import com.example.bibliotecaduocS4.service.LibroService;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
@RequestMapping("/api/v1/libros")
public class LibroController {
    @Autowired
    private LibroService libroservice;

    @GetMapping("cargardatos")
    public String getCargarDatos() {
        libroservice.seed();
        return "Datos Cargados";
    }

    @GetMapping
    public List<Libro> getLibros() {
        return libroservice.readAll();
    }

    @PostMapping
    public Libro postLibro(@RequestBody Libro libro) {
        return libroservice.create(libro);
    }

    @GetMapping("{id}")
    public Libro getLibroReadbyId(@PathVariable int id) {
        return libroservice.readbyId(id);

    }

    @GetMapping("isbn/{isbn}")
    public Libro getLibrobyIsbn(@PathVariable String isbn) {
        return libroservice.readbyIsbn(isbn);
    }

    @PutMapping("{id}")
    public Libro putLibro(@PathVariable int id, @RequestBody Libro libro) {
        return libroservice.update(id,libro);
    }

    @DeleteMapping("eliminar/{id}")
    public String deleteLibro(@PathVariable int id){
        return libroservice.delete(id);
   
    }
}
