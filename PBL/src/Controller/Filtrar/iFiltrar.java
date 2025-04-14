package Controller.Filtrar;

import Model.Entidades.Midia;

import java.util.ArrayList;

public interface iFiltrar<T>
{
    static <T extends Midia> boolean FiltrarPorAno(ArrayList<T> lista, int ano)
    {
        long contador = lista.stream().filter(objeto -> objeto.getAno() == ano).peek(System.out::println).count();
        if (contador == 0)
            return false;
        return true;
    }

    static <T extends Midia> boolean FiltrarPorCategoria(ArrayList<T> lista, int id)
    {
        long contador = lista.stream().filter(objeto -> objeto.getCategoria().getId() == id).peek(System.out::println).count();
        if (contador == 0)
            return false;
        return true;
    }
}
