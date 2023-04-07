public class app {

    public static void main(String[] args) {
        random c1 = new random();
        morseDecoder morse = new morseDecoder();

        System.out.println(c1.squareDigits(765));
        System.out.println(morse.decoder("... --- ... !   - .... .   --.- ..- .. -.-. -.-   -... .-. --- .-- -.   ..-. --- -..-   .--- ..- -- .--. ...   --- ...- . .-.   - .... .   .-.. .- --.. -.--   -.. --- --."));
    }

}
