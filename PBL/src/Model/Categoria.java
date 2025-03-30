package Model;

public class Categoria
{
    private int id;
    private String categoria;

    public Categoria(int id, String categoria)
    {
        this.id = id;
        this.categoria = categoria;
    }

    public String toString()
    {
        return id + " - " + categoria;
    }

    public int getId()
    {
        return id;
    }
    public String getCategoria()
    {
        return categoria;
    }
}
