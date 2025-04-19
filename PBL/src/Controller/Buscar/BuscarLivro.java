package Controller.Buscar;

import Model.Entidades.Livro;
import Model.Repositorios.CatalogoLivros;

import java.util.ArrayList;

// Esta classe tem por finalidade buscar um livro pelo seu autor ou ISBN.
// Utiliza-se um processo de iteração para realizar a busca.

public class BuscarLivro
{
    public static ArrayList<Livro> buscarAutor(String autor)
    {
        ArrayList<Livro> resultado = new ArrayList<>();
        for (Livro livro : CatalogoLivros.getCatalogo().getLivros())
        {
            if (livro.getAutor().equals(autor))
                resultado.add(livro);

        }
        if (resultado.isEmpty())
            return null;
        return resultado;

    }

    public static Livro buscarISBN(String ISBN)
    {
        for (Livro livro : CatalogoLivros.getCatalogo().getLivros())
        {
            if (livro.getISBN().equals(ISBN))
                return livro;
        }
        return null;
    }
}
