/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MyPC PRO
 */
public class DemoKonversiSuhu {
    // Class DemoKonversiSuhu
class DemoKonversiSuhu {
    public static void main(String[] args) {
        KonversiSuhu2 konversi = new KonversiSuhu2();

        // Mengkonversi dari Celcius ke Fahrenheit
        double celcius = 25;
        System.out.println("Celcius ke Fahrenheit: " + konversi.celciusToFahrenheit(celcius));

        // Mengkonversi dari Celcius ke Reamur
        System.out.println("Celcius ke Reamur: " + konversi.celciusToReamur(celcius));

        // Mengkonversi dari Fahrenheit ke Reamur
        double fahrenheit = 77;
        System.out.println("Fahrenheit ke Reamur: " + konversi.fahrenheitToReamur(fahrenheit));
    }
}
}
