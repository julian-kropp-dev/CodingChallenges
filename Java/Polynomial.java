public class Polynomial {

    private double[] coefficients;

    public Polynomial(double[] coefficients) {

        this.coefficients = coefficients;

    }

    public String toString(){

        String res = String.valueOf(coefficients[0]);

        for (int i = 0; i < coefficients.length; i++) {
            res += coefficients[i] + "x" + "^" + i +" +";
        }
        return res;
    }

    public double calculate(double x) {
        return Math.pow(x, x);
    }

    public static void main(String[] args) {


    }

}

