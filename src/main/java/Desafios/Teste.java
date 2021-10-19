package Desafios;

import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int inicio = leitor.nextInt();
        int final1 = leitor.nextInt();

        if (inicio >= 0 && final1 <= 2) {
            System.out.println("nova");
        } else if (final1 > inicio && final1 <= 96) {
            System.out.println("crescente"); //implemente o código aqui
        } else if (inicio >= final1 && final1 <= 96) {
            System.out.println("minguante"); //implemente o código aqui
        } else {
            System.out.println("cheia");  //implemente o código aqui
        }
    }

}
