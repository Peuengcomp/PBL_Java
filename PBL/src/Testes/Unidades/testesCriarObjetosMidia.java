package Testes.Unidades;

import Model.Entidades.Categoria;
import Model.Entidades.Livro;
import View.Principais.RepositorioCategorias;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class testesCriarObjetosMidia
{
    private LocalDate data_livro;
    private LocalDate data_filme;
    private LocalDate data_serie;
    private Categoria categoria_livro;
    private Categoria categoria_filme;
    private Categoria categoria_serie;

    @Before
    public void InicializacaoParaTestes()
    {
        RepositorioCategorias.getInstancia();
        assertNotNull(RepositorioCategorias.getInstancia());

        data_livro = LocalDate.of(2025, 4, 17);
        data_filme = LocalDate.of(2025, 4, 17);
        data_serie = LocalDate.of(2025, 4, 17);

        assertNotNull(data_livro);
        assertNotNull(data_filme);
        assertNotNull(data_serie);

        categoria_livro = RepositorioCategorias.getCategoria(7);
        categoria_filme = RepositorioCategorias.getCategoria(4);
        categoria_serie = RepositorioCategorias.getCategoria(1);

        assertNotNull(categoria_livro);
        assertNotNull(categoria_filme);
        assertNotNull(categoria_serie);

        assertEquals("Romance", categoria_livro.getGenero());
        assertEquals("Drama", categoria_filme.getGenero());
        assertEquals("Ação", categoria_serie.getGenero());
    }

    @Test
    public void CriarObjetoLivro()
    {
        // Este teste cria um objeto Livro e verifica se ele foi criado corretamente.

        assertEquals(17, data_livro.getDayOfMonth());
        assertEquals(4, data_livro.getMonthValue());
        assertEquals(2025, data_livro.getYear());

        Livro livro = new Livro("Torto Arado", 2019, categoria_livro, "Um livro sobre tortos arados",
                5, data_livro, "Itamar Vieira Júnior", "Leya", "9786580309313", false);

        assertNotNull(livro);

        // Os blocos de assert abaixo verificam os métodos e atributos e os get

        assertEquals("Torto Arado", livro.getTitulo());
        assertEquals(2019, livro.getAno());
        assertEquals(livro.getCategoria(), categoria_livro);
        assertEquals("Um livro sobre tortos arados", livro.getReview());
        assertEquals(5, livro.getAvaliacao());
        assertEquals(livro.getData(), data_livro);
        assertEquals("Itamar Vieira Júnior", livro.getAutor());
        assertEquals("Leya", livro.getEditora());
        assertEquals("9786580309313", livro.getISBN());
        assertEquals(false, livro.getTem_exemplar());
        assertEquals("Não", livro.exemplar());
    }
}
