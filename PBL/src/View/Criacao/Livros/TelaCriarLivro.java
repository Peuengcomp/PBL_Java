package View.Criacao.Livros;

import Controller.Criar.CriarLivro;
import Model.Entidades.Categoria;
import View.Principais.RepositorioCategorias;
import View.Principais.TelaMostrarCategorias;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TelaCriarLivro
{
    public static <localDate> void fazerTela(Scanner entrada)
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
        int valor = entrada.nextInt();

        entrada.nextLine();

        System.out.println("Faça um review do livro: ");
        String review = entrada.nextLine();

        System.out.println("Avalie de 1 a 5 o livro: ");
        int avaliacao = entrada.nextInt();

        System.out.println("Preencha as informaçõe acerca da data de finalização de leitura do livro:");

        System.out.println("dia: ");
        int dia = entrada.nextInt();

        System.out.println("mẽs: ");
        int mes = entrada.nextInt();

        System.out.println("ano: ");
        int ano_leitura = entrada.nextInt();

        LocalDate data = LocalDate.of(ano_leitura,mes,dia);
        DateTimeFormatter formatar = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        data.format(formatar);

        if (valor == 1)
            tem_exemplar = true;
        else
            tem_exemplar = false;

        CriarLivro.criarLivro(titulo, ano, categoria, autor, editora, ISBN, tem_exemplar, review, avaliacao, data);
        System.out.println("Livro criado com sucesso!");

    }
}
