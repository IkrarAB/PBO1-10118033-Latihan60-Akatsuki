package pbo1.pkg10118033.latihan60;

public class Akatsuki extends Menu{

    @Override
    public int pilihKarakter() {
        return super.pilihKarakter();
    }
    
    @Override
    public void tampilBio() {
        System.out.println("\n=============Biodata Karakter============");
        System.out.println("----------------------------------------");
        System.out.println("Nama \t\t: " + getNama());
        System.out.println("Asal \t\t: " + getAsal());
        System.out.println("Cincin \t\t: " + getCincin());
        System.out.println("Posisi Cincin \t: " + getPosisiCincin());
        System.out.println("Rekan \t\t: " + getPartner());
    }
}