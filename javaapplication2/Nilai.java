/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author Fardan
 */
public class Nilai {
    private final String nim;
    private final String nama;
    double nilaiAbsen;
    double nilaiTugas;
    double nilaiUTS;
    double nilaiUAS;

    // Konstruktor
    public Nilai(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
    }

    // Metode menghitung nilai akhir
    public double hitungNilaiAkhir() {
        // Hitung nilai akhir berdasarkan bobot masing-masing komponen
        double nilaiAkhir = 0.1 * nilaiAbsen + 0.2 * nilaiTugas + 0.3 * nilaiUTS + 0.4 * nilaiUAS;
        return nilaiAkhir;
    }

    // Metode mencetak nilai
    public void cetakNilai() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Nilai Absen [10%]: " + nilaiAbsen);
        System.out.println("Nilai Tugas [20%]: " + nilaiTugas);
        System.out.println("Nilai UTS [30%]: " + nilaiUTS);
        System.out.println("Nilai UAS [40%]: " + nilaiUAS);
        System.out.println("Nilai Akhir: " + hitungNilaiAkhir());
    }
}
