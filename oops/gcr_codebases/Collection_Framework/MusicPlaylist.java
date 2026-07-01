package Assignment;

import java.util.LinkedList;

public class MusicPlaylist {

    static LinkedList<String> playlist = new LinkedList<>();

    // Add song
    public static void playSong(String song) {

        playlist.addFirst(song);

        if (playlist.size() > 10) {
            playlist.removeLast();
        }

        System.out.println(song + " added to Recently Played.");
    }

    // Search song
    public static void searchSong(String song) {

        if (playlist.contains(song))
            System.out.println(song + " is in Recently Played.");
        else
            System.out.println(song + " not found.");
    }

    // Display playlist
    public static void displayPlaylist() {

        System.out.println("\nRecently Played Songs:");

        for (String song : playlist)
            System.out.println(song);
    }

    public static void main(String[] args) {

        playSong("Believer");
        playSong("Shape of You");
        playSong("Perfect");
        playSong("Faded");
        playSong("Closer");
        playSong("Levitating");
        playSong("Heat Waves");
        playSong("Senorita");
        playSong("Peaches");
        playSong("Unstoppable");
        playSong("Bones"); // Removes oldest song

        searchSong("Perfect");

        displayPlaylist();
    }
}