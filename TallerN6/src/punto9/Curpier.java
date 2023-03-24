package punto9;

import java.util.Random;

public class Curpier {
    private Mano hand = new Mano ("Curpier (computer)");

    public boolean playMano() {
        Random r = new Random();
        boolean condition = r.nextInt(2) == 1 && hand.getScore() < 16;
        boolean response = condition ? true : false;
        System.out.println("Crupier esta pensando... ");
        
        try {
            Thread.sleep(2000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return response;
    }

    public Mano getMano() {
        return hand;
    }

    public void setMano(Mano mano) {
        this.hand = mano;
    }
}