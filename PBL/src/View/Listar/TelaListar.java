package View.Listar;

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

            switch (opc)
            {
                case 1:
                    System.out.println("1 - Listar Livros");
                    break;
                case 2:
                    System.out.println("2 - Listar Filmes");
                    break;
                case 3:
                    System.out.println("3 - Listar Séries");
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
