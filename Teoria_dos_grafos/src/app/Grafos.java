package app;

import app.Aresta;

import java.util.*;

public class Grafos {
    private List<Aresta> arestas;
    private List<Vertice> vertices;
    private int ordem;
    private int tamanho;
    private boolean direcionado;

    public boolean isDirecionado() {
        return direcionado;
    }
    public void adicionarVertice(Vertice v){
        vertices.add(v);
    }
    public void adicionarAresta(Aresta a){
        arestas.add(a);
    }

    public void setDirecionado(boolean direcionado) {
        this.direcionado = direcionado;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public int getOrdem() {
        return ordem;
    }

    public void setOrdem(int ordem) {
        this.ordem = ordem;
    }


    public List<Vertice> getVertices(){
        return vertices;
    }
    public List<Aresta> getArestas(){
        return arestas;
    }

    public Vertice getVerticePorNome(String nome){
        for(Vertice vec : vertices){
            if (nome == vec.getNome()){
                return vec;
            }
        }
        return null;
    }

    public Grafos(){
        this.vertices = new ArrayList<>();
        this.arestas = new ArrayList<>();
    }

    @Override
    public String toString() {

        StringBuilder nomeVertices = new StringBuilder();
        for (Vertice vertice: vertices){
            nomeVertices.append(vertice.getNome()).append(", ");
        }
        StringBuilder nomeArestas = new StringBuilder();
        for (Aresta aresta: arestas){
            nomeArestas.append(aresta.getNome()).append(", ");
        }

        return " Grafos: \n" +
                "\n arestas: " + nomeArestas +
                ",\n vertices: " + nomeVertices +
                ",\n ordem: " + ordem +
                ",\n tamanho=" + tamanho +
                ",\n direcionado=" + direcionado +
                '}';
    }
}
