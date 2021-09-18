package SinglyLinkedList;

public class Main {
    public static void main(String[] args) {
        ListaEncadeada<String> minhaLista = new ListaEncadeada<>();
        minhaLista.add("1");
        minhaLista.add("2");
        minhaLista.add("3");
        minhaLista.add("4");
        minhaLista.add("5");

        System.out.println("A lista esta vazia? Resposta:" + minhaLista.isEmpty());
        System.out.println("Tamanho da lista:" + minhaLista.size());
        System.out.println("resultado get: " + minhaLista.get(0));
        System.out.println(minhaLista);
        System.out.println("Removendo:" + minhaLista.remove(0));
        System.out.println(minhaLista);





    }

}
