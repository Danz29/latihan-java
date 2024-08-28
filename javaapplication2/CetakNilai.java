/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author Fardan
 */
public class CetakNilai {
    public static void main(String[] args) {
        // Buat objek Nilai
        Nilai nilaiMahasiswa = new Nilai("nim", "nama");

        // Isi variabel
        nilaiMahasiswa.nilaiAbsen = 80;
        nilaiMahasiswa.nilaiTugas = 90;
        nilaiMahasiswa.nilaiUTS = 85;
        nilaiMahasiswa.nilaiUAS = 88;

        // Panggil metode cetakNilai()
        nilaiMahasiswa.cetakNilai();
    }
}
