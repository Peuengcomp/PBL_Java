package View.Principais;

import Model.Entidades.Categoria;

import java.util.ArrayList;

public class RepositorioCategorias
{
    private static RepositorioCategorias instancia;
    private static ArrayList<Categoria> categorias;

    private RepositorioCategorias()
    {
        categorias = new ArrayList<Categoria>();
        categorias.add(new Categoria(1, "Ação"));
        categorias.add(new Categoria(2, "Aventura"));
        categorias.add(new Categoria(3, "Comédia"));
        categorias.add(new Categoria(4, "Drama"));
        categorias.add(new Categoria(5, "Ficção Científica"));
        categorias.add(new Categoria(6, "Terror"));
        categorias.add(new Categoria(7, "Romance"));
        categorias.add(new Categoria(8, "Suspense"));
        categorias.add(new Categoria(9, "Mistério"));
        categorias.add(new Categoria(10, "Fantasia"));
        categorias.add(new Categoria(11, "Animação"));
        categorias.add(new Categoria(12, "Documentário"));
        categorias.add(new Categoria(13, "Musical"));
        categorias.add(new Categoria(14, "Guerra"));
        categorias.add(new Categoria(15, "Biografia"));
        categorias.add(new Categoria(16, "Policial"));
        categorias.add(new Categoria(17, "Épico"));
    }

    public static RepositorioCategorias getInstancia()
    {
        if (instancia == null)
            instancia = new RepositorioCategorias();
        return instancia;
    }

    public static ArrayList<Categoria> getCategorias()
    {
        return categorias;
    }
    
    public static Categoria getCategoria(int id)
    {
        return categorias.get(id-1);
    }

}

