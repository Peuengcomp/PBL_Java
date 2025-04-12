package Model.Repositorios;

import Model.Entidades.Filme;
import Model.Entidades.Livro;

import java.util.ArrayList;
import java.util.Comparator;
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

    public List<Livro> getLivros()
    {
        return this.livros;
    }

    @Override
    public void ListarOrdenar(boolean ordem)
    {
        if (livros.isEmpty())
        {
            System.out.println("Lista vazia!");
        }
        else
        {
            if (ordem)
                livros.sort(Comparator.comparingInt(Livro::getAvaliacao));
            else
                livros.sort(Comparator.comparingInt(Livro::getAvaliacao).reversed());

            for (Livro livro : livros)
            {
                System.out.println(livro);
            }
        }
    }

    @Override
    public void Adicionar(Livro objeto)
    {
        livros.add(objeto);
    }
}
