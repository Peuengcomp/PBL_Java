package Model;

public class Temporada
{
    private int id_temporada;
    private int ano;
    private int qtd_epsidios;
    private int avaliacao;

    Temporada(int id_temporada, int ano, int qtd_epsidios, int avaliacao)
    {
        this.id_temporada = id_temporada;
        this.ano = ano;
        this.qtd_epsidios = qtd_epsidios;
        this.avaliacao = avaliacao;
    }

    public String toString()
    {
        return "Temporada: " + this.id_temporada +
                "Ano: " + this.ano +
                "\nQuantidade: " + this.qtd_epsidios + "\n";
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