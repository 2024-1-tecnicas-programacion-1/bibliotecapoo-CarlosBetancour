package com.mycompany.bibliotecapoo;

public class Libro {

    // Atributos de la clase Libro (puedes agregar más según tus necesidades)
    private String titulo;
    private String autor;
    private boolean leido;

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.leido = false; // Por defecto, el libro no está leído
    }

    // Getters y setters (puedes agregar más según tus necesidades)
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public boolean isLeido() {
        return leido;
    }

    public void setLeido(boolean leido) {
        this.leido = leido;
    }
}