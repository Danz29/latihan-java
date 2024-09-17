/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MyPC PRO
 */
public class Matematika2 {
    // Class Matematika2 yang merupakan inherit dari class Matematika
class Matematika2 extends Matematika {
    // Method untuk menghitung modulus
    public int modulus(int a, int b) {
        return a % b;
    }
}

// Class MatematikaInheritance yang memanggil semua method
class MatematikaInheritance {
    public static void main(String[] args) {
        Matematika2 m2 = new Matematika2();

        // Memanggil method dari Matematika
        System.out.println("Penjumlahan: " + m2.tambah(10, 5));
        System.out.println("Pengurangan: " + m2.kurang(10, 5));
        System.out.println("Perkalian: " + m2.kali(10, 5));
        System.out.println("Pembagian: " + m2.bagi(10, 5));

        // Memanggil method dari Matematika2 (modulus)
        System.out.println("Modulus: " + m2.modulus(10, 3));
    }
}
}
