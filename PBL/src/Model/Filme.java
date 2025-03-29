package Model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Filme extends MidiaAV
{
    private ArrayList<String> direcao;
    private ArrayList<String> roteiro;
    private int duracao;

    Filme(String titulo, int ano, String categoria, int avaliacao, LocalDate data, String titulo_original, String onde_assistir,
          ArrayList<String> elenco, ArrayList<String> roteiro, ArrayList<String> direcao, int duracao)
    {
        super(titulo, ano, categoria, avaliacao, data, titulo_original, onde_assistir, elenco);
        this.direcao = direcao;
        this.roteiro = roteiro;
        this.duracao = duracao;
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