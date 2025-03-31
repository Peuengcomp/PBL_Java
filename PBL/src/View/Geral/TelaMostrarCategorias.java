package View.Geral;

import Model.Entidades.Categoria;
import Model.Repositorios.RepositorioCategorias;

import java.util.ArrayList;

public class TelaMostrarCategorias
{
    public static void MostrarCategorias()
    {
        RepositorioCategorias lista = RepositorioCategorias.getInstancia();
        ArrayList<Categoria> categorias = lista.getCategorias();
        for (Categoria genero : categorias)
        {
            System.out.println(genero.toString());
        }
    }
}
