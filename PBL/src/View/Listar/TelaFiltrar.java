package View.Listar;

import java.util.Scanner;

public class TelaFiltrar
{
    public static int fazerTela(Scanner entrada)
    {
        int opc;
        while (true)
        {
            System.out.println("Deseja filtrar a lista?");
            System.out.println("1 - SIM");
            System.out.println("2 - NÃO");

            opc = entrada.nextInt();

            if (opc == 1)
            {
                while (true)
                {
                    System.out.println("1 - Por Ano");
                    System.out.println("2 - Por Categoria");

                    int escolha = entrada.nextInt();

                    if (escolha == 1)
                        return 1;
                    else if (escolha == 2)
                        return 2;
                    else
                        System.out.println("Digite uma entrada válida");
                }
            }
            else if (opc == 2)
                return -1;
            else
                System.out.println("Digite uma entrada válida");
        }

    }
}
