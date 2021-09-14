package TestMap;

import java.util.*;

public class Exercicio1 {

    public static void main(String[] args) {

        Map<String, Integer> popEstados = new HashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};

        System.out.println(popEstados);


        System.out.println("Substitua a população do estado RN por : 777");

        popEstados.put("RN", 777);
        System.out.println(popEstados);



        System.out.println("Confira se o estado da Paraíba (PB) está no dicionário, caso não, adicione: PB - 4.039.277: " + popEstados.containsKey("PB"));
        if (!popEstados.containsKey("PB")) popEstados.put("PB", 4039277);
        System.out.println(popEstados);



        System.out.println("\nExiba todos os estados e suas populaçãos na ordem em que foram informados: ");

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);

        }};

        System.out.println(linkedHashMap);




        System.out.println("\nExiba todos os estados e suas populações na ordem alfabética: ");

        System.out.println("Exiba o estado com o menor população (%s) e seu respectivo valor (%d)\n");
        System.out.println("Exiba o estado com a maior população (%s) e seu respectivo valor (%d)\n");

        System.out.println("Exiba a soma da população desses estados: ");

        System.out.println("Exiba a média da população deste dicionário de estados: ");
        System.out.println("Remova os estados com a população menor que 4.000.000: ");


        System.out.println("Apague o dicionario de estados com suas respectivas populações estimadas: ");


        System.out.println("Confira se a lista está vazia: ");




    }

}
