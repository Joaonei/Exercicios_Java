package desafio_conversao;

import java.util.Scanner;



public class DesafioConversao {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro salário");
        String sal1 = entrada.nextLine().replace(",",".");

        double s1 = Double.parseDouble(sal1);

        System.out.println("Digite o segundo salário");
        String sal2 = entrada.nextLine().replace(",",".");

        double s2 = Double.parseDouble(sal2);

        System.out.println("Digite o terceiro salário");
        String sal3 = entrada.nextLine().replace(",",".");

        double s3 = Double.parseDouble(sal3);

        double sum = s1 + s2 + s3;

        double media = sum / 3;
        System.out.printf("A soma dos salários é: R$%.2f. /n E a média é: R$%.2f.", sum,media);

        entrada.close();
    }
}