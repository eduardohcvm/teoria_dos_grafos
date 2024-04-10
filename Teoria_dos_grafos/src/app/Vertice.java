package app;

import app.Aresta;

import java.util.ArrayList;
import java.util.List;

public class Vertice {
    private String nome;
    private int grau;
    private boolean direcionado;
    private int arestasIn;
    private int arestasOut;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getGrau() {
        return grau;
    }
    public List<Aresta> getArestasSaindo(List<Aresta> todasArestas) {
        List<Aresta> arestasSaindo = new ArrayList<>();
        for (Aresta aresta : todasArestas) {
            if (aresta.getOrigem().equals(this)) {
                arestasSaindo.add(aresta);
            }
        }
        return arestasSaindo;
    }

    public void setGrau(int grau) {
        this.grau = grau;
    }

    public boolean isDirecionado() {
        return direcionado;
    }

    public void setDirecionado(boolean direcionado) {
        this.direcionado = direcionado;
    }

    public int getArestasIn() {
        return arestasIn;
    }

    public void setArestasIn(int arestasIn) {
        this.arestasIn = arestasIn;
    }

    public int getArestasOut() {
        return arestasOut;
    }

    public void setArestasOut(int arestasOut) {
        this.arestasOut = arestasOut;
    }
    Vertice(){
        this.setNome("0");
        this.setArestasIn(0);
        this.setGrau(0);
        this.setDirecionado(true);
        this.setArestasOut(0);
    }
}
