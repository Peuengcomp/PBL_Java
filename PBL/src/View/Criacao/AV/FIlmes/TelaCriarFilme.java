package View.Criacao.AV.FIlmes;

import Model.Entidades.Categoria;
import Model.Entidades.Filme;
import Model.Repositorios.RepositorioCategorias;
import View.Criacao.AV.TelaEntradaNomes;
import View.Geral.TelaMostrarCategorias;

import java.util.ArrayList;
import java.util.Scanner;

public class TelaCriarFilme
{
    public static void fazerTela(Scanner entrada)
    {
        int qtd;
        System.out.println("Preencha as informações a seguir:");

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

        System.out.println("Quantos diretores são?: ");
        qtd = entrada.nextInt();

        entrada.nextLine();

        ArrayList<String> direcao = TelaEntradaNomes.Adicionar(qtd, entrada);

        System.out.println("Quantos roteiristas são?: ");
        qtd = entrada.nextInt();

        entrada.nextLine();

        ArrayList<String> roteiro = TelaEntradaNomes.Adicionar(qtd, entrada);

        System.out.println("Quantos atores e atrizes são?: ");
        qtd = entrada.nextInt();

        entrada.nextLine();

        ArrayList<String> elenco = TelaEntradaNomes.Adicionar(qtd, entrada);


    }
}
