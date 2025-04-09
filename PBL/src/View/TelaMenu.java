package View;

import View.Buscar.TelaBuscar;
import View.Criacao.TelaCriacao;
import View.Listar.TelaListar;

import java.util.Scanner;

public class TelaMenu
{
    public static void fazerTela(Scanner entrada)
    {
        int opc;
        do
        {
            System.out.println("Bem vindo ao diário cultural: ");
            System.out.println("1 - Criar Midia");
            System.out.println("2 - Buscar Midia");
            System.out.println("3 - Listar Midia");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");

            opc = entrada.nextInt();

            switch (opc)
            {
                case 1:
                    TelaCriacao.fazerTela(entrada);
                    break;
                case 2:
                    TelaBuscar.fazerTela(entrada);
                    break;
                case 3:
                    TelaListar.fazerTela(entrada);
                    break;
                case 4:
                    System.out.println("Sair");
                    break;
                default:
                    System.out.println("Digite uma entrada válida");
            }
        }
        while(opc != 4);
    }
}
