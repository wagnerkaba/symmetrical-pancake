package TestStream;

import java.util.*;
import java.util.stream.Collectors;

public class NumerosAleatorios {

    public static void main(String[] args) {
        List<String> numerosAleatorios =
                Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");

        System.out.println("\nIgnore os 3 primeiros elementos da lista e imprima o restante:");
        numerosAleatorios
                .stream()
                .skip(3)
                .forEach(System.out::println);


        System.out.println("\nRetirando os números repetidos da lista, quantos números ficam? ");
        long count = numerosAleatorios
                .stream()
                .distinct()
                .count();

        System.out.println("Resposta:" + count);


        System.out.print("\nMostre o menor valor da lista: ");

        numerosAleatorios
                .stream()
                .mapToInt(Integer::parseInt)
                .min()
                .ifPresent(System.out::println);

        System.out.print("\nMostre o maior valor da lista: ");

        numerosAleatorios
                .stream()
                .mapToInt(Integer::parseInt)
                .max()
                .ifPresent(System.out::println);



        System.out.println("\nPegue apenas os números ímpares e some: ");
        int sum = numerosAleatorios
                .stream()
                .mapToInt(Integer::parseInt)
                .filter(i -> (i % 2 != 0))
                .sum();
        System.out.println(sum);

        System.out.println("\nMostre a lista na ordem númerica: ");

        List<Integer> listaOrdem = numerosAleatorios
                .stream()
                .sorted()
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        System.out.println(listaOrdem);




        System.out.println("\nAgrupe os valores ímpares múltiplos de 3 ou de 5:");

        numerosAleatorios
                .stream()
                .map(Integer::parseInt)
                .filter(i -> (i % 3 ==0 || i % 5 ==0))
                .forEach(System.out::println);




    }

}
