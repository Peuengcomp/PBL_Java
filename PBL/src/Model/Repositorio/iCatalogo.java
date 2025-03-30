package Model.Repositorio;

public interface iCatalogo<T>
{
    void ListarLivros();
    void Adicionar(T objeto);
    void Remover(T objeto);
}
