import Model.Repositorios.CatalogoFilmes;
import Model.Repositorios.CatalogoLivros;
import Model.Repositorios.CatalogoSeries;
import View.TelaMenu;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        TelaMenu.fazerTela(entrada);
        CatalogoLivros.getCatalogo().Listar();
    }
}
