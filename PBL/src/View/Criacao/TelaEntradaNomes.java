package View.Criacao;

import java.util.ArrayList;
import java.util.Scanner;

public class TelaEntradaNomes
{

    public static ArrayList<String> Adicionar(int qtd, Scanner entrada)
    {
        int k;
        ArrayList<String> nomes = new ArrayList<>();
        for (int i = 0; i < qtd; i++)
        {
            k = i + 1;
            System.out.print("Digite o nome " + k + ": ");
            String nome = entrada.nextLine();
            nomes.add(nome);
        }
        return nomes;
    }
}
