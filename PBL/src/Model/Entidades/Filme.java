package Model.Entidades;

import java.time.LocalDate;
import java.util.ArrayList;

public class Filme extends MidiaAV
{
    private ArrayList<String> direcao;
    private ArrayList<String> roteiro;
    private int duracao;
    private String review;
    private int avaliacao;
    private LocalDate data;

    public Filme(String titulo, int ano, Categoria categoria, String review, int avaliacao, LocalDate data,
                 String titulo_original, String onde_assistir, int duracao,
                 ArrayList<String> elenco, ArrayList<String> roteiro,
                 ArrayList<String> direcao)
    {
        super(titulo, ano, categoria, titulo_original, onde_assistir, elenco);
        this.direcao = direcao;
        this.roteiro = roteiro;
        this.duracao = duracao;
        this.review = review;
        this.avaliacao = avaliacao;
        this.data = data;
    }

    public String toString()
    {
        return super.toString() + "Direção: " + this.direcao +
                "\nRoteiro: " + this.roteiro +
                "\nDuracao: " + this.duracao + "\n";
    }

    public ArrayList<String> getDirecao() {
        return this.direcao;
    }

    public ArrayList<String> getRoteiro() {
        return this.roteiro;
    }

    public int getDuracao() {
        return this.duracao;
    }

    public int getAvaliacao()
    {
        return this.avaliacao;
    }

    public void setDirecao(ArrayList<String> direcao) {
        this.direcao = direcao;
    }

    public void setRoteiro(ArrayList<String> roteiro) {
        this.roteiro = roteiro;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
}