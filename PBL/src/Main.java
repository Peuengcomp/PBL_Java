import Model.Repositorios.CatalogoFilmes;
import Model.Repositorios.CatalogoLivros;
import Model.Repositorios.CatalogoSeries;
import View.Criacao.Series.TelaCriarSerie;
import View.TelaMenu;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        TelaCriarSerie.fazerTela(entrada);
        CatalogoSeries.getCatalogo().Listar();
    }
}
