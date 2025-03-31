package Controller;

import Model.Entidades.Categoria;
import Model.Entidades.Filme;
import Model.Repositorios.CatalogoFilmes;

import java.util.ArrayList;

public class CriarFilme
{
    public static void CriarFilme(String titulo, int ano, Categoria categoria, String titulo_original, int duracao,
                                  String onde_assistir, ArrayList<String> elenco, ArrayList<String> roteiro, ArrayList<String> direcao)
    {
        Filme filme = new Filme(titulo, ano, categoria,
                null, 0, null,
                titulo_original, onde_assistir, duracao, elenco, roteiro, direcao);

        CatalogoFilmes.getCatalogo().Adicionar(filme);
    }
}
