package Model.Entidades;

import java.time.LocalDate;
import java.util.ArrayList;

public class MidiaAV extends Midia
{
    private String titulo_original;
    private String onde_assistir;
    private ArrayList<String> elenco;

    MidiaAV(String titulo, int ano, Categoria categoria,
            String titulo_original, String onde_assistir, ArrayList<String> elenco)
    {
        super(titulo, ano, categoria);
        this.titulo_original = titulo_original;
        this.onde_assistir = onde_assistir;
        this.elenco = elenco;
    }

    public String toString()
    {
        return super.toString() + "Título Original: " + this.titulo_original +
                "\nOnde Assistir: " + this.onde_assistir +
                "\nElenco: " + this.elenco + "\n";
    }

    public String getTitulo_original() {
        return this.titulo_original;
    }

    public String getOnde_assistir() {
        return this.onde_assistir;
    }

    public ArrayList<String> getElenco() {
        return this.elenco;
    }

    public void setTitulo_original(String titulo_original)
    {
        this.titulo_original = titulo_original;
    }

    public void setOnde_assistir(String onde_assistir)
    {
        this.onde_assistir = onde_assistir;
    }

    public void setElenco(ArrayList<String> elenco)
    {
        this.elenco = elenco;
    }
}
