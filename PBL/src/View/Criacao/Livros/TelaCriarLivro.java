package View.Criacao.Livros;

import Controller.CriarLivro;
import Model.Categoria;
import Model.Livro;
import Model.Repositorio.Categorias;
import View.Geral.TelaMostrarCategorias;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class TelaCriarLivro
{
    public static void fazerTela(Scanner entrada)
    {
        System.out.println("Preencha as informações a seguir");

        System.out.println("Título: ");
        String titulo = entrada.nextLine();

        System.out.println("Ano: ");
        int ano = entrada.nextInt();

        TelaMostrarCategorias.MostrarCategorias();
        System.out.println("Categoria: ");
        Categoria categoria = Categorias.getCategoria(entrada.nextInt());

        entrada.nextLine();

        System.out.println("Autor: ");
        String autor = entrada.nextLine();

        System.out.println("Editora: ");
        String editora = entrada.nextLine();

        System.out.println("ISBN: ");
        String ISBN = entrada.nextLine();

        Livro livro = CriarLivro.gerarLivro(titulo, ano, categoria, null, 0, LocalDate.now(), autor, editora, ISBN, true);
        System.out.println(livro.toString());
    }
}
