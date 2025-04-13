package View.Buscar;

import Controller.Buscar.iBuscarMidia;
import Controller.Buscar.BuscarFilme;
import Model.Entidades.Filme;
import Model.Repositorios.CatalogoFilmes;
import View.Principais.RepositorioCategorias;
import View.Principais.TelaMostrarCategorias;

import java.util.ArrayList;
import java.util.Scanner;

public class TelaBuscarFilme
{
    public static void fazerTela(Scanner entrada)
    {
        int opc;
        do
        {
            System.out.println("Digite a opção desejada:");
            System.out.println("1 - Buscar por título");
            System.out.println("2 - Buscar por gênero");
            System.out.println("3 - Buscar por ano");
            System.out.println("4 - Buscar por diretor");
            System.out.println("5 - Buscar por ator");
            System.out.println("6 - Voltar");

            opc = entrada.nextInt();

            switch (opc)
            {
                case 1:
                    System.out.println("Digite o título:");
                    String titulo = entrada.nextLine();
                    Filme filme = iBuscarMidia.buscarTitulo(titulo, CatalogoFilmes.getCatalogo().getFilmes());

                    if (filme != null)
                        System.out.println(filme.toString());
                    else
                        System.out.println("Livro não encontrado!");

                    break;

                case 2:
                    System.out.println("Digite o gênero: ");
                    TelaMostrarCategorias.MostrarCategorias();
                    System.out.println("Digite o ID da categoria desejada: ");
                    int id = entrada.nextInt();
                    RepositorioCategorias.getCategoria(id);
                    ArrayList<Filme> filmes = iBuscarMidia.buscarCategoria(id, CatalogoFilmes.getCatalogo().getFilmes());

                    if (filmes == null)
                        System.out.println("Nenhum livro encontrado!");
                    else
                        for (Filme f : filmes)
                        {
                            System.out.println(filmes.toString());
                        }
                    break;

                case 3:
                    System.out.println("Digite o ano: ");
                    int ano = entrada.nextInt();

                    ArrayList<Filme> filmes_ano = iBuscarMidia.buscarAno(ano, CatalogoFilmes.getCatalogo().getFilmes());

                    if (filmes_ano == null)
                        System.out.println("Nenhum livro encontrado!");
                    else
                        for (Filme f : filmes_ano)
                        {
                            System.out.println(f.toString());
                        }
                    break;
                case 4:
                    System.out.println("Digite o diretor: ");
                    String diretor = entrada.nextLine();

                    ArrayList<Filme> filmes_diretor = BuscarFilme.buscarDiretor(diretor, CatalogoFilmes.getCatalogo().getFilmes());

                    if (filmes_diretor == null)
                        System.out.println("Nenhum filme encontrado!");
                    else
                        for (Filme f : filmes_diretor)
                        {
                            System.out.println(f.toString());
                        }
                    break;
                case 5:
                    System.out.println("Digite o ator");
                    String elenco = entrada.nextLine();

                    ArrayList<Filme> filmes_elenco = iBuscarMidia.BuscarNomes(elenco, CatalogoFilmes.getCatalogo().getFilmes());

                    if (filmes_elenco == null)
                        System.out.println("Nenhum filme encontrado!");
                    else
                        for (Filme f : filmes_elenco)
                        {
                            System.out.println(f.toString());
                        }
                    break;

                case 6:
                    System.out.println("Voltando...");
                    break;
            }
        }
        while (opc != 6);

    }
}

