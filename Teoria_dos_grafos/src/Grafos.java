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

    public Grafos(){
        this.vertices = new ArrayList<>();
        this.arestas = new ArrayList<>();
    }


}
