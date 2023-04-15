package desafio_aritimedico;

public class Main {
    public static void main(String[] args) {
        double cal1 = 6*(3+2);
        double pow1 = Math.pow(cal1, 2);
        double divide1 = pow1 / (3*2);
        System.out.println(divide1);

        double cal2 = (1-5)*(2-7);
        double divide2 = cal2 / 2;
        double pow2 = Math.pow(divide2,2);
        System.out.println(pow2);

        double cal3 = divide1 - pow2;
        double pow3 = Math.pow(cal3,3);
        double cal4 = 10;
        double pow4 = Math.pow(cal4,3);

        double res = pow3/pow4;
        System.out.println(res);
    }

}
