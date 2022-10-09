package math;

import static java.lang.Math.*;

public class Main1 {
    public static void main(String[] args) {
        Double Z;
        Double y;
        for (double x = 0; x <= 5; x += 0.58) {
            System.out.print("При x = " + x + "\t");
            Z = tan(x) + (1 / tan(x)) + pow(tan(x), 2) + pow((1 / tan(x)), 2) +
                    pow(tan(x), 3) + pow((1 / tan(x)), 3);
            if (Z > Z.MAX_VALUE){
                //виключаемо ситуацію коли Z = Infinity буде на екрані
                System.out.println("Z = нескінченно великому числу");
            } else {
                System.out.println("Z = " + Z);
                if (Z == 0) {
                    y = 0.0;
                    System.out.println("y = " + y);
                } else {
                    for (double n = 1; n <= 5; n += 0.5) {
                        System.out.println("При n = " + n + "\t");
                        y = (sqrt(2) * n * pow(0.5, 5 * n / (4 * sqrt(x) - 10)) -
                                pow(16, 1 / (2 * n * (sqrt(x) - 1)))) / Z;
                        //виключаемо ситуацію коли y = -Infinity буде на екрані
                        if(y < y.MIN_VALUE) {
                            System.out.println("Y = нескінченно малому числу");
                        } else {
                            System.out.println("y = " + y);
                        }
                    }
                }
            }
        }
    }
}
