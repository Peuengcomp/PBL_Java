import View.Criacao.Livros.TelaCriarLivro;
import View.Geral.TelaMenu;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        TelaCriarLivro.fazerTela(entrada);
    }
}
