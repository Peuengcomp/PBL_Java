package View.Listar;

import View.Filtrar.iFiltrar;
import Model.Repositorios.CatalogoFilmes;
import Model.Repositorios.CatalogoLivros;
import Model.Repositorios.CatalogoSeries;
import View.Principais.TelaMostrarCategorias;

import java.util.Scanner;

public class TelaListar
{
    public static void fazerTela(Scanner entrada)
    {
        int opc;
        boolean valor = true;
        boolean tem;
        boolean cheio;
        int ano;
        int id_categoria;
        do
        {
            System.out.println("1 - Listar Livros");
            System.out.println("2 - Listar Filmes");
            System.out.println("3 - Listar Séries");
            System.out.println("4 - Voltar");
            System.out.print("Escolha uma opcao: ");

            opc = entrada.nextInt();

            if(opc == 1 || opc == 2 || opc == 3)
            {
                System.out.println("1 - Ordem Crescente de Avaliação");
                System.out.println("2 - Ordem Decrescente de Avaliação");

                System.out.println("Digite a opção desejada:");
                int escolha_ordem = entrada.nextInt();

                if (escolha_ordem == 1)
                    valor = true;
                else if (escolha_ordem == 2)
                    valor = false;
                else
                    valor = true;
            }

            switch (opc)
            {
                case 1:
                    tem = CatalogoLivros.getCatalogo().ListarOrdenar(valor);
                    if (tem == false)
                        continue;
                    else
                    {
                        int escolha = TelaFiltrar.fazerTela(entrada);
                        if (escolha == -1)
                        {
                            continue;
                        } else if (escolha == 1)
                        {
                            System.out.println("Digite o ano:");
                            ano = entrada.nextInt();
                            cheio = iFiltrar.FiltrarPorAno(CatalogoLivros.getCatalogo().getLivros(), ano);
                            if (cheio == false)
                                System.out.println("Não encontrado");
                        } else
                        {
                            System.out.println("Digite a categoria:");
                            TelaMostrarCategorias.MostrarCategorias();
                            System.out.println("Digite o ID da categoria:");
                            id_categoria = entrada.nextInt();
                            cheio = iFiltrar.FiltrarPorCategoria(CatalogoLivros.getCatalogo().getLivros(), id_categoria);
                            if (cheio == false)
                                System.out.println("Não encontrado");
                        }
                    }

                    break;
                case 2:
                    tem = CatalogoFilmes.getCatalogo().ListarOrdenar(valor);
                    if (tem == false)
                        continue;
                    else
                    {
                        int escolha = TelaFiltrar.fazerTela(entrada);
                        if (escolha == -1) {
                            continue;
                        } else if (escolha == 1) {
                            System.out.println("Digite o ano:");
                            ano = entrada.nextInt();
                            cheio = iFiltrar.FiltrarPorAno(CatalogoFilmes.getCatalogo().getFilmes(), ano);
                            if (cheio == false)
                                System.out.println("Não encontrado");
                        } else {
                            System.out.println("Digite a categoria:");
                            TelaMostrarCategorias.MostrarCategorias();
                            id_categoria = entrada.nextInt();
                            cheio = iFiltrar.FiltrarPorCategoria(CatalogoFilmes.getCatalogo().getFilmes(), id_categoria);
                            if (cheio == false)
                                System.out.println("Não encontrado");
                        }
                    }
                    break;
                case 3:
                    tem = CatalogoSeries.getCatalogo().ListarOrdenar(valor);
                    if (tem == false)
                        continue;
                    else
                    {
                        int escolha = TelaFiltrar.fazerTela(entrada);
                        if (escolha == -1) {
                            continue;
                        } else if (escolha == 1) {
                            System.out.println("Digite o ano:");
                            ano = entrada.nextInt();
                            cheio = iFiltrar.FiltrarPorAno(CatalogoSeries.getCatalogo().getSeries(), ano);
                            if (cheio == false)
                                System.out.println("Não encontrado");
                        } else {
                            System.out.println("Digite a categoria:");
                            TelaMostrarCategorias.MostrarCategorias();
                            id_categoria = entrada.nextInt();
                            cheio = iFiltrar.FiltrarPorCategoria(CatalogoSeries.getCatalogo().getSeries(), id_categoria);
                            if (cheio == false)
                                System.out.println("Não encontrado");
                        }
                    }

                    break;
                case 4:
                    System.out.println("Voltando...");
                    break;
                default:
                    System.out.println("Digite uma entrada válida");
            }
        }
        while(opc != 4);
    }
}
