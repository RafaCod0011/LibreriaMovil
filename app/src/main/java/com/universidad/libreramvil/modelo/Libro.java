package com.universidad.libreramvil.modelo;

import java.io.Serializable;
import java.util.List;

public class Libro implements Serializable {

    private int tapa;
    private String titulo;
    private String autor;
    private String isbn;
    private String editorial;
    private int anioPublicacion;
    private int cantidadPaginas;
    private List<String> generos;
    private String sinopsis;

    public Libro() {
    }

    public Libro(int tapa, String titulo, String autor, String isbn, String editorial,
                 int anioPublicacion, int cantidadPaginas, List<String> generos, String sinopsis) {
        this.tapa = tapa;
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.editorial = editorial;
        this.anioPublicacion = anioPublicacion;
        this.cantidadPaginas = cantidadPaginas;
        this.generos = generos;
        this.sinopsis = sinopsis;
    }

    public Libro buscar(String tituloBusqueda) {
        if (this.titulo != null && this.titulo.equalsIgnoreCase(tituloBusqueda)) {
            return this;
        }
        return null;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public int getTapa() {
        return tapa;
    }

    public void setTapa(int tapa) {
        this.tapa = tapa;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public int getCantidadPaginas() {
        return cantidadPaginas;
    }

    public void setCantidadPaginas(int cantidadPaginas) {
        this.cantidadPaginas = cantidadPaginas;
    }

    public List<String> getGeneros() {
        return generos;
    }

    public void setGeneros(List<String> generos) {
        this.generos = generos;
    }
}