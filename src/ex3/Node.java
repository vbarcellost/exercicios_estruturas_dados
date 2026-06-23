package ex3;

public class Node {

    public int valor;
    public Node next;

    public Node(int valor) {
        this.valor = valor;
        this.next = null;
    }

    @Override
    public String toString() {
        return "[" + valor + "]";
    }
}
