/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasjavapbo;

/**
 *
 * @author Fardan
 */
public class BingoSong {
     private String dogName;

    // Konstruktor untuk menginisialisasi nama anjing
    public BingoSong(String dogName) {
        this.dogName = dogName;
    }

    // Metode untuk mencetak lirik dengan tanda klakson
    public void printLyricsWithClaps() {
        String[] lyrics = {
            "There was a farmer who had a dog,",
            "And " + dogName + " was his name-o.",
            "B-I-N-G-O",
            "B-I-N-G-O",
            "B-I-N-G-O",
            "And " + dogName + " was his name-o."
        };

        for (String line : lyrics) {
            System.out.println(line);
        }

        // Tanda klakson
        for (int i = 0; i < dogName.length(); i++) {
            System.out.print("(clap)-");
        }
        System.out.println(dogName);
    }

    public static void main(String[] args) {
        BingoSong bingo = new BingoSong("Bingo");
        bingo.printLyricsWithClaps();
    }
}
