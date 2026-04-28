import java.util.*;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> playlist = new LinkedList<String>();
        playlist.add("Shape of You");
        playlist.add("Believer");
        playlist.add("Perfect");
        playlist.add("Senorita");
        playlist.add("Faded");
        System.out.println("Full Playlist:");
        System.out.println(playlist);
        String firstSong = playlist.removeFirst();
        System.out.println("\nPlaying song: " + firstSong);
        System.out.println("Playlist after playing first song:");
        System.out.println(playlist);
        String lastSong = playlist.removeLast();
        System.out.println("\nSkipped song: " + lastSong);
        System.out.println("Updated Playlist:");
        System.out.println(playlist);
    }
}