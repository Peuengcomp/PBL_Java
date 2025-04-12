package Model.Repositorios;

public interface iCatalogo<T>
{
    void ListarOrdenar(boolean ordem);
    void Adicionar(T objeto);
}
