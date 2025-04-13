package Model.Buscar;

import Model.Entidades.Midia;
import java.util.ArrayList;
import java.util.List;

public interface iBuscarMidia
{
    static <T extends Midia> T buscarTitulo(String titulo, ArrayList<T> lista)
    {
        for (T midia : lista)
        {
            if (midia.getTitulo().equals(titulo))
                return midia;
        }
        return null;
    }

    static <T extends Midia> ArrayList<T> buscarAno(int ano, ArrayList<T> lista)
    {
        ArrayList<T> resultado = new ArrayList<>();
        for (T midia : lista)
        {
            if (midia.getAno() == ano)
                resultado.add(midia);
        }
        if (resultado.isEmpty())
            return null;
        return resultado;
    }

    static <T extends Midia> ArrayList<T> buscarCategoria(int id, ArrayList<T> lista)
    {
        ArrayList<T> resultado = new ArrayList<>();
        for (T midia : lista)
        {
            if (midia.getCategoria().getId() == id)
                resultado.add(midia);

        }
        if (resultado.isEmpty())
            return null;
        return resultado;
    }
}
