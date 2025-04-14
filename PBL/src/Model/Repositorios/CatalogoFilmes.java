package Model.Repositorios;

import Model.Entidades.Filme;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CatalogoFilmes implements iCatalogo<Filme>
{
    private static CatalogoFilmes colecao_filmes;
    private ArrayList<Filme> filmes;

    private CatalogoFilmes() {
        CriarCatalogo();
    }

    private void CriarCatalogo() {
        this.filmes = new ArrayList<>();
    }

    public static CatalogoFilmes getCatalogo() {
        if (colecao_filmes == null) {
            colecao_filmes = new CatalogoFilmes();
        }
        return colecao_filmes;
    }

    public ArrayList<Filme> getFilmes()
    {
        return this.filmes;
    }

    @Override
    public boolean ListarOrdenar(boolean ordem)
    {
        if (filmes.isEmpty())
        {
            System.out.println("Nenhum filme cadastrado");
            return false;
        }
        else
        {
            if (ordem)
                filmes.sort(Comparator.comparingInt(Filme::getAvaliacao));
            else
                filmes.sort(Comparator.comparingInt(Filme::getAvaliacao).reversed());

            for (Filme filme : filmes)
            {
                System.out.println(filme);
            }
        }
        return true;
    }

    @Override
    public void Adicionar(Filme objeto)
    {
        filmes.add(objeto);
    }

}
