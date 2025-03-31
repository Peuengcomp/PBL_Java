package Model.Buscar;

import Model.Entidades.Midia;

import java.util.ArrayList;

public interface iBuscarMidia<T extends Midia>
{

    default T buscarTitulo(ArrayList<T> lista, String titulo)
    {
        for (T midia : lista)
        {
            if (midia.getTitulo().equals(titulo))
                return midia;
        }
        return null;
    }

    default ArrayList<T> buscarAno(ArrayList<T> lista, int ano)
    {
        ArrayList<T> lista_ano = new ArrayList<>();
        for (T midia : lista)
        {
            if (midia.getAno() == ano)
                lista_ano.add(midia);
        }
        if (!lista.isEmpty())
            return lista_ano;
        else
            return null;
    }

    default ArrayList<T> buscarCategoria(ArrayList<T> lista, int categoria)
    {
        ArrayList<T> lista_categoria = new ArrayList<>();
        for (T midia : lista)
        {
            if (midia.getCategoria().getId() == categoria)
                lista_categoria.add(midia);

        }
        if (!lista_categoria.isEmpty())
            return lista_categoria;
        return null;
    }

}
