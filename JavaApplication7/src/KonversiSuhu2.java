/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MyPC PRO
 */
public class KonversiSuhu2 {
    // Class KonversiSuhu2 yang inherit dari KonversiSuhu
class KonversiSuhu2 extends KonversiSuhu {
    // Method untuk mengkonversi Fahrenheit ke Reamur
    public double fahrenheitToReamur(double fahrenheit) {
        return (fahrenheit - 32) * 4 / 9;
    }
}
}
