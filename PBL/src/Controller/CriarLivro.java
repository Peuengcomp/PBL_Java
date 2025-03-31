package Controller;

import Model.Entidades.Categoria;
import Model.Entidades.Livro;
import Model.Repositorios.CatalogoLivros;

public class CriarLivro
{
    public static void criarLivro(String titulo, int ano, Categoria categoria,
                                   String autor, String editora,
                                   String ISBN, boolean tem_exemplar)
    {
        Livro livro = new Livro(titulo, ano, categoria, null, 0, null, autor, editora, ISBN, tem_exemplar);
        CatalogoLivros.getCatalogo().Adicionar(livro);
    }
}
