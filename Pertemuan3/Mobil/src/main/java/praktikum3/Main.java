/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3;

/**
 *
 * @author hp
 */
public class Main {
    public static void main(String[] args) {
        // Membuat dua objek dari class Mobil
        Mobil mobil1 = new Mobil("BMW", "330i", 2024, "Alpine White");
        Mobil mobil2 = new Mobil("McLaren", "720S", 2024, "Ventura Orange");

        // Menampilkan informasi kedua objek
        System.out.println("Informasi Mobil Riding:");
        mobil1.displayInfo();
        System.out.println();
        
        System.out.println("Informasi Mobil Racing:");
        mobil2.displayInfo();
        System.out.println();

        // Menyalakan mesin untuk kedua mobil
        mobil1.startEngine();
        mobil2.startEngine();

        // Mengubah warna mobil dan menampilkan informasi baru
        mobil1.setWarna("Black Sapphire Metallic");
        System.out.println();
        System.out.println("Informasi Mobil Riding Setelah Perubahan Warna:");
        mobil1.displayInfo();
    }
}

