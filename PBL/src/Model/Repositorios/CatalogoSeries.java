package Model.Repositorios;

import Model.Entidades.Livro;
import Model.Entidades.Serie;

import java.util.List;
import java.util.ArrayList;

public class CatalogoSeries implements iCatalogo<Serie>
{
    private static CatalogoSeries colecao_series;
    private List<Serie> series;

    private CatalogoSeries() {
        CriarCatalogo();
    }

    private void CriarCatalogo() {
        this.series = new ArrayList<>();
    }

    public static CatalogoSeries getCatalogo() {
        if (colecao_series == null) {
            colecao_series = new CatalogoSeries();
        }
        return colecao_series;
    }

    @Override
    public void Listar()
    {

    }

    @Override
    public void Adicionar(Serie objeto)
    {
        series.add(objeto);
    }

    @Override
    public void Remover(Serie objeto)
    {

    }
}
