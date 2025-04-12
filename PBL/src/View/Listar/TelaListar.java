package View.Listar;

import Model.Repositorios.CatalogoLivros;

import java.util.Scanner;

public class TelaListar
{
    public static void fazerTela(Scanner entrada)
    {
        int opc;
        do
        {
            System.out.println("1 - Listar Livros");
            System.out.println("2 - Listar Filmes");
            System.out.println("3 - Listar Séries");
            System.out.println("4 - Voltar");
            System.out.print("Escolha uma opcao: ");

            opc = entrada.nextInt();
            boolean valor = true;

            if(opc == 1 || opc == 2 || opc == 3)
            {
                System.out.println("1 - Ordem Crescente de Avaliação");
                System.out.println("2 - Ordem Decrescente de Avaliação");

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
                    CatalogoLivros.getCatalogo().ListarOrdenar(valor);
                    break;
                case 2:
                    CatalogoLivros.getCatalogo().ListarOrdenar(valor);
                    break;
                case 3:
                    CatalogoLivros.getCatalogo().ListarOrdenar(valor);
                    break;
                case 4:
                    System.out.println("Voltar");
                    break;
                default:
                    System.out.println("Digite uma entrada válida");
            }
        }
        while(opc != 4);
    }
}
