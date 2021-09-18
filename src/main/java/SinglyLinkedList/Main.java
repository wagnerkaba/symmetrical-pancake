package SinglyLinkedList;

public class Main {
    public static void main(String[] args) {
        ListaEncadeada<String> minhaLista = new ListaEncadeada<>();
        minhaLista.add("1");
        minhaLista.add("2");
        minhaLista.add("três");
        minhaLista.add("4");
        minhaLista.add("true");

        System.out.println("A lista esta vazia? Resposta:" + minhaLista.isEmpty());
        System.out.println("Tamanho da lista:" + minhaLista.size());
        System.out.println(minhaLista.get(3));



    }

}
