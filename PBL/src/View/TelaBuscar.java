package View;

import Controller.iMenus;

public class TelaBuscar implements iMenus
{
    @Override
    public void fazerTela()
    {
        int opc;
        do
        {
            System.out.println("Bem vindo ao diário cultural: ");
            System.out.println("1 - Buscar Livro");
            System.out.println("2 - Buscar Filme");
            System.out.println("3 - Buscar Série");
            System.out.println("4 - Voltar");
            System.out.print("Escolha uma opcao: ");

            opc = entrada();

            switch (opc)
            {
                case 1:
                    System.out.println("Buscar Livro");
                    break;
                case 2:
                    System.out.println("Buscar Filme");
                    break;
                case 3:
                    System.out.println("Buscar Série");
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
