package Model.Repositorio;

import Model.Serie;

import java.util.List;
import java.util.ArrayList;

public class CatalogoSeries implements iCatalogo<Serie>
{
    private static CatalogoSeries colelecao_serie;
    private List<Serie> series;

    private void CriarCatalogo()
    {
        this.series = new ArrayList<>();
    }

    public CatalogoSeries getColelecao_serie()
    {
        if (colelecao_serie == null)
            colelecao_serie = new CatalogoSeries();
        return colelecao_serie;
    }


    @Override
    public void ListarLivros() {

    }

    @Override
    public void Adicionar(Serie objeto) {

    }

    @Override
    public void Remover(Serie objeto) {

    }
}
