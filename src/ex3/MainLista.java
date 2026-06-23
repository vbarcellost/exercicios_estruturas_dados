package ex3;

public class MainLista {

    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada();

        System.out.println("=== Teste da Lista Encadeada ===");

        lista.push(new Node(10));
        lista.push(new Node(20));
        lista.push(new Node(30));
        lista.push(new Node(40));
        lista.printList();

        System.out.println("size(): " + lista.size());
        System.out.println("elementAt(0): " + lista.elementAt(0));
        System.out.println("elementAt(2): " + lista.elementAt(2));

        lista.insert(1, new Node(15));
        lista.printList();

        lista.insert(0, new Node(5));
        lista.printList();

        Node removido = lista.pop();
        System.out.println("pop(): " + removido);
        lista.printList();

        lista.remove(0);
        lista.printList();

        lista.remove(2);
        lista.printList();

        System.out.println("size(): " + lista.size());
    }
}
