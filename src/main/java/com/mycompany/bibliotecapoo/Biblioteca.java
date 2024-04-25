package com.mycompany.bibliotecapoo;

import java.util.LinkedList;

class Biblioteca {

    private LinkedList<Libro> libros;

    public Biblioteca() {
        libros = new LinkedList<>();
    }

    public void registrarLibro(Libro libro) {
        libros.add(libro);
    }

    public Libro buscarLibro(String palabraBusqueda) {
        for (Libro libro : libros) {
            if (libro.getTitulo().toLowerCase().contains(palabraBusqueda.toLowerCase())) {
                return libro;
            }
        }
        return null; // Si no se encuentra ningún libro con la palabra de búsqueda
    }

    public void mostrarLibros() {
        System.out.println("Libros disponibles:");
        for (Libro libro : libros) {
            System.out.println("- " + libro.getTitulo() + " (" + libro.getAutor() + ")");
        }
    }

    public void mostrarLibrosNoLeidos() {
        System.out.println("Libros no leídos:");
        for (Libro libro : libros) {
            if (!libro.isLeido()) {
                System.out.println("- " + libro.getTitulo() + " (" + libro.getAutor() + ")");
            }
        }
    }

    public static void main(String[] args) {
        Biblioteca miBiblioteca = new Biblioteca();

        // Ejemplo de registro de libros
        miBiblioteca.registrarLibro(new Libro("Cien años de soledad", "Gabriel García Márquez"));
        miBiblioteca.registrarLibro(new Libro("1984", "George Orwell"));

        // Ejemplo de búsqueda de libro
        Libro libroEncontrado = miBiblioteca.buscarLibro("1984");
        if (libroEncontrado != null) {
            System.out.println("Libro encontrado: " + libroEncontrado.getTitulo());
        } else {
            System.out.println("Libro no encontrado.");
        }

        // Ejemplo de mostrar libros disponibles
        miBiblioteca.mostrarLibros();

        // Ejemplo de mostrar libros no leídos
        miBiblioteca.mostrarLibrosNoLeidos();
    }
}

