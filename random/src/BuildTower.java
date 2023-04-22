public class BuildTower {

// This code intennds to:
//
//        [
//        "     *     ", 5 spaces
//        "    ***    ", 4 spaces
//        "   *****   ", 3 spaces
//        "  *******  ", 2 spaces
//        " ********* ", 1 space
//        "***********"
//        ]
//        [
//         "  *  ", 2 spaces
//         " *** ", 1 space
//         "*****"
//        ]

    public String[] towerBuilder(int nFloors) {

        String tower[] = new String[nFloors];
        String aux = "";
        for (int i = 0; i <= nFloors; i++) {
            if (i < nFloors) {
                aux += spaces(nFloors, i, aux);
            }
            for (int j = 0; j <= nFloors - (i + 2); j++) {
                aux += "*";
            }
            if (i < nFloors) {
                spaces(nFloors, i, aux);
                aux += spaces(nFloors, i, aux);
            }
            tower[i] = aux;
            aux = "";
        }

        return new String[]{" "};
    }

    public String spaces(int nFloors, int decrement, String aux) {
        String aux2 = aux;
        int spaces = nFloors - decrement;
        for (int i = 0; i <= spaces; i++) {
            aux2 += " ";
        }

        return aux2;
    }
}
