package View.Criacao;

import View.Criacao.Livros.TelaCriarLivro;

import java.util.Scanner;

public class TelaCriacao
{
    public static void fazerTela(Scanner entrada)
    {
        int opc;
        do
        {
            System.out.println("1 - Criar Livro");
            System.out.println("2 - Criar Filme");
            System.out.println("3 - Criar Série");
            System.out.println("4 - Voltar");
            System.out.println("Escolha uma opcao: ");

            opc = entrada.nextInt();

            switch (opc)
            {
                case 1:
                    TelaCriarLivro.fazerTela(entrada);
                    break;
                case 2:
                    System.out.println("Criar Filme");
                    break;
                case 3:
                    System.out.println("Criar Série");
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

