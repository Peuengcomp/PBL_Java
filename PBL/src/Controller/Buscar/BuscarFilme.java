package Controller.Buscar;

import Model.Entidades.Filme;

import java.util.ArrayList;

// Esta classe tem como objetivo buscar um filme pelo seu diretor, como manda os requisitos do problema.
// O processo de busca é feito por meio de um loop for.

public class BuscarFilme
{
    public static ArrayList<Filme> buscarDiretor(String diretor, ArrayList<Filme> lista)
    {
        ArrayList<Filme> resultado = new ArrayList<>();
        for (Filme f : lista)
        {
            for (String d : f.getDirecao())
                if (d.equals(diretor))
                    resultado.add(f);
        }
        if (resultado.isEmpty())
            return null;
        return resultado;
    }
}
