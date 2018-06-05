/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

/**
 *
 * @author ESFOT
 */
public class Libro {
    String nombLib;
    String [] autor;
    int anio;
    boolean favorito;

    @Override
    public String toString() {
        return "Libro{" + "nombLib=" + nombLib + ", autor=" + autor + ", anio=" + anio + ", favorito=" + favorito + '}';
    }

    public void setNombLib(String nombLib) {
        this.nombLib = nombLib;
    }

    public void setAutor(String[] autor) {
        this.autor = autor;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setFavorito(boolean favorito) {
        this.favorito = favorito;
    }

    public String getNombLib() {
        return nombLib;
    }

    public String[] getAutor() {
        return autor;
    }

    public int getAnio() {
        return anio;
    }

    public boolean isFavorito() {
        return favorito;
    }

    public Libro(String nombLib, String[] autor, int anio, boolean favorito) {
        this.nombLib = nombLib;
        this.autor = autor;
        this.anio = anio;
        this.favorito = favorito;
    }
}
