package Controller;

import Model.Categoria;
import Model.Livro;

import java.time.LocalDate;

public class CriarLivro
{
    public static Livro gerarLivro(String titulo, int ano, Categoria categoria, String review,
                                   int avaliacao, LocalDate data, String autor, String editora,
                                   String ISBN, boolean tem_exemplar)
    {
        return new Livro(titulo, ano, categoria, review, avaliacao, data, autor, editora, ISBN, tem_exemplar);
    }
}
