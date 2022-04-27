package Quersumme;

public class Quersumme {
    public static void main(String[] args) {
        System.out.println(quersumme(1111));

    }

    public static boolean quersumme(int n) {
        Integer number = n;
        Integer result = 0;

        for (int i = 0; i < String.valueOf(n).length(); i++) {
            result += (number % 10);
            number /= 10;
        }

        System.out.println(result);
        return false;
    }
}
