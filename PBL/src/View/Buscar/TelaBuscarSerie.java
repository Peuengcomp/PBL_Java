package View.Buscar;

import Controller.Buscar.iBuscarMidia;
import Model.Entidades.Serie;
import Model.Repositorios.CatalogoSeries;
import View.Principais.RepositorioCategorias;
import View.Principais.TelaMostrarCategorias;

import java.util.ArrayList;
import java.util.Scanner;

public class TelaBuscarSerie {
    public static void fazerTela(Scanner entrada) {
        int opc;
        do
        {
            System.out.println("Digite a opção desejada:");
            System.out.println("1 - Buscar por título");
            System.out.println("2 - Buscar por gênero");
            System.out.println("3 - Buscar por ano");
            System.out.println("4 - Buscar por ator");
            System.out.println("5 - Voltar");

            opc = entrada.nextInt();
            entrada.nextLine();

            switch (opc) {
                case 1:
                    System.out.println("Digite o título:");
                    String titulo = entrada.nextLine();
                    Serie serie = iBuscarMidia.buscarTitulo(titulo, CatalogoSeries.getCatalogo().getSeries());

                    if (serie != null)
                        System.out.println(serie.toString());
                    else
                        System.out.println("Nenhuma série encontrada!");

                    break;

                case 2:
                    System.out.println("Digite o gênero: ");
                    TelaMostrarCategorias.MostrarCategorias();
                    System.out.println("Digite o ID da categoria desejada: ");
                    int id = entrada.nextInt();
                    RepositorioCategorias.getCategoria(id);
                    ArrayList<Serie> series = iBuscarMidia.buscarCategoria(id, CatalogoSeries.getCatalogo().getSeries());

                    if (series == null)
                        System.out.println("Nenhuma série encontrada!");
                    else
                        for (Serie s : series) {
                            System.out.println(series.toString());
                        }
                    break;

                case 3:
                    System.out.println("Digite o ano: ");
                    int ano = entrada.nextInt();

                    ArrayList<Serie> series_ano = iBuscarMidia.buscarAno(ano, CatalogoSeries.getCatalogo().getSeries());

                    if (series_ano == null)
                        System.out.println("Nenhuma serie encontrada!");
                    else
                        for (Serie s : series_ano) {
                            System.out.println(s.toString());
                        }
                    break;
                case 4:
                    System.out.println("Digite o ator: ");
                    String elenco = entrada.nextLine();
                    ArrayList<Serie> series_elenco = iBuscarMidia.BuscarNomes(elenco, CatalogoSeries.getCatalogo().getSeries());
                    if (series_elenco == null)
                        System.out.println("Nenhum ator encontrado!");
                    else
                        for (Serie s : series_elenco) {
                            System.out.println(s.toString());
                        }
                    break;
            }
        }
        while (opc != 5);
    }
}