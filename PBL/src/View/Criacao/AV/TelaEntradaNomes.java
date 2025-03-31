package View.Criacao.AV;

import java.util.ArrayList;
import java.util.Scanner;

public class TelaEntradaNomes
{

    public static ArrayList<String> Adicionar(int qtd, Scanner entrada)
    {
        ArrayList<String> nomes = new ArrayList<>();
        for (int i = 0; i < qtd; i++)
        {
            System.out.print("Digite o nome" + i+1 + ": ");
            String nome = entrada.nextLine();
            nomes.add(nome);
        }
        return nomes;
    }
}
