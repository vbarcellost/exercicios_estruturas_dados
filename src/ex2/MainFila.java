package ex2;

public class MainFila {

    public static void main(String[] args) {
        Fila fila = new Fila();

        System.out.println("=== Teste da Fila FIFO ===");
        System.out.println("isEmpty(): " + fila.isEmpty());

        fila.enqueue(2);
        fila.enqueue(6);
        fila.enqueue(9);
        fila.enqueue(1);

        System.out.println(fila);
        System.out.println("size(): " + fila.size());
        System.out.println("front(): " + fila.front());
        System.out.println("rear(): " + fila.rear());
        System.out.println("dequeue(): " + fila.dequeue());
        System.out.println("dequeue(): " + fila.dequeue());
        System.out.println(fila);
        System.out.println("front(): " + fila.front());
        System.out.println("size(): " + fila.size());
        System.out.println("isEmpty(): " + fila.isEmpty());
    }
}
