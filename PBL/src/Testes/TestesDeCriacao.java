package Testes;

import Controller.CriarFilme;
import Controller.CriarLivro;
import Controller.CriarSerie;
import Model.Entidades.Livro;
import Model.Repositorios.CatalogoFilmes;
import Model.Repositorios.CatalogoLivros;
import Model.Repositorios.CatalogoSeries;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class TestesDeCriacao
{
    @Test
    void testeCriarMidia()
    {
        CriarLivro livro = new CriarLivro();
        assertNotNull(livro);
        CriarFilme filme = new CriarFilme();
        assertNotNull(filme);
        CriarSerie serie = new CriarSerie();
        assertNotNull(serie);
    }

    @Test
    void testeCriarRepositorio()
    {
        CatalogoLivros livros = CatalogoLivros.getCatalogo();
        assertNotNull(livros);
        assertEquals(0, livros.getLivros().size());

        CatalogoFilmes filmes = CatalogoFilmes.getCatalogo();
        assertNotNull(filmes);
        assertEquals(0, livros.getLivros().size());

        CatalogoSeries series = CatalogoSeries.getCatalogo();
        assertNotNull(series);
        assertEquals(0, livros.getLivros().size());
    }
}
