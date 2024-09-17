/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MyPC PRO
 */
public class Matematika {
    // Class Matematika (soal dari pertemuan 2)
class Matematika {
    // Method untuk menambahkan
    public int tambah(int a, int b) {
        return a + b;
    }

    // Method untuk mengurangi
    public int kurang(int a, int b) {
        return a - b;
    }

    // Method untuk mengalikan
    public int kali(int a, int b) {
        return a * b;
    }

    // Method untuk membagi
    public int bagi(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Pembagi tidak boleh 0");
        }
        return a / b;
    }
}
}
