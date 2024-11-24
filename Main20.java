public class Main20 {
    // Membuat sebuah method cekUmur() dengan variabel integer bernama umur
    static void cekUmur (int umur) {
        // jika umur kurang dari 17, cetak "Engkau masih anak sekolah"
        if (umur < 17) {
            System.out.println("Engkau masih anak sekolah");
        }
        // jika umur lebih besar atau sama dengan 17, cetak "Waktunya buat KTP"
        else {
            System.out.println("Waktunya buat KTP");
        }
    }
    public static void main(String[] args) {
        cekUmur (20);
    }
}