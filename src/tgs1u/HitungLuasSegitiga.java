package tgs1u; // Mendefinisikan nama paket 

import java.util.Scanner; //Mengimpor kelas Scanner dari paket java.util untuk input dari pengguna
/**
 *
 * @author Ni Kadek Dwi Pratiwi
 * Nim = 2201010051
 * Kelas = U
 */
public class HitungLuasSegitiga { //Deklarasi kelas HitungLuasSegitiga
    public static void main(String[] args) { //Deklarasi metode main yang akan dijalankan pertama kali saat program dijalankan
        Scanner input = new Scanner(System.in); //Membuat objek Scanner untuk membaca input dari pengguna
        
        System.out.println("Program Menghitung Luas Segitiga"); // Mencetak pesan ke layar
        System.out.print("Masukkan Nilai Alas: "); // Mencetak pesan permintaan input alas
        double alas = input.nextDouble(); // Membaca input alas dari pengguna
        
        System.out.print("Masukkan Nilai Tinggi: "); // Mencetak pesan permintaan input tinggi
        double tinggi = input.nextDouble(); // Membaca input tinggi dari pengguna
        
        double luas = hitungLuasSegitiga(alas, tinggi); // Memanggil metode hitungLuasSegitiga dengan parameter alas dan tinggi, dan menyimpan hasilnya
        
        System.out.println("Luas Segitiga: " + luas); // Mencetak hasil perhitungan luas segitiga
    }
    
    public static double hitungLuasSegitiga(double alas, double tinggi) { // Deklarasi metode hitungLuasSegitiga dengan parameter alas dan tinggi
        return 0.5 * alas * tinggi; // Menghitung luas segitiga dan mengembalikan hasilnya
    }
}
