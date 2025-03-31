package Model.Repositorios;

public interface iCatalogo<T>
{
    void Listar();
    void Adicionar(T objeto);
    void Remover(T objeto);
}
