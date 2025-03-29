package View;

import Controller.iMenus;

import java.util.Scanner;

public class TelaMenu implements iMenus
{
    @Override
    public void fazerTela()
    {
        int opc;
        do
        {
            System.out.println("Bem vindo ao diário cultural: ");
            System.out.println("1 - Criar Midia");
            System.out.println("2 - Buscar Midia");
            System.out.println("3 - Listar Midia");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opcao: ");

            opc = entrada();

            switch (opc)
            {
                case 1:
                    System.out.println("Tela de criação");
                    break;
                case 2:
                    System.out.println("Tela de buscar");
                    break;
                case 3:
                    System.out.println("Tela de listar");
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
