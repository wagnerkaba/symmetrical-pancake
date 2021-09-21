package CircularList;

public class Main {
    public static void main(String[] args) {
        ListaCircular<String> minhaLista = new ListaCircular<>();
        System.out.println(minhaLista);

        minhaLista.add("teste1");
        minhaLista.add("teste2");
        minhaLista.add("teste3");
        minhaLista.add("teste4");
        minhaLista.add("teste5");
        System.out.println(minhaLista);

        minhaLista.remove(0);
        System.out.println(minhaLista);

        minhaLista.remove(3);
        System.out.println(minhaLista);

        for(int i =0;i<20;i++){
            System.out.println(minhaLista.get(i));

        }




    }
}
