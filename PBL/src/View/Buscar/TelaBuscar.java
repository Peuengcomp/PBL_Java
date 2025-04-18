package View.Buscar;

import java.util.Scanner;

public class TelaBuscar
{
    public static void fazerTela(Scanner entrada)
    {
        int opc;
        do
        {
            System.out.println("1 - Buscar Livro");
            System.out.println("2 - Buscar Filme");
            System.out.println("3 - Buscar Série");
            System.out.println("4 - Voltar");
            System.out.print("Escolha uma opcao: ");

            opc = entrada.nextInt();

            switch (opc)
            {
                case 1:
                    TelaBuscarLivro.fazerTela(entrada);
                    break;
                case 2:
                    TelaBuscarFilme.fazerTela(entrada);
                    break;
                case 3:

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
