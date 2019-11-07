package pbo1.pkg10118033.latihan60;

import java.util.Scanner;

public class Aksi extends Akatsuki implements Senjata, Jurus{
    private String senjata, jurus;
    
    public Aksi () {
        int pilih = pilihKarakter();
        switch (pilih) {
            case 1:
                this.id = 1;
                this.nama = "Pain";
                this.asal = "Amegakure";
                this.cincin = "零 (\"Nol\",\"Tidak ada\")";
                this.posisiCincin = "Jempol kanan";
                this.rekan = "Konan";
                break;
            case 2:
                this.id = 2;
                this.nama = "Konan";
                this.asal = "Amegakure";
                this.cincin = "白 (\"Putih\")";
                this.posisiCincin = "Jari Tengah, Tangan Kanan";
                this.rekan = "Pain";
                break;
            case 3:
                this.id = 3;
                this.nama = "Kakuzu";
                this.asal = "Takigakure";
                this.cincin = "北 (\"Utara\")";
                this.posisiCincin = "Jari tengah kiri";
                this.rekan = "Hidan";
                break;
            case 4:
                this.id = 4;
                this.nama = "Hidan";
                this.asal = "Yugakure";
                this.cincin = "三 (\"Tiga\")";
                this.posisiCincin = "Telunjuk kiri";
                this.rekan = "Kakuzu";
                break;
            case 5:
                this.id = 5;
                this.nama = "Deidara";
                this.asal = "Iwagakure";
                this.cincin = "青(\"Biru/Hijau\")";
                this.posisiCincin = "Telunjuk kanan";
                this.rekan = "Sasori";
                break;
            case 6:
                this.id = 6;
                this.nama = "Sasori";
                this.asal = "Sunagakure";
                this.cincin = "玉 (\"Virgo\")";
                this.posisiCincin = "Jempol kiri";
                this.rekan = "Orochimaru (dulu), Deidara";
                break;
            case 7:
                this.id = 7;
                this.nama = "Itachi Uchiha";
                this.asal = "Konohagakure";
                this.cincin = "朱 (\"Merah Darah\")";
                this.posisiCincin = "Jari manis kanan";
                this.rekan = "Kisame";
                break;
            case 8:
                this.id = 8;
                this.nama = "Kisame Hoshigaki";
                this.asal = "Kirigakure";
                this.cincin = "南 (\"Selatan\")";
                this.posisiCincin = "Jari manis kiri";
                this.rekan = "Itachi";
                break;
            case 9:
                this.id = 9;
                this.nama = "Tobi (Obito Uchiha)";
                this.asal = "Konohagakure";
                this.cincin = "玉 (\"Berlian\")";
                this.posisiCincin = "Jempol kiri";
                this.rekan = "Deidara";
                break;
            case 10:
                this.id = 10;
                this.nama = "Orochimaru";
                this.asal = "Konohagakure";
                this.cincin = "空 (\"Langit\")";
                this.posisiCincin = "Jari Kelingking Kiri";
                this.rekan = "Sasori";
                break;
            case 11:
                this.id = 11;
                this.nama = "Zetsu";
                this.asal = "";
                this.cincin = "";
                this.posisiCincin = "";
                this.rekan = "";
                break;
            default:
                break;
        }
    }
    
    @Override
    public int tampilSenjata() {
        System.out.println("\n==========Pilih Senjata=========");
        System.out.println("--------------------------------");
        System.out.println("1.) Kunai");
        System.out.println("2.) Pedang Samehada");
        System.out.println("3.) Sabit Bermata Tiga");
        System.out.println("4.) Kertas");
        System.out.println("5.) Tanah Liat");
        System.out.print("\nPilih Senjata : ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    @Override
    public int tampilJurus() {
        System.out.println("\n===========Pilih Jurus==========");
        System.out.println("--------------------------------");
        System.out.println("1.) Shinra Tensei");
        System.out.println("2.) Amaterasu");
        System.out.println("3.) Suiton : Suikodan no Jutsu");
        System.out.println("4.) Kagebunshin no Jutsu");
        System.out.println("5.) Katon : Gokakyuu no Jutsu");
        System.out.print("\nPilih Jurus : ");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    @Override
    public void keluarkanSenjata(int pilih) {
        switch (pilih) {
            case 1:
                System.out.println("\n" + getNama() + " mengeluarkan Kunai");
                break;
            case 2:
                if (getId() != 2) System.out.println(getNama() + " tidak bisa mengeluarkan Samehada karena sedang digunakan Kisame");
                else System.out.println(getNama() +" mengeluarkan Samehada");
                break;
            case 3:
                if (getId() != 4) System.out.println(" tidak bisa mengeluarkan Sabit Bermata tiga karena sedang digunakan Hidan");
                else System.out.println(getNama() + " mengeluarkan Sabit Bermata Tiga");
                break;
            case 4:
                if (getId() != 2) System.out.println(getNama() + " tidak bisa mengeluarkan kertas karena habis dipakai Konan");
                else System.out.println(getNama() + " mengeluarkan Kertas");
                break;
            case 5:
                if (getId() != 5) System.out.println(getNama() + " tidak bisa mengeluarkan tanah liat karena Deidara sedang sibuk membuat seni");
                else System.out.println(getNama() + " mengeluarkan Bom Tanah Liat");
                break;
            default:
                break;
        }
    }

    @Override
    public void keluarkanJurus(int pilih) {
        if (pilih == 1) {
            if (getId() != 1) System.out.println(getNama() + " tidak bisa mengeluarkan Shinra tensei karena tidak mempunyai Rinnegan");
            else System.out.println(getNama() + " mengeluarkan Shinra Tensei dan melempar objek di sekitarnya");
        }
        if (pilih == 4) {
            System.out.println(getNama() + " menggunakan jurus Kagebunshin untuk menggandakan dirinya");
        }
    }    
}