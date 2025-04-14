package Model.Repositorios;

import Model.Entidades.Midia;

import java.util.ArrayList;

public interface iCatalogo<T>
{
    boolean ListarOrdenar(boolean ordem);
    void Adicionar(T objeto);
}
