package Testes.Integracao;

import Model.Entidades.*;
import Model.Repositorios.CatalogoFilmes;
import Model.Repositorios.CatalogoLivros;
import Model.Repositorios.CatalogoSeries;
import org.junit.Before;
import org.junit.Test;


import java.time.LocalDate;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class TestesCatalogos
{
    private Livro livro1;
    private Livro livro2;
    private Filme filme1;
    private Filme filme2;
    private Serie serie1;
    private Serie serie2;

    @Before
    public void InicializarParaTestes()
    {
        // Instâncias para livros

        Categoria categoria_livro1 = new Categoria(7, "Romance");
        Categoria categoria_livro2 = new Categoria(17, "Épico");

        Livro livro1 = new Livro("Grande Sertão: Veredas", 1956, categoria_livro1,
                "Uma obra-prima da literatura brasileira, rica em linguagem e profundidade filosófica.", 5, LocalDate.of(2023, 3, 12),
                "João Guimarães Rosa", "Editora Nova Fronteira", "978-85-209-2162-6", true);

        Livro livro2 = new Livro("A Odisseia", -800, categoria_livro2,
                "Uma das maiores epopeias da antiguidade, repleta de aventuras e simbolismo.", 5, LocalDate.of(2022, 9, 5),
                "Homero", "Editora 34", "978-85-7326-567-9", true);


        // Instâncias para filmes

        Categoria categoria_filme1 = new Categoria(4, "Drama");
        Categoria categoria_filme2 = new Categoria(10, "Fantasia");

        ArrayList<String> elenco1 = new ArrayList<>();
        elenco1.add("Marlon Brando");
        elenco1.add("Al Pacino");
        elenco1.add("James Caan");

        ArrayList<String> roteiro1 = new ArrayList<>();
        roteiro1.add("Mario Puzo");
        roteiro1.add("Francis Ford Coppola");

        ArrayList<String> direcao1 = new ArrayList<>();
        direcao1.add("Francis Ford Coppola");

        Filme filme1 = new Filme(
                "O Poderoso Chefão",
                1972,
                categoria_filme1,
                "Um clássico do cinema, com atuações memoráveis e direção impecável.",
                5,
                LocalDate.of(2022, 10, 1),
                "The Godfather",
                "Amazon Prime Video",
                175,
                elenco1,
                roteiro1,
                direcao1
        );

        ArrayList<String> elenco2 = new ArrayList<>();
        elenco2.add("Elijah Wood");
        elenco2.add("Ian McKellen");
        elenco2.add("Viggo Mortensen");

        ArrayList<String> roteiro2 = new ArrayList<>();
        roteiro2.add("Fran Walsh");
        roteiro2.add("Philippa Boyens");
        roteiro2.add("Peter Jackson");

        ArrayList<String> direcao2 = new ArrayList<>();
        direcao2.add("Peter Jackson");

        Filme filme2 = new Filme(
                "O Senhor dos Anéis: A Sociedade do Anel",
                2001,
                categoria_filme2,
                "Início de uma jornada épica com efeitos visuais marcantes e narrativa envolvente.",
                4,
                LocalDate.of(2023, 1, 15),
                "The Lord of the Rings: The Fellowship of the Ring",
                "HBO Max",
                178,
                elenco2,
                roteiro2,
                direcao2
        );

        // Instâncias para séries

        ArrayList<String> elencoserie1 = new ArrayList<>();
        elencoserie1.add("Bryan Cranston");
        elencoserie1.add("Aaron Paul");
        elencoserie1.add("Anna Gunn");

        ArrayList<Temporada> temporadas1 = new ArrayList<>();

        temporadas1.add(new Temporada(
                1,
                2008,
                7,
                "Começo promissor e envolvente da transformação de Walter White.",
                5,
                LocalDate.of(2022, 3, 15)
        ));

        temporadas1.add(new Temporada(
                2,
                2009,
                13,
                "A trama se aprofunda, personagens crescem e conflitos aumentam.",
                5,
                LocalDate.of(2022, 4, 10)
        ));

        Serie serie1 = new Serie(
                "Breaking Bad",
                2008,
                new Categoria(5, "Drama"),
                "Breaking Bad",
                "Netflix",
                elencoserie1,
                2013,
                temporadas1
        );


        ArrayList<String> elencoserie2 = new ArrayList<>();
        elencoserie2.add("Jennifer Aniston");
        elencoserie2.add("Courteney Cox");
        elencoserie2.add("Lisa Kudrow");
        elencoserie2.add("Matt LeBlanc");
        elencoserie2.add("Matthew Perry");
        elencoserie2.add("David Schwimmer");

        ArrayList<Temporada> temporadas2 = new ArrayList<>();

        temporadas2.add(new Temporada(
                1,
                1994,
                24,
                "Um clássico do humor leve, com início carismático e divertido.",
                4,
                LocalDate.of(2021, 11, 5)
        ));

        temporadas2.add(new Temporada(
                2,
                1995,
                24,
                "Continua no mesmo ritmo, aprofundando relações entre os personagens.",
                4,
                LocalDate.of(2021, 12, 12)
        ));

        Serie serie2 = new Serie(
                "Friends",
                1994,
                new Categoria(8, "Comédia"),
                "Friends",
                "HBO Max",
                elencoserie2,
                2004,
                temporadas2
        );


    }
    @Test
    public void TestarCriarCatalogos()
    {
        CatalogoLivros catalogolivros = CatalogoLivros.getCatalogo();
        assertNotNull(catalogolivros);

        CatalogoFilmes catalogofilmes = CatalogoFilmes.getCatalogo();
        assertNotNull(catalogofilmes);

        CatalogoSeries catalogoseries = CatalogoSeries.getCatalogo();
        assertNotNull(catalogoseries);
    }

    @Test
    public void TesteAdicionarNoCatalogoLivros()
    {
        CatalogoLivros catalogolivros = CatalogoLivros.getCatalogo();
        assertNotNull(catalogolivros);

        catalogolivros.Adicionar(livro1);
        catalogolivros.Adicionar(livro2);

        assertEquals(livro1, catalogolivros.getLivros().get(0));
        assertEquals(livro2, catalogolivros.getLivros().get(1));

        assertEquals(2, catalogolivros.getLivros().size());
    }

    @Test
    public void TesteAdicionarNoCatalogoFilmes()
    {
        CatalogoFilmes catalogofilmes = CatalogoFilmes.getCatalogo();
        assertNotNull(catalogofilmes);

        catalogofilmes.Adicionar(filme1);
        catalogofilmes.Adicionar(filme2);

        assertEquals(filme1, catalogofilmes.getFilmes().get(0));
        assertEquals(filme2, catalogofilmes.getFilmes().get(1));

        assertEquals(2, catalogofilmes.getFilmes().size());
    }

    @Test
    public void TesteAdicionarNoCatalogoSeries()
    {
        CatalogoSeries catalogoseries = CatalogoSeries.getCatalogo();
        assertNotNull(catalogoseries);

        catalogoseries.Adicionar(serie1);
        catalogoseries.Adicionar(serie2);

        assertEquals(serie1, catalogoseries.getSeries().get(0));
        assertEquals(serie2, catalogoseries.getSeries().get(1));

        assertEquals(2, catalogoseries.getSeries().size());
    }
}
