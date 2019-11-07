
/**
 * 
 * @author 
 * NAMA  : Ikrar Anugrah Bastary
 * KELAS : PBO1
 * NIM   : 10118033
 * Deskripsi Program : Program ini berisi program untuk menampilkan program
 *                     Akatsuki.
 *  
 */

package pbo1.pkg10118033.latihan60;

public class PBO110118033Latihan60 {
    public static void main(String[] args) {
        Aksi akatsuki = new Aksi();
        akatsuki.tampilBio();
        int pilihSenjata = akatsuki.tampilSenjata();
        int pilihJurus = akatsuki.tampilJurus();
        akatsuki.keluarkanSenjata(pilihSenjata);
        akatsuki.keluarkanJurus(pilihJurus);
    }
}