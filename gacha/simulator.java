package gacha;
public class simulator {
    public static void main(String[] args) {
        gacha g1 = new gacha(2, 13, 35, 150);

        gacha g2 = new gacha(1, 8, 16, 300);

        g1.description();
        g1.draw_10();
        
        g2.description();
        g2.draw_10();
    }
}
