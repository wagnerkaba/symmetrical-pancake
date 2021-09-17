package Queue;

public class Main {
    public static void main(String[] args) {
        Fila<String> minhaFila = new Fila<>();
        minhaFila.enqueue("1");
        minhaFila.enqueue("2");
        minhaFila.enqueue("3");
        minhaFila.enqueue("4");


        System.out.println(minhaFila);
        System.out.println(minhaFila.dequeue());
        System.out.println(minhaFila);
        minhaFila.enqueue("ultimo");
        System.out.println(minhaFila);
        System.out.println(minhaFila.first());
        System.out.println(minhaFila);




    }

}
