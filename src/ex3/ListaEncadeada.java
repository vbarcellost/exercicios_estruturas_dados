package ex3;

public class ListaEncadeada {

    private Node head;
    private int tamanho;

    public ListaEncadeada() {
        head = null;
        tamanho = 0;
    }

    public void push(Node node) {
        node.next = null;
        if (head == null) {
            head = node;
        } else {
            Node atual = head;
            while (atual.next != null) {
                atual = atual.next;
            }
            atual.next = node;
        }
        tamanho++;
    }

    public Node pop() {
        if (head == null) {
            throw new RuntimeException("Lista vazia! Não é possível fazer pop.");
        }
        Node removido;
        if (head.next == null) {
            removido = head;
            head = null;
        } else {
            Node anterior = null;
            Node atual = head;
            while (atual.next != null) {
                anterior = atual;
                atual = atual.next;
            }
            removido = atual;
            anterior.next = null;
        }
        tamanho--;
        return removido;
    }

    public void insert(int index, Node node) {
        if (index < 0 || index > tamanho) {
            throw new IndexOutOfBoundsException("Índice inválido: " + index);
        }
        node.next = null;
        if (index == 0) {
            node.next = head;
            head = node;
        } else {
            Node atual = head;
            for (int i = 0; i < index - 1; i++) {
                atual = atual.next;
            }
            node.next = atual.next;
            atual.next = node;
        }
        tamanho++;
    }

    public void remove(int index) {
        if (index < 0 || index >= tamanho) {
            throw new IndexOutOfBoundsException("Índice inválido: " + index);
        }
        if (index == 0) {
            head = head.next;
        } else {
            Node atual = head;
            for (int i = 0; i < index - 1; i++) {
                atual = atual.next;
            }
            atual.next = atual.next.next;
        }
        tamanho--;
    }

    public Node elementAt(int index) {
        if (index < 0 || index >= tamanho) {
            throw new IndexOutOfBoundsException("Índice inválido: " + index);
        }
        Node atual = head;
        for (int i = 0; i < index; i++) {
            atual = atual.next;
        }
        return atual;
    }

    public int size() {
        return tamanho;
    }

    public void printList() {
        if (head == null) {
            System.out.println("Lista: []");
            return;
        }
        StringBuilder sb = new StringBuilder("Lista: [");
        Node atual = head;
        while (atual != null) {
            sb.append(atual.valor);
            if (atual.next != null) sb.append(" → ");
            atual = atual.next;
        }
        sb.append("] (tamanho: ").append(tamanho).append(")");
        System.out.println(sb.toString());
    }
}
