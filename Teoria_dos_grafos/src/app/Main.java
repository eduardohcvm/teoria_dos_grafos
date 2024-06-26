package app;

import app.Aresta;
import app.Grafos;

import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Grafos grafo = new Grafos();
        List<Vertice> vertices = null;
        List<Aresta> arestas = null;


        DefinirVertices(grafo);
        DefinirArestas(grafo);
        System.out.println(grafo);
        for (Aresta aresta1 : grafo.getArestas()){
            for (Aresta aresta2 : grafo.getArestas()){
                if (aresta1.getDestino() == aresta2.getOrigem() && aresta1.getOrigem() == aresta2.getDestino()){
                    System.out.println("Grafo é direcionado");
                }
            }
        }

    }

    public static void DefinirVertices(Grafos grafo) {
        Vertice v1 = new Vertice();
        Vertice v2 = new Vertice();
        Vertice v3 = new Vertice();
        Vertice v4 = new Vertice();
        Vertice v5 = new Vertice();

        v1.setNome("1");
        v2.setNome("2");
        v3.setNome("3");
        v4.setNome("4");
        v5.setNome("5");

        for (Vertice vertice : Arrays.asList(v1, v2, v3, v4, v5)) {
            grafo.adicionarVertice(vertice);
        }


    }

    private static void DefinirArestas(Grafos grafo) {
        Aresta a1 = new Aresta("a1");
        a1.setOrigem(grafo.getVerticePorNome("2"));
        a1.setDestino(grafo.getVerticePorNome("1"));
        Aresta a2 = new Aresta("a2");
        a2.setOrigem(grafo.getVerticePorNome("4"));
        a2.setDestino(grafo.getVerticePorNome("2"));
        Aresta a3 = new Aresta("a3");
        a3.setOrigem(grafo.getVerticePorNome("1"));
        a3.setDestino(grafo.getVerticePorNome("3"));
        Aresta a4 = new Aresta("a4");
        a4.setOrigem(grafo.getVerticePorNome("4"));
        a4.setDestino(grafo.getVerticePorNome("5"));

        for (Aresta aresta : Arrays.asList(a1, a2, a3, a4)) {
            grafo.adicionarAresta(aresta);
        }

    }

}

