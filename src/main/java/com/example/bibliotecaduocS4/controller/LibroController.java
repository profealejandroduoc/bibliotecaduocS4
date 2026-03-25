package com.example.bibliotecaduocS4.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bibliotecaduocS4.model.Libro;
import com.example.bibliotecaduocS4.service.LibroService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/api/v1/libros")
public class LibroController {
    @Autowired
    private LibroService libroservice;
    

    @GetMapping
    public List<Libro> getLibros(){
        return libroservice.readAll();
    }

    @PostMapping
    public Libro postLibro(@RequestBody Libro libro) {
        return libroservice.create(libro);
    }
    
    
}
