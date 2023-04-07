import java.util.Scanner;

public class random {

    public int squareDigits(int n) {

        String toString = String.valueOf(n);
        String aux = "";
        int sum = 0;

        for (int i = 0; i < toString.length(); i++) {
            n = Integer.parseInt(String.valueOf(toString.charAt(i)));
            n = n * n;
            aux += String.valueOf(n);

        }

        sum = Integer.parseInt(aux);

        return sum;
    }

}
