package Model.Entidades;

import java.util.ArrayList;

// Esta classe representa a entidade série.

public class Serie extends MidiaAV
{
    private int ano_de_encerramento;
    private ArrayList<Temporada> temporadas;
    private float avaliacao;

    public Serie(String titulo, int ano, Categoria categoria, String titulo_original,
                 String onde_assistir, ArrayList<String> elenco, int ano_de_encerramento, ArrayList<Temporada> temporadas)
    {
        super(titulo, ano, categoria, titulo_original, onde_assistir, elenco);
        this.ano_de_encerramento = ano_de_encerramento;
        this.temporadas = temporadas;
        this.avaliacao = setAvaliacao();
    }

    public String toString()
    {
        return super.toString() + "Ano de encerramento: " + this.ano_de_encerramento +
                "\nAvaliação: " + this.avaliacao + "\nTemporadas:" + "\n" + getStringTemporadas();
    }

    public int getAno_de_encerramento() {
        return this.ano_de_encerramento;
    }

    public ArrayList<Temporada> getTemporadas()
    {
        return this.temporadas;
    }

    public float getAvaliacao()
    {
        return this.avaliacao;
    }

    public String getStringTemporadas()
    {
        String temporadas = "";
        for (Temporada temporada : this.temporadas)
        {
            temporadas += temporada.toString();
        }
        return temporadas;
    }

    public void setAno_de_encerramento(int ano_de_encerramento) {
        this.ano_de_encerramento = ano_de_encerramento;
    }

    public void setTemporadas(ArrayList<Temporada> temporadas) {
        this.temporadas = temporadas;
    }

    public float setAvaliacao()
    {
        float soma = 0;
        for (Temporada temporada : temporadas)
        {
            soma += (float) temporada.getAvaliacao();
        }
        float media_avaliacao = soma / temporadas.size();
        return media_avaliacao;
    }
}
