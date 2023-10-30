package uniderp.poo.escola.Repositorio;

import java.util.ArrayList;

import uniderp.poo.escola.FakeDB.AlunoFakeDB;

public abstract class BaseGenericaRepositorio<TDom, TFakeDB> {
    protected AlunoFakeDB db;

    protected ArrayList<TDom> dataset;

    public abstract TDom Create(TDom instancia);

    public abstract TDom Read(int codigo);

    public ArrayList<TDom> ReadAll() {
        return this.dataset;
    }

    public abstract TDom Update(TDom instancia);

    public abstract TDom Delete(int codigo);
}