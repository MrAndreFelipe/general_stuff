public class app {

    public static void main(String[] args) {
        Mumbling c1 = new Mumbling();
        Reverse5MoreWords c2 = new Reverse5MoreWords();
        NarcissisticNumber c3 = new NarcissisticNumber();
        BuildTower c4 = new BuildTower();

        System.out.println(c1.accum("ZpglnRxqenU"));
        System.out.println(c2.spinWords("Hey wollef sroirraw hi"));
        System.out.println(c3.isNarcissistic(153));
        c4.towerBuilder(3);


    }

}
