package Model.Entidades;

import java.time.LocalDate;

// Esta classe tem por finalidade representar um livro

public class Livro extends Midia
{
    private String autor;
    private String editora;
    private String ISBN;
    private boolean tem_exemplar;
    private String review;
    private int avaliacao;
    private LocalDate data;

    public Livro(String titulo, int ano, Categoria categoria, String review,
                 int avaliacao, LocalDate data, String autor, String editora,
                 String ISBN, boolean tem_exemplar)
    {
        super(titulo, ano, categoria);
        this.autor = autor;
        this.editora = editora;
        this.ISBN = ISBN;
        this.tem_exemplar = tem_exemplar;
        this.review = review;
        this.avaliacao = avaliacao;
        this.data = data;
    }

    @Override
    public String toString()
    {
        return super.toString() + "autor: " + this.autor + "\neditora: " + this.editora +
                "\nISBN: " + this.ISBN + "\ntem_exemplar: " + exemplar() +
                "\nFoi finalizado em: " + this.data +
                "\nAvaliacao: " + this.avaliacao +
                "\nReview: "+ this.review + "\n";
    }

    public String getAutor()
    {
        return this.autor;
    }

    public String getEditora()
    {
        return this.editora;
    }

    public String getISBN()
    {
        return this.ISBN;
    }

    public boolean getTem_exemplar()
    {
        return this.tem_exemplar;
    }

    public String getReview()
    {
        return this.review;
    }

    public int getAvaliacao()
    {
        return this.avaliacao;
    }

    public LocalDate getData()
    {
        return this.data;
    }

    public void setAutor(String autor)
    {
        this.autor = autor;
    }

    public void setEditora(String editora)
    {
        this.editora = editora;
    }

    public void setISBN(String ISBN)
    {
        this.ISBN = ISBN;
    }

    public void setTem_exemplar(boolean tem_exemplar)
    {
        this.tem_exemplar = tem_exemplar;
    }

    public void setReview(String review)
    {
        this.review = review;
    }

    public void setAvaliacao(int avaliacao)
    {
        this.avaliacao = avaliacao;
    }

    public void setData(LocalDate data)
    {
        this.data = data;
    }

    public String exemplar()
    {
        if (getTem_exemplar())
            return "Sim";
        else
            return "Não";
    }
}
