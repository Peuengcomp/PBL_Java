package Controller.Buscar;

import Model.Entidades.Midia;
import Model.Entidades.MidiaAV;

import java.util.ArrayList;

// Esta classe utiliza-se o tipo genérico T que herda de Midia para realizar a busca.
// Os processos de busca se dão por meio de iteração com a utilização de um loop for.

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

    static <T extends MidiaAV> ArrayList<T> BuscarNomes(String nome, ArrayList<T> lista)
    {
        ArrayList<T> resultado = new ArrayList<>();
        for (T midiaAV : lista)
        {
            for (String nomes : midiaAV.getElenco())
            {
                if (nome.equals(nomes))
                    resultado.add(midiaAV);
            }
        }
        if (resultado.isEmpty())
            return null;
        return resultado;
    }
}
