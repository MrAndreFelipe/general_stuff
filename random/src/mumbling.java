public class mumbling {

    //accum("abcd") -> "A-Bb-Ccc-Dddd"
    //accum("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
    //accum("cwAt") -> "C-Ww-Aaa-Tttt"

    public String accum(String s) {
        int iteration = 0;
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            iteration = 0;
            if (i != 0) {
                sb.append("-");
            }

            while (iteration <= i) {
                if (iteration == 0) {
                    sb.append(Character.toUpperCase(s.charAt(i)));
                } else {
                    sb.append(s.charAt(i));
                }

                iteration++;
            }
        }
        return sb.toString();
    }
}
