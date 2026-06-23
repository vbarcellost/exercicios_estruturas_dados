package ex2;

public class Fila {

    private int[] dados;
    private int frente;
    private int fim;
    private int tamanho;
    private static final int CAPACIDADE_INICIAL = 10;

    public Fila() {
        dados = new int[CAPACIDADE_INICIAL];
        frente = 0;
        fim = 0;
        tamanho = 0;
    }

    public void enqueue(int valor) {
        if (tamanho == dados.length) {
            redimensionar();
        }
        dados[fim] = valor;
        fim = (fim + 1) % dados.length;
        tamanho++;
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Fila vazia! Não é possível fazer dequeue.");
        }
        int valor = dados[frente];
        frente = (frente + 1) % dados.length;
        tamanho--;
        return valor;
    }

    public int rear() {
        if (isEmpty()) {
            throw new RuntimeException("Fila vazia!");
        }
        int indice = (fim - 1 + dados.length) % dados.length;
        return dados[indice];
    }

    public int front() {
        if (isEmpty()) {
            throw new RuntimeException("Fila vazia!");
        }
        return dados[frente];
    }

    public int size() {
        return tamanho;
    }

    public boolean isEmpty() {
        return tamanho == 0;
    }

    private void redimensionar() {
        int[] novoArray = new int[dados.length * 2];
        for (int i = 0; i < tamanho; i++) {
            novoArray[i] = dados[(frente + i) % dados.length];
        }
        frente = 0;
        fim = tamanho;
        dados = novoArray;
    }

    @Override
    public String toString() {
        if (isEmpty()) return "Fila: []";
        StringBuilder sb = new StringBuilder("Fila (frente → fim): [");
        for (int i = 0; i < tamanho; i++) {
            sb.append(dados[(frente + i) % dados.length]);
            if (i < tamanho - 1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
}
