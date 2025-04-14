package Model.Repositorios;

import Model.Entidades.Livro;

import java.util.ArrayList;
import java.util.Comparator;

public class CatalogoLivros implements iCatalogo<Livro>
{
    private static CatalogoLivros colecao_livros;
    private ArrayList<Livro> livros;

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

    public ArrayList<Livro> getLivros()
    {
        return this.livros;
    }

    @Override
    public boolean ListarOrdenar(boolean ordem)
    {
        if (livros.isEmpty())
        {
            System.out.println("Nenhum livro cadastrado");
            return false;
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
        return true;
    }

    @Override
    public void Adicionar(Livro objeto)
    {
        livros.add(objeto);
    }

}
