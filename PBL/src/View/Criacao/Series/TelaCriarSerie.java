package View.Criacao.Series;

import Controller.CriarSerie;
import Model.Entidades.Categoria;
import View.Criacao.TelaEntradaNomes;
import View.RepositorioCategorias;
import View.TelaMostrarCategorias;

import java.util.ArrayList;
import java.util.Scanner;

public class TelaCriarSerie
{
    public static void fazerTela(Scanner entrada)
    {
        int qtd;
        entrada.nextLine();
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

        System.out.println("Quantos atores e atrizes são?: ");
        qtd = entrada.nextInt();

        entrada.nextLine();

        ArrayList<String> elenco = TelaEntradaNomes.Adicionar(qtd, entrada);

        System.out.println("Ano de encerramento: ");
        int ano_de_encerramento = entrada.nextInt();

        CriarSerie.criarSerie(titulo, ano, categoria, titulo_original, onde_assistir, elenco, ano_de_encerramento, null);

        System.out.println("Cadastro feito com sucesso!");
    }
}
