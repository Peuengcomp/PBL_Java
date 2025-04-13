package View.Criacao.Series;

import Controller.Criar.CriarSerie;
import Model.Entidades.Categoria;
import Model.Entidades.Temporada;
import View.Criacao.TelaEntradaNomes;
import View.Principais.RepositorioCategorias;
import View.Principais.TelaMostrarCategorias;

import java.util.ArrayList;
import java.util.Scanner;

public class TelaCriarSerie
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

        System.out.println("Quantos atores e atrizes são: ");
        qtd = entrada.nextInt();

        entrada.nextLine();

        ArrayList<String> elenco = TelaEntradaNomes.Adicionar(qtd, entrada);

        System.out.println("Ano de encerramento: ");
        int ano_de_encerramento = entrada.nextInt();

        ArrayList<Temporada> temporadas = new ArrayList<Temporada>();

        System.out.println("Digite a quantidade de temporadas: ");
        int qtd_temporadas = entrada.nextInt();

        for (int i = 0; i < qtd_temporadas; i++)
        {
            temporadas.add(TelaCriarTemporada.fazerTela(entrada, i+1));
        }

        CriarSerie.criarSerie(titulo, ano, categoria, titulo_original, onde_assistir, elenco, ano_de_encerramento, temporadas);

        System.out.println("Cadastro feito com sucesso!");
    }
}
