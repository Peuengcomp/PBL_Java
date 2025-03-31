package Model.Entidades;

import java.time.LocalDate;
import java.util.ArrayList;

public class Serie extends MidiaAV
{
    private int ano_de_encerramento;
    private ArrayList<Temporada> temporadas;

    Serie(String titulo, int ano, Categoria categoria, String review, int avaliacao, LocalDate data, String titulo_original,
          String onde_assistir, ArrayList<String> elenco, int ano_de_encerramento, ArrayList<Temporada> temporadas)
    {
        super(titulo, ano, categoria, review, avaliacao, data, titulo_original, onde_assistir, elenco);
        this.ano_de_encerramento = ano_de_encerramento;
        this.temporadas = temporadas;
    }

    public String toString()
    {
        return super.toString() + "Ano de encerramento: " + this.ano_de_encerramento +
                "\n Temporadas:" + this.temporadas + "\n";
    }

    public int getAno_de_encerramento() {
        return this.ano_de_encerramento;
    }

    public ArrayList<Temporada> getTemporadas() {
        return this.temporadas;
    }

    public void setAno_de_encerramento(int ano_de_encerramento) {
        this.ano_de_encerramento = ano_de_encerramento;
    }

    public void setTemporadas(ArrayList<Temporada> temporadas) {
        this.temporadas = temporadas;
    }
}
