package Model.Repositorios;

import Model.Entidades.Filme;
import Model.Entidades.Livro;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros implements iCatalogo<Livro>
{
    private static CatalogoLivros colecao_livros;
    private List<Livro> livros;

    private CatalogoLivros() {
        CriarCatalogo();
    }

    private void CriarCatalogo() {
        this.livros = new ArrayList<>();
    }

    public static CatalogoLivros getCatalogo() {
        if (colecao_livros == null) {
            colecao_livros = new CatalogoLivros();
        }
        return colecao_livros;
    }

    @Override
    public void Listar()
    {
        for (Livro livro : livros)
        {
            System.out.println(livro.toString());
        }
    }

    @Override
    public void Adicionar(Livro objeto)
    {
        livros.add(objeto);
    }

    @Override
    public void Remover(Livro objeto)
    {

    }
}
