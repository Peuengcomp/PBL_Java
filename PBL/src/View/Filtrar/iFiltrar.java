package View.Filtrar;

import Model.Entidades.Midia;

import java.util.ArrayList;

// Esta interface tem por finalidade filtrar uma lista de objetos de uma determinada classe.
// Usa-se o tipo genérico T que herda de Midia para realizar a filtragem.

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
