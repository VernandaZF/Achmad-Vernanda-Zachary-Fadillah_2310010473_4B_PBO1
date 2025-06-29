package pbo1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Joki[] daftarJoki = new Joki[50];
        int jumlah = 0;

        while (true) {
            try {
                System.out.print("Masukkan jumlah pelanggan: ");
                jumlah = Integer.parseInt(sc.nextLine());
                if (jumlah <= 0) {
                    System.out.println("Jumlah harus lebih dari 0!");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Input harus berupa angka!");
            }
        }

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nData Pelanggan ke-" + (i + 1));
            System.out.print("Username Mobile Legends: ");
            String username = sc.nextLine();

            int tierAwal, tierTujuan;
            while (true) {
                try {
                    System.out.print("Tier Awal (angka): ");
                    tierAwal = Integer.parseInt(sc.nextLine());
                    System.out.print("Tier Tujuan (angka): ");
                    tierTujuan = Integer.parseInt(sc.nextLine());
                    if (tierTujuan <= tierAwal) {
                        System.out.println("Tier tujuan harus lebih tinggi!");
                        continue;
                    }
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Input tier harus berupa angka!");
                }
            }

            int hargaPerTier = 10000;
            System.out.print("Apakah ini joki premium (y/n)? ");
            String premium = sc.nextLine();

            if (premium.equalsIgnoreCase("y")) {
                int bonus = 0;
                while (true) {
                    try {
                        System.out.print("Bonus Winrate (%): ");
                        bonus = Integer.parseInt(sc.nextLine());
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("Bonus harus berupa angka!");
                    }
                }
                daftarJoki[i] = new JokiPremium(username, tierAwal, tierTujuan, hargaPerTier, bonus);
            } else {
                daftarJoki[i] = new Joki(username, tierAwal, tierTujuan, hargaPerTier);
            }
        }

        System.out.println("\n=== Daftar Joki ===");
        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nPelanggan #" + (i + 1));
            daftarJoki[i].tampilkanInfo();
        }

        sc.close();
    }
}
