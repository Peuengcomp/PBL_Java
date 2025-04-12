import Controller.CriarLivro;
import Model.Entidades.Categoria;
import Model.Entidades.Livro;
import View.Principais.TelaMenu;

import java.time.LocalDate;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        TelaMenu.fazerTela(entrada);
        entrada.close();
    }
}
