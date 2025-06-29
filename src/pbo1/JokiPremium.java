package pbo1;

public class JokiPremium extends Joki {
    private int bonusWinRate;

    public JokiPremium(String username, int tierAwal, int tierTujuan, int hargaPerTier, int bonusWinRate) {
        super(username, tierAwal, tierTujuan, hargaPerTier);
        this.bonusWinRate = bonusWinRate;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Bonus Winrate : " + bonusWinRate + "%");
    }
}
