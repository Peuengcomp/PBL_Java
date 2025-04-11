package Controller;

import Model.Entidades.Categoria;
import Model.Entidades.Livro;
import Model.Entidades.Serie;
import Model.Entidades.Temporada;
import Model.Repositorios.CatalogoLivros;
import Model.Repositorios.CatalogoSeries;

import java.time.LocalDate;
import java.util.ArrayList;

public class CriarSerie
{
    public static void criarSerie(String titulo, int ano, Categoria categoria, String titulo_original,
                                  String onde_assistir, float avaliacao, ArrayList<String> elenco, int ano_de_encerramento, ArrayList<Temporada> temporadas)
    {
        Serie serie = new Serie(titulo, ano, categoria, titulo_original, onde_assistir, avaliacao, elenco, ano_de_encerramento, temporadas);
        CatalogoSeries.getCatalogo().Adicionar(serie);
    }
}
