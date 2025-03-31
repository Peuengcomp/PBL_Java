package View.Criacao.Livros;

import Controller.CriarLivro;
import Model.Entidades.Categoria;
import Model.Entidades.Livro;
import Model.Repositorios.RepositorioCategorias;
import View.Geral.TelaMostrarCategorias;

import java.util.Scanner;

public class TelaCriarLivro
{
    public static void fazerTela(Scanner entrada)
    {
        entrada.nextLine();
        boolean tem_exemplar;
        System.out.println("Preencha as informações a seguir:");

        System.out.println("Título: ");
        String titulo = entrada.nextLine();

        System.out.println("Ano: ");
        int ano = entrada.nextInt();

        TelaMostrarCategorias.MostrarCategorias();
        System.out.println("Categoria: ");
        Categoria categoria = RepositorioCategorias.getCategoria(entrada.nextInt());

        entrada.nextLine();

        System.out.println("Autor: ");
        String autor = entrada.nextLine();

        System.out.println("Editora: ");
        String editora = entrada.nextLine();

        System.out.println("ISBN: ");
        String ISBN = entrada.nextLine();

        System.out.println("tem exemplar?");
        System.out.println("1 - SIM");
        System.out.println("2 - NÃO");
        entrada.nextInt();
        entrada.nextLine();

        if (entrada.nextInt() == 1)
            tem_exemplar = true;
        else
            tem_exemplar = false;

        CriarLivro.criarLivro(titulo, ano, categoria, autor, editora, ISBN, tem_exemplar);

    }
}
