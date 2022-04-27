package SumOfNaturalNumbers;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        System.out.println(sumOfNaturalNumbers(10));
        System.out.println(sumOfNaturalNumbers(0));
        System.out.println(sumOfNaturalNumbers(1));
    }

    public static int sumOfNaturalNumbers(int num) {
        if (num == 0) {
            return 0;
        }
        return sumOfNaturalNumbers(num - 1) + num;
    }
}
