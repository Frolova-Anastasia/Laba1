public class Main {
    public static void main(String[] args) {
        short[] z = new short[8];
        short num1 = 3;
        for (int i = 0; i < z.length; i++) {
            z[i] = num1;
            num1 = (short)(num1 + 2);
        }
        double[] z1 = new double[12];
        double max = 12.0;
        double min = -2.0;
        double range = max - min;
        for (int i = 0; i < z1.length; i++) {
            z1[i] = (Math.random() * range) + min; //расширяем диапазон до -2.0, прибавляя -2.0
        }
        double[][] z2 = new double[8][12];

        for (int i = 0; i < z2.length; i ++) {
            for (int j = 0; j < z2[i].length; j ++){
                double pow1 = Math.pow(Math.cbrt(z1[j]) / 2, 3);
                double pow2 = Math.pow((Math.pow(Math.cos(z1[j]) / 2, 2) + 1) / Math.pow(Math.E, Math.tan(z1[j])), pow1);
                double pow3 = (1-z1[j])/z1[j] - 1./3;
                double exp1 = (Math.pow(Math.tan(z1[j]), pow3) - 1) / 3;
                double exp2 = 1./3 - Math.asin(Math.pow(Math.E, -Math.abs(z1[j])));
                if (z[i] == 11) z2[i][j] = Math.cbrt(Math.log(Math.pow(Math.sin(z1[j]), 2)));
                else if (z[i] == 5 || z[i] == 7 || z[i] == 9 || z[i] ==15) z2[i][j] = Math.tan(Math.sin(z1[j])) + 0.25;
                else z2[i][j] = Math.pow(exp1 * exp2, pow2);
            }
        }
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 12; j++){
                System.out.printf("%.2f", z2[i][j]);
                System.out.print(" ");
            }
        System.out.println();
        }

    }
}