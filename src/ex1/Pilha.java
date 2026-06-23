package ex1;

public class Pilha {

    private int[] dados;
    private int topo;
    private static final int CAPACIDADE_INICIAL = 10;

    public Pilha() {
        dados = new int[CAPACIDADE_INICIAL];
        topo = -1;
    }

    public void push(int valor) {
        if (topo == dados.length - 1) {
            redimensionar();
        }
        dados[++topo] = valor;
    }

    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Pilha vazia! Não é possível fazer pop.");
        }
        return dados[topo--];
    }

    public int top() {
        if (isEmpty()) {
            throw new RuntimeException("Pilha vazia! Não é possível fazer top.");
        }
        return dados[topo];
    }

    public boolean isEmpty() {
        return topo == -1;
    }

    public int size() {
        return topo + 1;
    }

    private void redimensionar() {
        int[] novoArray = new int[dados.length * 2];
        for (int i = 0; i < dados.length; i++) {
            novoArray[i] = dados[i];
        }
        dados = novoArray;
    }

    @Override
    public String toString() {
        if (isEmpty()) return "Pilha: []";
        StringBuilder sb = new StringBuilder("Pilha (topo → base): [");
        for (int i = topo; i >= 0; i--) {
            sb.append(dados[i]);
            if (i > 0) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
}
