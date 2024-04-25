package com.mycompany.bibliotecapoo;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Biblioteca miBiblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenú:");
            System.out.println("1) Ingresar libro");
            System.out.println("2) Mostrar todos los libros");
            System.out.println("3) Buscar libro");
            System.out.println("4) Marcar libro como leído");
            System.out.println("5) Mostrar libros no leídos");
            System.out.println("6) Salir");
            System.out.print("Selecciona una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    System.out.print("Ingresa el título del libro: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Ingresa el autor del libro: ");
                    String autor = scanner.nextLine();
                    miBiblioteca.registrarLibro(new Libro(titulo, autor));
                    System.out.println("Libro registrado exitosamente.");
                    break;
                case 2:
                    miBiblioteca.mostrarLibros();
                    break;
                case 3:
                    System.out.print("Ingresa la palabra de búsqueda: ");
                    String palabraBusqueda = scanner.nextLine();
                    Libro libroEncontrado = miBiblioteca.buscarLibro(palabraBusqueda);
                    if (libroEncontrado != null) {
                        System.out.println("Libro encontrado: " + libroEncontrado.getTitulo());
                    } else {
                        System.out.println("Libro no encontrado.");
                    }
                    break;
                case 4:
                    // Implementa la lógica para marcar un libro como leído
                    break;
                case 5:
                    miBiblioteca.mostrarLibrosNoLeidos();
                    break;
                case 6:
                    System.out.println("¡Hasta luego!");
                    System.exit(0);
                default:
                    System.out.println("Opción inválida. Inténtalo nuevamente.");
            }
        }
    }
}
