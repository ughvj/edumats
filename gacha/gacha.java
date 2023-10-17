package gacha;

import java.util.Random;

public class gacha {
    private int p_ssr;
    private int p_sr;
    private int p_r;

    private int price;

    private Random r;

    public void description() {
        System.out.println("ガチャマシーンです！確率は、SSR: " + this.p_ssr + "%, SR: " + this.p_sr + "%, R: " + this.p_r + "%");
    }

    public gacha(int p_ssr, int p_sr, int p_r, int price) {
        this.p_ssr = p_ssr;
        this.p_sr = p_sr;
        this.p_r = p_r;
        this.price = price;
        
        this.r = new Random();
    }

    private String one() {
        int choose = this.r.nextInt(100);

        if (choose < p_ssr) {
            return "SSR";
        } else if (choose < p_ssr + p_sr) {
            return "SR";
        } else if (choose < p_ssr + p_sr + p_r) {
            return "R";
        }

        return "N";
    }

    public void draw_10() {
        boolean guarantee = true;

        for (int i=0; i<10; i++) {
            String result = this.one();

            if (result.equals("SSR") || result.equals("SR")) {
                guarantee = false;
            }
            if (i == 9 && guarantee) {
                result = "SR";
            }

            System.out.println(result);
        }

        System.out.println("総額: " + (10 * this.price));
    }

    public void draw_1() {
        System.out.println(this.one());
        System.out.println("総額: " + this.price);
    }
}
