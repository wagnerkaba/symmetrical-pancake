package DoublyLinkedList;


public class Main {
    public static void main(String[] args) {
        ListaDuplamenteEncadeada<String> minhaLista = new ListaDuplamenteEncadeada<>();
        minhaLista.add("teste1");
        minhaLista.add("teste2");
        minhaLista.add("teste3");
        minhaLista.add("teste4");

        System.out.println(minhaLista);

        System.out.println("indice 3:" + minhaLista.get(3)+"\n");

        minhaLista.add(3, "teste5");
        System.out.println(minhaLista);




        minhaLista.add(1,"teste2novo");

        System.out.println(minhaLista);

        minhaLista.add(0,"teste1novo");

        System.out.println(minhaLista);

        minhaLista.add(100,"teste estouro index");

        System.out.println(minhaLista);

        System.out.println("removendo indice 1:" + minhaLista.get(1)+"\n");
        minhaLista.remove(1);
        System.out.println(minhaLista);

        System.out.println("removendo indice 100:" + minhaLista.get(100)+"\n");
        minhaLista.remove(100);
        System.out.println(minhaLista.toStringCompleto());



    }


}
