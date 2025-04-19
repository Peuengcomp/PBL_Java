package Controller.Criar;

import Model.Entidades.Categoria;
import Model.Entidades.Livro;
import Model.Repositorios.CatalogoLivros;

import java.time.LocalDate;

// Esta classe tem por finalidade criar um livro e adicionar ao catálogo

public class CriarLivro
{
    public static void criarLivro(String titulo, int ano, Categoria categoria,
                                   String autor, String editora,
                                   String ISBN, boolean tem_exemplar, String review, int avaliacao, LocalDate data)
    {
        Livro livro = new Livro(titulo, ano, categoria, review, avaliacao, data, autor, editora, ISBN, tem_exemplar);
        CatalogoLivros.getCatalogo().Adicionar(livro);
    }
}
