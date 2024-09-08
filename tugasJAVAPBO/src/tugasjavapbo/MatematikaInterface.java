/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasjavapbo;

/**
 *
 * @author Fardan
 */
public class MatematikaInterface {
    // Interface MatematikaInterface
interface MatematikaInterface {
    int pertambahan(int a, int b);
    int pengurangan(int a, int b);
    int perkalian(int a, int b);
    double pembagian(int a, int b);
}

// Kelas Matematika yang mengimplementasikan interface
class Matematika implements MatematikaInterface {
    @Override
    public int pertambahan(int a, int b) {
        return a + b;
    }

    @Override
    public int pengurangan(int a, int b) {
        return a - b;
    }

    @Override
    public int perkalian(int a, int b) {
        return a * b;
    }

    @Override
    public double pembagian(int a, int b) {
        return (double) a / b;
    }
}

// Kelas MatematikaBeraksi
class MatematikaBeraksi {
    public static void main(String[] args) {
        Matematika matematika = new Matematika();

        int a = 20;
        int b = 10;

        int hasilPertambahan = matematika.pertambahan(a, b);
        int hasilPengurangan = matematika.pengurangan(a, b);
        int hasilPerkalian = matematika.perkalian(a, b);
        double hasilPembagian = matematika.pembagian(21, 2);

        System.out.println("Pertambahan: " + a + " + " + b + " = " + hasilPertambahan);
        System.out.println("Pengurangan: " + a + " - " + b + " = " + hasilPengurangan);
        System.out.println("Perkalian: " + a + " * " + b + " = " + hasilPerkalian);
        System.out.println("Pembagian: 21 / 2 = " + hasilPembagian);
    }
}

}
