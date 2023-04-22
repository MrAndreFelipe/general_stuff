public class NarcissisticNumber {

    //This code intends to:
    //    1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153
    //    1^4 + 6^4 + 5^4 + 2^4 = 1 + 1296 + 625 + 16 = 1938
    public boolean isNarcissistic(int number) {
        String toString = String.valueOf(number);
        int power = toString.length(), sum = 0;

        for (int i = 0; i < toString.length(); i++) {
            sum += Math.pow(Integer.parseInt(String.valueOf(toString.charAt(i))), power);
        }
        if (number == sum) {
            return true;
        }
        return false;
    }
}
