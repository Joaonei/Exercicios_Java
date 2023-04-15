package AreaCircunferencia;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        final double pi = 3.14;
        System.out.println("VALOR DO RAIO?");
        try {
            double raio = Double.parseDouble(teclado.next());
            final double area = pi * Math.pow(raio,2);
            System.out.printf("A AREA É %.2f m2", area);
        } catch (NumberFormatException e) {
            System.out.println("Entrada inválida: " + e.getMessage());
        }
    teclado.close();
    }
}







