package Model;

public class Temporada
{
    private int ano;
    private int qtd_epsidios;

    Temporada(int ano, int qtd_epsidios) {
        this.ano = ano;
        this.qtd_epsidios = qtd_epsidios;
    }

    public int getAno() {
        return this.ano;
    }

    public int getQtd_epsidios() {
        return this.qtd_epsidios;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setQtd_epsidios(int qtd_epsidios) {
        this.qtd_epsidios = qtd_epsidios;
    }
}