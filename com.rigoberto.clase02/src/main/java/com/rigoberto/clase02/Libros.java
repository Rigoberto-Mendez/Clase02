/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rigoberto.clase02;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Libros {

    private int Id;
    private String NombreLibro;
    private int NumeroPaginas;
    private String Autor;

    public Libros(int Id, String NombreLibro, int NumeroPaginas, String Autor) {

        this.Id = Id;
        this.NombreLibro = NombreLibro;
        this.NumeroPaginas = NumeroPaginas;
        this.Autor = Autor;

    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNombreLibro() {
        return NombreLibro;
    }

    public void setNombreLibro(String NombreLibro) {
        this.NombreLibro = NombreLibro;
    }

    public int getNumeroPaginas() {
        return NumeroPaginas;
    }

    public void setNumeroPaginas(int NumeroPaginas) {
        this.NumeroPaginas = NumeroPaginas;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    @Override
    public String toString() {
        return "Libros{" + "Id=" + Id + ", NombreLibro=" + NombreLibro + ", NumeroPaginas=" + NumeroPaginas + ", Autor=" + Autor + '}';
    }

}
