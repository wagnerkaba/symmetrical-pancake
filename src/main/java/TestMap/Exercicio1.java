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


        System.out.println("\nSubstitua a população do estado RN por : 555555");

        popEstados.put("RN", 555555);
        System.out.println(popEstados);



        System.out.println("\nConfira se o estado da Paraíba (PB) está no dicionário, caso não, adicione: PB - 4.039.277: " + popEstados.containsKey("PB"));
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

        Map<String, Integer> treeMap = new TreeMap<>(popEstados);
        //treeMap.putAll(popEstados);
        System.out.println(treeMap);


        System.out.println("\nExiba o estado com o menor população (%s) e seu respectivo valor (%d)");
        Integer min = Collections.min(popEstados.values());
        String menorPopulacao = "";
        Set<Map.Entry<String, Integer>> entries = popEstados.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
                        if (entry.getValue().equals(min)) menorPopulacao = entry.getKey();


        }
        System.out.println(menorPopulacao + " : " + min);



        System.out.println("\nExiba o estado com a maior população (%s) e seu respectivo valor (%d)");
        Integer max = Collections.max(popEstados.values());
        String maiorPopulacao = "";
        Set<Map.Entry<String, Integer>> entries1 = popEstados.entrySet();
        for (Map.Entry<String, Integer> stringIntegerEntry : entries1) {
            if (stringIntegerEntry.getValue().equals(max)) maiorPopulacao = stringIntegerEntry.getKey();

        }
        System.out.println(maiorPopulacao + " : " + max);


        Iterator<Integer> iterator = popEstados.values().iterator();
        Integer soma = 0;
        while (iterator.hasNext()) soma +=iterator.next();




        System.out.println("\nExiba a soma da população desses estados: "  + soma);







        System.out.println("\nExiba a média da população deste dicionário de estados: " + soma / popEstados.size());

        System.out.println("\nRemova os estados com a população menor que 4.000.000: ");

        popEstados.values().removeIf(integer -> integer < 4000000);

        System.out.println(popEstados);



        System.out.println("\nApague o dicionario de estados com suas respectivas populações estimadas: ");
        popEstados.clear();



        System.out.println("\nConfira se a lista está vazia: " + popEstados.isEmpty());




    }

}
