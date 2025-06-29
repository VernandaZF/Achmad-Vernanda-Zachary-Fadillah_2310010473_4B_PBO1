# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data pelanggan jasa joki Mobile Legends menggunakan bahasa Java. Program ini dibuat sebagai tugas akhir dari mata kuliah Pemrograman Berbasis Objek 1.

## Deskripsi

Aplikasi ini menerima input berupa username Mobile Legends, tier awal, tier tujuan, dan jenis layanan (biasa/premium). Kemudian, aplikasi akan menampilkan informasi detail termasuk total biaya joki. Versi premium menambahkan fitur bonus winrate.

Aplikasi ini mengimplementasikan berbagai konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Polymorphism (Overriding), Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Joki`, `JokiPremium`, dan `Main` adalah contoh dari class.

```bash
public class Joki{
    ...
}

public class JokiPremium extends Joki {
    ...
}

public class Main {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, objek dibuat secara dinamis di array:

```bash
daftarJoki[i] = new Joki(...);

```

3. **Atribut** adalah variabel yang menyimpan data dalam class seperti username, tierAwal, tierTujuan, hargaPerTier, dan bonusWinRate.

```bash
private String username;
private int tierAwal;
private int tierTujuan;
private int hargaPerTier;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Joki` dan `JokiPremium`.

```bash
public Joki(String username, int tierAwal, int tierTujuan, int hargaPerTier) {
    ...
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut.
Pada program ini, contoh method mutator terdapat pada class Joki, seperti:

```bash
public void setUsername(String username) {
    this.username = username;
}

public void setTierTujuan(int tierTujuan) {
    this.tierTujuan = tierTujuan;
}
```

6. **Accessor** atau getter digunakan untuk mengambil atau membaca nilai dari suatu atribut.
Pada program ini, method accessor digunakan untuk mengakses nilai seperti username, tierAwal, tierTujuan, dan hargaPerTier. Contohnya adalah:

```bash
public String getUsername() {
    return username;
}

public int getTierTujuan() {
    return tierTujuan;
}
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan menjadikan atribut bersifat private, sehingga hanya bisa diakses dan dimodifikasi melalui method getter dan setter (accessor dan mutator).
```bash
private String username;

public String getUsername() {
    return username;
}

public void setUsername(String username) {
    this.username = username;
}
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, class JokiPremium mewarisi class Joki menggunakan sintaks extends, seperti berikut:

```bash
public class JokiPremium extends Joki {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, polymorphism diterapkan dalam bentuk method overriding.
Class JokiPremium meng-override method tampilkanInfo() yang ada di superclass Joki, agar dapat menambahkan informasi khusus, yaitu bonus winrate.

```bash
@Override
public void tampilkanInfo() {
    super.tampilkanInfo();
    System.out.println("Bonus Winrate : " + bonusWinrate + "%");
}

```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode jasa joki Mobile Legends ini, seleksi digunakan untuk menentukan apakah pelanggan memilih layanan premium atau biasa menggunakan struktur if-else, seperti berikut:

```bash
if (premium.equalsIgnoreCase("y")) {
    // Buat objek JokiPremium
    daftarJoki[i] = new JokiPremium(...);
} else {
    // Buat objek Joki biasa
    daftarJoki[i] = new Joki(...);
}
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, perulangan for digunakan untuk:

Meminta input data pelanggan sebanyak jumlah yang ditentukan oleh pengguna

Menampilkan kembali seluruh data pelanggan joki setelah input selesai

```bash
for (int i = 0; i < jumlah; i++) {
    // input data pelanggan ke-i
    ...
}

for (int i = 0; i < jumlah; i++) {
    // tampilkan data pelanggan ke-i
    daftarJoki[i].tampilkanInfo();
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini:

Input dilakukan menggunakan class Scanner untuk membaca data seperti username, tier awal, tier tujuan, dan jenis layanan (premium atau tidak).

Output ditampilkan menggunakan System.out.println() untuk menunjukkan informasi pelanggan dan total biaya.

```bash
Scanner sc = new Scanner(System.in);
System.out.print("Masukkan username: ");
String username = sc.nextLine();
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, array digunakan untuk menyimpan beberapa objek Joki yang merepresentasikan data pelanggan. Array tersebut dideklarasikan sebagai berikut:

```bash
Joki[] daftarJoki = new Joki[50];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, struktur try-catch digunakan untuk menangani kesalahan input, khususnya saat pengguna diminta memasukkan angka (seperti tier awal, tier tujuan, atau bonus winrate), tetapi malah mengetikkan huruf atau karakter lain.
```bash
try {
    System.out.print("Tier Awal (angka): ");
    tierAwal = Integer.parseInt(sc.nextLine());
} catch (NumberFormatException e) {
    System.out.println("Input tier harus berupa angka!");
}
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Achmad Vernanda Zachary Fadillah

NPM: 2310010473
