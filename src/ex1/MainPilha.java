package ex1;

public class MainPilha {

    public static void main(String[] args) {
        Pilha pilha = new Pilha();

        System.out.println("=== Teste da Pilha ===");
        System.out.println("isEmpty(): " + pilha.isEmpty());

        pilha.push(10);
        pilha.push(20);
        pilha.push(30);
        pilha.push(40);
        pilha.push(50);

        System.out.println(pilha);
        System.out.println("size(): " + pilha.size());
        System.out.println("top(): " + pilha.top());
        System.out.println("pop(): " + pilha.pop());
        System.out.println("pop(): " + pilha.pop());
        System.out.println(pilha);
        System.out.println("size(): " + pilha.size());
        System.out.println("isEmpty(): " + pilha.isEmpty());
    }
}
