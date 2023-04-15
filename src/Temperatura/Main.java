package Temperatura;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite a temperatura em fahrenheit:");
        double f = teclado.nextDouble();
        final int x = 32;
        final double y = 5.0/9.0;
        double cal = (f - x) * y;
        System.out.printf("A temperatura covertida em celcius é %.1f°C ", cal);

        teclado.close();

    }
}
