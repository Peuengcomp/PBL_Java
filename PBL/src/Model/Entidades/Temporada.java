package Model.Entidades;

import java.time.LocalDate;

public class Temporada
{
    private int id_temporada;
    private int ano;
    private int qtd_epsidios;
    private String review;
    private int avaliacao;
    private LocalDate data;

    public Temporada(int id_temporada, int ano, int qtd_epsidios, String review, int avaliacao, LocalDate data)
    {
        this.id_temporada = id_temporada;
        this.ano = ano;
        this.qtd_epsidios = qtd_epsidios;
        this.review = review;
        this.avaliacao = avaliacao;
        this.data = data;
    }

    public String toString()
    {
        return "\nTemporada: " + this.id_temporada +
                "\nAno: " + this.ano +
                "\nQuantidade de episódios: " + this.qtd_epsidios +
                "\nFoi finalizada em: " + this.data +
                "\nAvaliacao: " + this.avaliacao +
                "\nReview: "+ this.review + "\n";
    }

    public int getId_temporada()
    {
        return this.id_temporada;
    }

    public int getAno() {
        return this.ano;
    }

    public int getQtd_epsidios() {
        return this.qtd_epsidios;
    }

    public int getAvaliacao()
    {
        return this.avaliacao;
    }

    public String getReview()
    {
        return this.review;
    }

    public LocalDate getData()
    {
        return this.data;
    }

    public void setId_temporada(int id_temporada)
    {
        this.id_temporada = id_temporada;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setQtd_epsidios(int qtd_epsidios) {
        this.qtd_epsidios = qtd_epsidios;
    }

    public void setAvaliacao(int avaliacao)
    {
        this.avaliacao = avaliacao;
    }
}