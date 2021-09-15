package TestMap;

import java.util.*;
import java.util.function.Function;


public class Agenda {

    public static void main(String[] args) {

        Map<Integer, Contatos> treeMap = new TreeMap<>(){{

            put(1, new Contatos("Simba", 2222));
            put(4, new Contatos("Cami", 5555));
            put(3, new Contatos("Jon", 1111));
        }};

        System.out.println("Organizar por nome utilizando Comparator");
        Set<Map.Entry<Integer, Contatos>> lista = new TreeSet<>(new NomeComparator());

        lista.addAll(treeMap.entrySet());

        for (Map.Entry<Integer, Contatos> integerContatosEntry : lista) {
            System.out.println(integerContatosEntry.getKey() + ": " + integerContatosEntry.getValue().getNome() + " : " + integerContatosEntry.getValue().getNumero());
        }

        System.out.println("\nOrganizar por numero - utilizando classe anônima");


        Set<Map.Entry<Integer, Contatos>> listaAnon = new TreeSet<>(new Comparator<>() {
            @Override
            public int compare(Map.Entry<Integer, Contatos> o1, Map.Entry<Integer, Contatos> o2) {
                return Integer.compare(o1.getValue().getNumero(), o2.getValue().getNumero());
            }
        });

        listaAnon.addAll(treeMap.entrySet());

        for (Map.Entry<Integer, Contatos> integerContatosEntry : listaAnon) {

            System.out.println(integerContatosEntry.getKey() + ": " + integerContatosEntry.getValue().getNome() + " : " + integerContatosEntry.getValue().getNumero());


        }

        System.out.println("\nOrganizar por numero - utilizando o método Comparator.comparing");


        Set<Map.Entry<Integer, Contatos>> listaAnon1 = new TreeSet<>(Comparator.comparing(new Function<Map.Entry<Integer, Contatos>, Integer>() {
            @Override
            public Integer apply(Map.Entry<Integer, Contatos> integerContatosEntry) {
                return integerContatosEntry.getValue().getNumero();
            }
        }));

        listaAnon1.addAll(treeMap.entrySet());

        for (Map.Entry<Integer, Contatos> integerContatosEntry : listaAnon1) {

            System.out.println(integerContatosEntry.getKey() + ": " + integerContatosEntry.getValue().getNome() + " : " + integerContatosEntry.getValue().getNumero());


        }


        System.out.println("\nOrganizar por numero - utilizando o método Comparator.comparing + lambda");


        Set<Map.Entry<Integer, Contatos>> listaAnon2 = new TreeSet<>(Comparator.comparing(cont -> cont.getValue().getNumero()));

        listaAnon2.addAll(treeMap.entrySet());

        for (Map.Entry<Integer, Contatos> integerContatosEntry : listaAnon2) {
            System.out.println(integerContatosEntry.getKey() + ": " + integerContatosEntry.getValue().getNome() + " : " + integerContatosEntry.getValue().getNumero());
        }

        System.out.println("\nOrganizar por nome utilizando Comparator.comparing + lambda");
        Set<Map.Entry<Integer, Contatos>> listaNome = new TreeSet<>(Comparator.comparing(nome -> nome.getValue().getNome()));
        listaNome.addAll(treeMap.entrySet());

        for (Map.Entry<Integer, Contatos> integerContatosEntry : listaNome) {
            System.out.println(integerContatosEntry.getKey() + ": " + integerContatosEntry.getValue().getNome() + " : " + integerContatosEntry.getValue().getNumero());
        }




    }







}

class Contatos {
    String nome;
    Integer numero;


    public Contatos(String nome, Integer numero) {
        this.nome = nome;
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Contatos{" +
                "nome='" + nome + '\'' +
                ", numero=" + numero +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public Integer getNumero() {
        return numero;
    }
}

class NomeComparator implements Comparator<Map.Entry<Integer,Contatos>>{


    @Override
    public int compare(Map.Entry<Integer, Contatos> o1, Map.Entry<Integer, Contatos> o2) {
        return o1.getValue().getNome().compareToIgnoreCase(o2.getValue().getNome());
    }
}
