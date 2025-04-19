package Controller.Criar;

import Model.Entidades.Categoria;
import Model.Entidades.Serie;
import Model.Entidades.Temporada;
import Model.Repositorios.CatalogoSeries;

import java.util.ArrayList;

// Esta classe tem por finalidade criar uma série e adicionar ao catálogo

public class CriarSerie
{
    public static void criarSerie(String titulo, int ano, Categoria categoria, String titulo_original,
                                  String onde_assistir, ArrayList<String> elenco, int ano_de_encerramento, ArrayList<Temporada> temporadas)
    {
        Serie serie = new Serie(titulo, ano, categoria, titulo_original, onde_assistir, elenco, ano_de_encerramento, temporadas);
        CatalogoSeries.getCatalogo().Adicionar(serie);
    }
}
