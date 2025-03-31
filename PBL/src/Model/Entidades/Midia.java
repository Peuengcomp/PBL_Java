package Model.Entidades;

import java.time.LocalDate;

public class Midia
{
    private String titulo;
    private int ano;
    private Categoria genero;
    private String review;
    private int avaliacao;
    private LocalDate data;

    Midia(String titulo, int ano, Categoria categoria, String review, int avaliacao, LocalDate data)
    {
        this.titulo = titulo;
        this.ano = ano;
        this.genero = categoria;
        this.avaliacao = avaliacao;
        this.review = review;
        this.data = data;
    }

    public String toString()
    {
        return "Titulo: " + this.titulo + "\nAno: " + this.ano + "\nCategoria: " + this.genero.getCategoria() +
                "\nData: " + this.data + "\nReview: " + this.review + "\n";
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

    public String getReview()
    {
        return this.review;
    }

    public int getAvaliacao() {
        return this.avaliacao;
    }

    public LocalDate getData()
    {
        return this.data;
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

    public void setReview(String review)
    {
        this.review = review;
    }

    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }

    public void setData(LocalDate data)
    {
        this.data = data;
    }
}
