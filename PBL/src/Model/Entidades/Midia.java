package Model.Entidades;

import java.time.LocalDate;

public class Midia
{
    private String titulo;
    private int ano;
    private Categoria genero;

    Midia(String titulo, int ano, Categoria categoria)
    {
        this.titulo = titulo;
        this.ano = ano;
        this.genero = categoria;
    }

    public String toString()
    {
        return "Titulo: " + this.titulo + "\nAno: " + this.ano + "\nCategoria: " + this.genero.getCategoria() + "\n";
    }

    public String getTitulo() {
        return this.titulo;
    }

    public int getAno() {
        return this.ano;
    }

    public Categoria getCategoria() {
        return this.genero;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setCategoria(Categoria categoria) {
        this.genero = categoria;
    }
}
