public class Reverse5MoreWords {
//    This code intends to:
//    spinWords( "Hey fellow warriors" ) => returns "Hey wollef sroirraw"
//    spinWords( "This is a test") => returns "This is a test"
//    spinWords( "This is another test" )=> returns "This is rehtona test"

    public String spinWords(String sentence) {

        String[] words = sentence.split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            if (i != 0) {
                sb.append(" ");
            }
            if (words[i].length() >= 5) {
                String reverse = "";
                for (int j = words[i].length() - 1; j >= 0; j--) {
                    reverse += words[i].charAt(j);
                }
                sb.append(reverse);
            } else {
                sb.append(words[i]);
            }
        }
        return sb.toString();
    }
}
