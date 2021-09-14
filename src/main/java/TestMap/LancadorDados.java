package TestMap;

import java.util.*;

public class LancadorDados {
    public static void main(String[] args) {

        Random random = new Random();

        List<Integer> dadosLancados = new ArrayList<>();

        for (int i = 0; i<100; i++) {
            dadosLancados.add(random.nextInt(6)+1);

        }

        Map<Integer,Integer> treeMap = new TreeMap<>();


/*      Integer dados1=0;
        Integer dados2=0;
        Integer dados3=0;
        Integer dados4=0;
        Integer dados5=0;
        Integer dados6=0;

        Iterator<Integer> iterator = dadosLancados.iterator();

        while (iterator.hasNext()){
            switch (iterator.next()) {
                case 1:dados1++;
                    break;

                case 2: dados2++;
                    break;
                case 3:dados3++;
                    break;
                case 4:dados4++;
                    break;
                case 5:dados5++;
                    break;
                case 6:dados6++;
                    break;

            }

        }


        treeMap.put(1,dados1);
        treeMap.put(2,dados2);
        treeMap.put(3,dados3);
        treeMap.put(4,dados4);
        treeMap.put(5,dados5);
        treeMap.put(6,dados6);
        System.out.println(treeMap); */




        for (Integer dadosLancado : dadosLancados) {

            if (treeMap.containsKey(dadosLancado)) treeMap.put(dadosLancado, (treeMap.get(dadosLancado)+1));
            else treeMap.put(dadosLancado, 1);

        }


        for(Map.Entry<Integer, Integer> entry : treeMap.entrySet()){

            System.out.println("valor: " + entry.getKey() + ", quantidade: " + entry.getValue());

        }


    }



}

