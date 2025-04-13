package View.Buscar;

import Model.Buscar.BuscarLivro;
import Model.Buscar.iBuscarMidia;
import Model.Entidades.Livro;
import Model.Repositorios.CatalogoLivros;
import View.Principais.RepositorioCategorias;
import View.Principais.TelaMostrarCategorias;

import java.util.ArrayList;
import java.util.Scanner;

public class TelaBuscarLivro
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
            System.out.println("4 - Buscar por autor");
            System.out.println("5 - Buscar por ISBN");
            System.out.println("6 - Voltar");
            System.out.print("Escolha uma opcao: ");

            opc = entrada.nextInt();
            entrada.nextLine();

            switch (opc)
            {
                case 1:
                    System.out.println("Digite o título:");
                    String titulo = entrada.nextLine();
                    Livro livro = iBuscarMidia.buscarTitulo(titulo, CatalogoLivros.getCatalogo().getLivros());

                    if (livro != null)
                        System.out.println(livro.toString());
                    else
                        System.out.println("Livro não encontrado!");

                    break;

                case 2:
                    System.out.println("Digite o gênero: ");
                    TelaMostrarCategorias.MostrarCategorias();
                    System.out.println("Digite o ID da categoria desejada: ");
                    int id = entrada.nextInt();
                    RepositorioCategorias.getCategoria(id);
                    ArrayList<Livro> livros = iBuscarMidia.buscarCategoria(id, CatalogoLivros.getCatalogo().getLivros());

                    if (livros == null)
                        System.out.println("Nenhum livro encontrado!");
                    else
                        for (Livro l : livros)
                        {
                            System.out.println(l.toString());
                        }
                    break;

                case 3:
                    System.out.println("Digite o ano: ");
                    int ano = entrada.nextInt();

                    ArrayList<Livro> livros_ano = iBuscarMidia.buscarAno(ano, CatalogoLivros.getCatalogo().getLivros());

                    if (livros_ano == null)
                        System.out.println("Nenhum livro encontrado!");
                    else
                        for (Livro l : livros_ano)
                        {
                            System.out.println(l.toString());
                        }
                    break;

                case 4:
                    System.out.println("Digite o autor: ");
                    String autor = entrada.nextLine();

                    ArrayList<Livro> livros_autor = BuscarLivro.buscarAutor(autor);
                    if (livros_autor == null)
                        System.out.println("Nenhum livro encontrado!");
                    else
                        for (Livro l : livros_autor)
                        {
                            System.out.println(l.toString());
                        }
                    break;

                case 5:
                    System.out.println("Digite o ISBN: ");
                    String isbn = entrada.nextLine();

                    Livro livro_isbn = BuscarLivro.buscarISBN(isbn);
                    if (livro_isbn == null)
                        System.out.println("Nenhum livro encontrado!");
                    else
                        System.out.println(livro_isbn.toString());
                    break;

                case 6:
                    System.out.println("Voltando...");
                    break;

                default:
                    System.out.println("Digite uma entrada válida");
            }
        }
        while(opc != 6);
    }
}
