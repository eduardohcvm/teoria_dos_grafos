import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Grafos grafo = new Grafos();
        List<Vertice> vertices = null;
        List<Aresta> arestas = null;


        DefinirVertices(grafo);
        DefinirArestas(grafo);

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

        for (Vertice vertice : grafo.getVertices()) {
            System.out.println( vertice.getNome());
        }

    }

    private static void DefinirArestas(Grafos grafo) {
        Aresta a1 = new Aresta("a1");
        a1.setOrigem(grafo.getVerticePorNome("2"));
        a1.setDestino(grafo.getVerticePorNome("1"));
        Aresta a2 = new Aresta("a2");
        a1.setOrigem(grafo.getVerticePorNome("4"));
        a1.setDestino(grafo.getVerticePorNome("2"));
        Aresta a3 = new Aresta("a3");
        a1.setOrigem(grafo.getVerticePorNome("1"));
        a1.setDestino(grafo.getVerticePorNome("3"));
        Aresta a4 = new Aresta("a4");
        a1.setOrigem(grafo.getVerticePorNome("4"));
        a1.setDestino(grafo.getVerticePorNome("5"));

        for (Aresta aresta : Arrays.asList(a1, a2, a3, a4)) {
            grafo.adicionarAresta(aresta);
        }
        for (Aresta aresta : grafo.getArestas()){
            System.out.println(aresta.getNome());
            System.out.println(aresta.getOrigem());
            System.out.println(aresta.getDestino());
        }
    }

}

