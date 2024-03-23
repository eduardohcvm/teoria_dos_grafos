public class Aresta {
    private String nome;
    private Vertice origem;
    private Vertice destino;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Vertice getOrigem() {
        return origem;
    }

    public void setOrigem(Vertice origem) {
        this.origem = origem;
    }

    public Vertice getDestino() {
        return destino;
    }

    public void setDestino(Vertice destino) {
        this.destino = destino;
    }

    public boolean verificaAresta(Aresta aresta, Vertice verticeIN, Vertice verticeOUT){
        return aresta.destino == verticeOUT && aresta.origem == verticeIN;
    }

}
