package Model;

import java.time.LocalDate;

public class Midia
{
    private String titulo;
    private int ano;
    private String categoria;
    private int avaliacao;
    private LocalDate data;

    Midia(String titulo, int ano, String categoria, int avaliacao, LocalDate data)
    {
        this.titulo = titulo;
        this.ano = ano;
        this.categoria = categoria;
        this.avaliacao = avaliacao;
        this.data = data;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public int getAno() {
        return this.ano;
    }

    public String getCategoria() {
        return this.categoria;
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

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }

    public void setData(LocalDate data)
    {
        this.data = data;
    }
}
