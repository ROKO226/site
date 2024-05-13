package org.example;

import database.DatabaseConnection;
import database.Song;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        DatabaseConnection.connect("songs.db");

        Song song = new Song(50, "Krawczyk", "Parostatek", 1000);

        //DatabaseConnection.insertTrack(49, "Zenek", "Spadająca gwiazda", 256);
        DatabaseConnection.disconnect();
        }
    }