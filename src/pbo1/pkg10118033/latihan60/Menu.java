package pbo1.pkg10118033.latihan60;

import java.util.Scanner;

public abstract class Menu {
    protected String nama, asal, cincin, posisiCincin, rekan;
    protected int id;
    
    public Menu() {
        System.out.println("=====Daftar Anggota Akatsuki======");
        System.out.println("----------------------------------");
        System.out.println("1.) Pain");
        System.out.println("2.) Konan");
        System.out.println("3.) Kakuzu");
        System.out.println("4.) Hidan");
        System.out.println("5.) Deidara");
        System.out.println("6.) Sasori");
        System.out.println("7.) Itachi");
        System.out.println("8.) Kisame");
        System.out.println("9.) Tobi");
        System.out.println("10.) Orochimaru");
        System.out.println("11.) Zetsu");
    }

    public String getNama() {
        return nama;
    }

    public String getAsal() {
        return asal;
    }

    public String getCincin() {
        return cincin;
    }

    public String getPosisiCincin() {
        return posisiCincin;
    }

    public String getPartner() {
        return rekan;
    }

    public int getId() {
        return id;
    }
       
    public int pilihKarakter() {
        System.out.print("\nPilih Karakter : ");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
    
    public abstract void tampilBio();
}