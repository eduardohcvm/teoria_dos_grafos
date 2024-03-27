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

    public static boolean temLoop(Grafos grafo) {
        Set<Vertice> visitados = new HashSet<>();
        Set<Vertice> pilha = new HashSet<>();

        for (Vertice vertice : grafo.getVertices()) {
            if (dfs(vertice, visitados, pilha)) {
                return true;
            }
        }

        return false;
    }
    private static boolean dfs(Vertice vertice, Set<Vertice> visitados, Set<Vertice> pilha) {
        if (pilha.contains(vertice)) {
            return true; // Ciclo encontrado
        }

        if (visitados.contains(vertice)) {
            return false; // Vértice já visitado e sem ciclo
        }

        visitados.add(vertice);
        pilha.add(vertice);

        for (Aresta aresta : vertice.getArestasSaindo()) {
            if (dfs(aresta.getDestino(), visitados, pilha)) {
                return true;
            }
        }

        pilha.remove(vertice);

        return false;
    }

}
