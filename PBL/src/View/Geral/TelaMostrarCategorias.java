package View.Geral;

import Model.Categoria;
import Model.Repositorio.Categorias;

import java.util.ArrayList;

public class TelaMostrarCategorias
{
    public static void MostrarCategorias()
    {
        Categorias lista = Categorias.getInstancia();
        ArrayList<Categoria> categorias = lista.getCategorias();
        for (Categoria genero : categorias)
        {
            System.out.println(genero.toString());
        }
    }
}
