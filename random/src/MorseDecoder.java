public class MorseDecoder {

    //In this question we could use a lot of other better strategies. Hashmap, Imports and all that stuff. Probably I did the worst code possible.
    //This code intends to translate morse code
    public String decoder(String code) {

        String[] letters = code.split(" ");
        StringBuilder phrase = new StringBuilder();
        int  counter = 0;
        boolean first = true;
        for (String aux : letters) {


            switch (aux) {

                case (".-") -> phrase.append("A");
                case ("-...") -> phrase.append("B");
                case ("-.-.") -> phrase.append("C");
                case ("-..") -> phrase.append("D");
                case (".") -> phrase.append("E");
                case ("..-.") -> phrase.append("F");
                case ("--.") -> phrase.append("G");
                case ("....") -> phrase.append("H");
                case ("..") -> phrase.append("I");
                case (".---") -> phrase.append("J");
                case ("-.-") -> phrase.append("K");
                case (".-..") -> phrase.append("L");
                case ("--") -> phrase.append("M");
                case ("-.") -> phrase.append("N");
                case ("---") -> phrase.append("O");
                case (".--.") -> phrase.append("P");
                case ("--.-") -> phrase.append("Q");
                case (".-.") -> phrase.append("R");
                case ("...") -> phrase.append("S");
                case ("-") -> phrase.append("T");
                case ("..-") -> phrase.append("U");
                case ("...-") -> phrase.append("V");
                case (".--") -> phrase.append("W");
                case ("-..-") -> phrase.append("X");
                case ("-.--") -> phrase.append("Y");
                case ("--..") -> phrase.append("Z");
                case("...---...") -> phrase.append("SOS");
                case("-.-.--")-> phrase.append("!");
                case(".-.-.-")-> phrase.append(".");



            }


            if (aux.isBlank()) {
                counter++;
                if (counter == 2 && !first) {
                    phrase.append(" ");
                    counter = 0;
                }
            }else{
                counter = 0;
                first = false;
            }


        }


        return phrase.toString();
    }



}
