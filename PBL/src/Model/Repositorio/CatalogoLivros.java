package Model.Repositorio;

import Model.Livro;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros implements iCatalogo<Livro>
{
    private static CatalogoLivros colecao_livros;
    private List<Livro> livros;

    private void CriarCatalogo()
    {
        this.livros = new ArrayList<Livro>();
    }

    public static CatalogoLivros getCatalogo()
    {
        if (colecao_livros == null)
            colecao_livros = new CatalogoLivros();
        return colecao_livros;
    }

    @Override
    public void ListarLivros()
    {
        for (Livro livro : livros)
        {
            System.out.println(livro.toString());
        }
    }

    @Override
    public void Adicionar(Livro objeto)
    {
        this.livros.add(objeto);
    }

    @Override
    public void Remover(Livro objeto) {

    }
}
