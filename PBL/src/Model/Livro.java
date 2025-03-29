package Model;

import java.time.LocalDate;

public class Livro extends Midia
{
    private String autor;
    private String editora;
    private String ISBN;
    private boolean tem_exemplar;

    public Livro(String titulo, int ano, String categoria, int avaliacao, LocalDate data, String autor, String editora, String ISBN, boolean tem_exemplar)
    {
        super(titulo, ano, categoria, avaliacao, data);
        this.autor = autor;
        this.editora = editora;
        this.ISBN = ISBN;
        this.tem_exemplar = tem_exemplar;
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
}
