package Desafios;

import java.io.IOException;
import java.util.Scanner;

public class Teste1 {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int a = leitor.nextInt();
        int b = leitor.nextInt();
        int c = leitor.nextInt();
        int d = leitor.nextInt();
        int resultado =  ((a * b) -(c * d));
        System.out.println("DIFERENCA=" + resultado);
    }
}
