package pbo1;

public class Joki {
    private String username;
    private int tierAwal;
    private int tierTujuan;
    private int hargaPerTier;

    // Constructor
    public Joki(String username, int tierAwal, int tierTujuan, int hargaPerTier) {
        this.username = username;
        this.tierAwal = tierAwal;
        this.tierTujuan = tierTujuan;
        this.hargaPerTier = hargaPerTier;
    }

    // Getter
    public String getUsername() {
        return username;
    }

    public int getTierAwal() {
        return tierAwal;
    }

    public int getTierTujuan() {
        return tierTujuan;
    }

    public int getHargaPerTier() {
        return hargaPerTier;
    }

    // Setter
    public void setUsername(String username) {
        this.username = username;
    }

    public void setTierAwal(int tierAwal) {
        this.tierAwal = tierAwal;
    }

    public void setTierTujuan(int tierTujuan) {
        this.tierTujuan = tierTujuan;
    }

    public void setHargaPerTier(int hargaPerTier) {
        this.hargaPerTier = hargaPerTier;
    }

    public int hitungBiaya() {
        return (tierTujuan - tierAwal) * hargaPerTier;
    }

    public void tampilkanInfo() {
        System.out.println("Username     : " + username);
        System.out.println("Tier Awal    : " + tierAwal);
        System.out.println("Tier Tujuan  : " + tierTujuan);
        System.out.println("Harga per Tier: " + hargaPerTier);
        System.out.println("Total Biaya  : " + hitungBiaya());
    }
}
