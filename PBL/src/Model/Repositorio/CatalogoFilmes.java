package Model.Repositorio;

import Model.Filme;

import java.util.ArrayList;
import java.util.List;

public class CatalogoFilmes implements iCatalogo<Filme>
{
    private static CatalogoFilmes colecao_filmes;
    private List<Filme> filmes;

    private void CriarCatalogo()
    {
        this.filmes = new ArrayList<Filme>();
    }

    public CatalogoFilmes getCatalogo()
    {
        if (colecao_filmes == null)
            colecao_filmes = new CatalogoFilmes();
        return colecao_filmes.getCatalogo();
    }

    @Override
    public void ListarLivros()
    {

    }

    @Override
    public void Adicionar(Filme objeto) {

    }

    @Override
    public void Remover(Filme objeto) {

    }
}
