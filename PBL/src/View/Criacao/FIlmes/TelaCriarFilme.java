package View.Criacao.FIlmes;

import Controller.Criar.CriarFilme;
import Model.Entidades.Categoria;
import View.Principais.RepositorioCategorias;
import View.Criacao.TelaEntradaNomes;
import View.Principais.TelaMostrarCategorias;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class TelaCriarFilme
{
    public static void fazerTela(Scanner entrada)
    {
        int qtd;
        System.out.println("Preencha as informações a seguir:");

        entrada.nextLine();

        System.out.println("Título: ");
        String titulo = entrada.nextLine();

        System.out.println("Ano: ");
        int ano = entrada.nextInt();

        TelaMostrarCategorias.MostrarCategorias();
        System.out.println("Categoria: ");
        Categoria categoria = RepositorioCategorias.getCategoria(entrada.nextInt());

        entrada.nextLine();

        System.out.println("Título original: ");
        String titulo_original = entrada.nextLine();

        System.out.println("Onde Assistir: ");
        String onde_assistir = entrada.nextLine();

        System.out.println("Duraçao em filmes (Em min):");
        int duracao = entrada.nextInt();

        System.out.println("Quantos diretores são: ");
        qtd = entrada.nextInt();

        entrada.nextLine();

        ArrayList<String> direcao = TelaEntradaNomes.Adicionar(qtd, entrada);

        System.out.println("Quantos roteiristas são: ");
        qtd = entrada.nextInt();

        entrada.nextLine();

        ArrayList<String> roteiro = TelaEntradaNomes.Adicionar(qtd, entrada);

        System.out.println("Quantos atores e atrizes são: ");
        qtd = entrada.nextInt();

        entrada.nextLine();

        ArrayList<String> elenco = TelaEntradaNomes.Adicionar(qtd, entrada);

        System.out.println("Faça um review do filme: ");
        String review = entrada.nextLine();

        System.out.println("Avalie de 1 a 5 o filme: ");
        int avaliacao = entrada.nextInt();

        System.out.println("Preencha as informaçõe acerca da data em que viu o filme:");

        System.out.println("dia: ");
        int dia = entrada.nextInt();

        System.out.println("mês: ");
        int mes = entrada.nextInt();

        System.out.println("ano: ");
        int ano_assistido = entrada.nextInt();

        LocalDate data = LocalDate.of(ano_assistido,mes,dia);
        DateTimeFormatter formatar = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        data.format(formatar);

        CriarFilme.CriarFilme(titulo, ano, categoria, titulo_original, duracao, onde_assistir, elenco, roteiro, direcao, review, avaliacao, data);
    }
}
